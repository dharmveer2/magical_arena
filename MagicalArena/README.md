
## Requirements

- Java 8 or later
- JUnit 5 (for testing)

## Setup

1. Clone the repository.

```bash
git clone <repository-url>
cd MagicalArena

## Running the game
javac -d out/production/classes src/main/java/*.java
java -cp out/production/classes Main


## Runing test
javac -cp .;path/to/junit-5.7.1.jar src/test/java/*.java
java -cp .;path/to/junit-5.7.1.jar org.junit.runner.JUnitCore GameTest
