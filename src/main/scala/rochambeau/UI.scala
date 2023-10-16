package rochambeau

import scala.io.StdIn

case class UI(game: Game) {

  def play(): Unit = {
    println(
      """
        |Let's play Rochambeau!
        |
        |Choose the mode:
        |a) Player vs Computer
        |b) Computer vs Computer
        |...) Exit
        |>""".stripMargin)

    val userInput = StdIn.readLine().toLowerCase.strip.charAt(0)
    userInput match {
      case 'a' =>
        playerVsComputer()
      case 'b' =>
        computerVsComputer()
      case _ =>
        println("Exiting game.")
    }
  }

  private def replay(): Unit = {
    play()
  }

  private def playerVsComputer(): Unit = {
    val playerHand:Hand = getPlayerHand
    if (playerHand == null) {
      println("Invalid hand.")
      playerVsComputer()
    }
    val handsAndResult = game.playPlayerVsComputer(playerHand)
    endGame(handsAndResult)
  }

  private def computerVsComputer(): Unit = {
    val handsAndResult = game.playComputerVsComputer()
    endGame(handsAndResult)
  }

  private def getPlayerHand: Hand = {
    println(
      """Choose hand: (R)ock / (P)aper / (S)cissors
        |>""".stripMargin)
    val input = StdIn.readLine().strip()
    userInputToHand(input)
  }

  def userInputToHand(input: String): Hand = {
    if (Rock.validInputs contains input) Rock
    else if (Paper.validInputs contains input) Paper
    else if (Scissors.validInputs contains input) Scissors
    else null
  }

  private def endGame(handsAndResult: (Hand, Hand, Result)): Unit = {
    printHandsAndResult(handsAndResult)
    replay()
  }

  private def printHandsAndResult(handsAndResult: (Hand, Hand, Result)): Unit = {
    val (hand1, hand2, result) = handsAndResult
    println(
      s"""Player 1 hand: $hand1
         |Player 2 hand: $hand2
         |""".stripMargin)
    println(result)
  }

}
