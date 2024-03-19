package uk.ac.bris.cs.scotlandyard.model;

import com.google.common.collect.ImmutableList;
import javax.annotation.Nonnull;
import com.google.common.collect.ImmutableSet;

import uk.ac.bris.cs.scotlandyard.model.ScotlandYard.Factory;

import java.util.HashSet;
import java.util.Set;

/**
 * cw-model
 * Stage 2: Complete this class
 */

public final class MyModelFactory implements Factory<Model> {
	@Nonnull
	@Override
	public Model build(GameSetup setup, Player mrX, ImmutableList<Player> detectives) {
		Set<Model.Observer> observerSet = new HashSet<>();
		MyGameStateFactory theGame = new MyGameStateFactory();
		Board.GameState gameState = theGame.build(setup, mrX, detectives);
		Model model = new Model() {
			Board.GameState modelState = gameState;

			@Nonnull
			@Override
			public Board getCurrentBoard() {
				return this.modelState;
			}

			@Override
			public void registerObserver(@Nonnull Observer observer) {
				if (observer.equals(null)) {
					throw new NullPointerException("Observer cannot be null!");
				}
				for (Observer s : observerSet) {
					if (s.equals(observer)) {
						throw new IllegalArgumentException("Duplicate observer!");
					}
				}
				observerSet.add(observer);
			}

			@Override
			public void unregisterObserver(@Nonnull Observer observer) {
				if (observer.equals(null)) {
					throw new NullPointerException("Observer cannot be null!");
				}
				if (observerSet.contains(observer) == true) {
					observerSet.remove(observer);
				} else {
					throw new IllegalArgumentException("Cannot unregister a nonexistent observer!");
				}
			}

			@Nonnull
			@Override
			public ImmutableSet<Observer> getObservers() {
				return ImmutableSet.copyOf(observerSet);
			}

			@Override
			public void chooseMove(@Nonnull Move move) {
				this.modelState = this.modelState.advance(move);
				Observer.Event event;
				if (this.modelState.getWinner().isEmpty() == true) {
					event = Observer.Event.MOVE_MADE;
				} else {
					event = Observer.Event.GAME_OVER;
				}
				for (Observer o : observerSet) {
					o.onModelChanged(this.modelState, event);
				}
			}
		};
		return model;
	}
}