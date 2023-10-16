package rochambeau

import org.scalatest.funsuite.AnyFunSuite

class GameSuite extends AnyFunSuite {

  val game = new Game()

  test("Player 1 should win") {
    assertResult(Win)(game.play(Rock, Scissors))
    assertResult(Win)(game.play(Paper, Rock))
    assertResult(Win)(game.play(Scissors, Paper))
  }

  test("Player 1 should lose") {
    assertResult(Lose)(game.play(Scissors, Rock))
    assertResult(Lose)(game.play(Rock, Paper))
    assertResult(Lose)(game.play(Paper, Scissors))
  }

  test("Draw") {
    assertResult(Draw)(game.play(Rock, Rock))
    assertResult(Draw)(game.play(Paper, Paper))
    assertResult(Draw)(game.play(Scissors, Scissors))
  }
}
