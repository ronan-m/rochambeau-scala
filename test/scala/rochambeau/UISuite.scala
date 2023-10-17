package rochambeau

import org.scalatest.funsuite.AnyFunSuite

class UISuite extends AnyFunSuite {

  private val game = new Game()

  test("User input should be converted to Rock") {
    assertResult(Rock)(UI(game).userInputToHand("Rock").get)
    assertResult(Rock)(UI(game).userInputToHand("rock").get)
    assertResult(Rock)(UI(game).userInputToHand("r").get)
    assertResult(Rock)(UI(game).userInputToHand("R").get)
  }

  test("User input should be converted to Paper") {
    assertResult(Paper)(UI(game).userInputToHand("Paper").get)
    assertResult(Paper)(UI(game).userInputToHand("paper").get)
    assertResult(Paper)(UI(game).userInputToHand("p").get)
    assertResult(Paper)(UI(game).userInputToHand("P").get)
  }

  test("User input should be converted to Scissors") {
    assertResult(Scissors)(UI(game).userInputToHand("Scissors").get)
    assertResult(Scissors)(UI(game).userInputToHand("scissors").get)
    assertResult(Scissors)(UI(game).userInputToHand("S").get)
    assertResult(Scissors)(UI(game).userInputToHand("s").get)
  }

  test("Invalid input should be converted to None") {
    assertResult(None)(UI(game).userInputToHand(" ").getOrElse(None))
    assertResult(None)(UI(game).userInputToHand("").getOrElse(None))
    assertResult(None)(UI(game).userInputToHand("a").getOrElse(None))
  }

}
