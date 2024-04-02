# Scotland Yard Game Implementation 🕵️‍♂️

## Overview

Scotland Yard is a riveting detective board game brought to life through a sophisticated Java 17 and Maven-based implementation 🖥️. This digital rendition faithfully captures the essence of the classic game 🎲, where players navigate the streets of London 🇬🇧, either as detectives on the hunt or as the elusive Mr. X evading capture. The game leverages modern software engineering principles, including Graph Algorithms, Design Patterns like Visitor and Observer, and advanced Java features such as Generics and anonymous classes, to create a dynamic and engaging experience.

## Implementation

The development of Scotland Yard was methodically structured into five crucial phases, each focusing on a core aspect of the game's functionality:

- **MyGameState Constructor and Accessors:** Initiating the game's state with essential attributes including the game setup, Mr. X, detectives, remaining players, and the game's current log. This phase laid the foundation for the game's logic and data management 🚀.
- **Player Movement:** A critical feature allowing players to traverse the game's map through nodes, implemented via graph algorithms to simulate the complex network of London's transportation system 🚕🚇.
- **Advance Method:** Utilizing the Visitor Pattern, this method updates the game state based on player moves, demonstrating a nuanced application of design patterns to facilitate game logic evolution 🔄.
- **Winner Determination:** Implements logic to ascertain the game's outcome based on the positions of Mr. X and the detectives, the availability of moves, and the completion of Mr. X's log 🏆.
- **Observer Pattern Integration:** A sophisticated implementation that enables dynamic game state observation, allowing for real-time updates and interactions with the game model 🔍.

## Key Components

- **MyGameStateFactory Class:** Acts as a factory for creating GameState instances, embodying the Factory Pattern. This class is pivotal for initializing game states with comprehensive attributes, ensuring a robust and flexible game setup process 🏭.
- **Get Available Moves:** This functionality discerns possible single and double moves for players, encapsulating the strategic element of navigating London's intricate map to outmaneuver opponents 🗺️.
- **Visitor Pattern & Advance Method:** A showcase of the Visitor Pattern's power, this method facilitates the application of diverse move strategies, updating the game state in a polymorphic and extensible manner 🧩.
- **Determine the Winner:** A complex logic flow that applies game rules to identify the winner under various scenarios, from capturing Mr. X to successfully evading the detectives throughout the game ⚖️.
- **Observer Pattern:** Ensures a decoupled and interactive game model, allowing for event-driven updates and notifications that enrich the gameplay experience 📣.

## Technical Highlights

- **Graph Algorithms:** At the heart of player movement and map representation, aiming to showcase a more distinct algorithmic thinking 📊.
- **Design Patterns:** The use of Visitor and Observer patterns not only adheres to best practices but also highlights the project's design sophistication, enabling scalability and maintenance 🛠️.
- **Advanced Java Features:** Leveraging Generics for type-safe collections and anonymous classes for succinct event handling and state updates, aiming to demonstrate a deeper understanding of the Java programming language 📚.
