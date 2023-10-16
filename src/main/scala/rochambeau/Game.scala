package rochambeau

import scala.util.Random

class Game {

  def playPlayerVsComputer(playerHand: Hand): (Hand, Hand, Result) = {
    val computerHand = generateRandomHand()
    (playerHand, computerHand, play(playerHand, computerHand))
  }

  def playComputerVsComputer(): (Hand, Hand, Result) = {
    val computer1Hand = generateRandomHand()
    val computer2Hand = generateRandomHand()
    (computer1Hand, computer2Hand,  play(computer1Hand, computer2Hand))
  }

  def play(player1Hand: Hand, player2Hand: Hand): Result = {
    if (player1Hand == player2Hand) Draw
    else if (player1Hand.isBeatenBy(player2Hand)) Lose
    else Win
  }

  private def generateRandomHand(): Hand = Random.shuffle(Hand.values).head
}