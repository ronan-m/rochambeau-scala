import org.scalatest.funsuite.AnyFunSuite
import rochambeau.{Paper, Rock, Scissors}

class HandSuite extends AnyFunSuite {

  test("First hand is beaten") {
    assertResult(true)(Rock.isBeatenBy(Paper))
    assertResult(true)(Paper.isBeatenBy(Scissors))
    assertResult(true)(Scissors.isBeatenBy(Rock))
  }

  test("First hand is not better") {
    assertResult(false)(Rock.isBeatenBy(Rock))
    assertResult(false)(Paper.isBeatenBy(Paper))
    assertResult(false)(Scissors.isBeatenBy(Scissors))
  }

  test("First hand is better") {
    assertResult(false)(Rock.isBeatenBy(Scissors))
    assertResult(false)(Paper.isBeatenBy(Rock))
    assertResult(false)(Scissors.isBeatenBy(Paper))
  }

}
