# Rochambeau
This is an implementation of Rochambeau in Scala.

## Test/Run
Type `test` in sbt shell  to run the tests.

Type `run` in sbt shell to execute this program.

sbt (https://www.scala-sbt.org/index.html) come pre-installed with IntelliJ IDEA CE (https://www.jetbrains.com/fr-fr/idea/download/).

## UI
The UI uses the Console. I started writing this program by getting the user inputs and converting them into actions and objects. This explains why the tests do not cover the entire UI.

## Tests
ScalaTest (https://www.scalatest.org/) was used the write the tests. They cover all cases for Rock, Paper and Scissors. If you want to extend this game it'll faster to test new `Hand` by adding new tests before testing the UI.

# Design
`Game` is where the game is played whether human vs computer or computer vs computer. `Hand` contains the 3 most common hands. `UI` is where I started, it prints and get message from the Console.

## Extensions
Here I didn't name the players. Player 1 can be human or computer. Player 2 is always computer. You can create a new `Player` class with a name attribute wich might be clearer when printing the result in `UI`.
You can add variations according to https://en.wikipedia.org/wiki/Rock_paper_scissors#Variations In this case, you may want to use weights to generate random hands.
This program doesn't memorize the results.
