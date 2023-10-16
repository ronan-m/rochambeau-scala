package rochambeau

import org.scalatest.funsuite.AnyFunSuite

class UISuite extends AnyFunSuite {

  private val game = new Game()

  test("User input should be converted to Rock") {
    assertResult(Rock)(UI(game).userInputToHand("Rock"))
    assertResult(Rock)(UI(game).userInputToHand("rock"))
    assertResult(Rock)(UI(game).userInputToHand("r"))
    assertResult(Rock)(UI(game).userInputToHand("R"))
  }

  test("User input should be converted to Paper") {
    assertResult(Paper)(UI(game).userInputToHand("Paper"))
    assertResult(Paper)(UI(game).userInputToHand("paper"))
    assertResult(Paper)(UI(game).userInputToHand("p"))
    assertResult(Paper)(UI(game).userInputToHand("P"))
  }

  test("User input should be converted to Scissors") {
    assertResult(Scissors)(UI(game).userInputToHand("Scissors"))
    assertResult(Scissors)(UI(game).userInputToHand("scissors"))
    assertResult(Scissors)(UI(game).userInputToHand("S"))
    assertResult(Scissors)(UI(game).userInputToHand("s"))
  }

  test("Invalid input should be converted to null") {
    assertResult(null)(UI(game).userInputToHand(" "))
    assertResult(null)(UI(game).userInputToHand(""))
    assertResult(null)(UI(game).userInputToHand("a"))
  }

}
