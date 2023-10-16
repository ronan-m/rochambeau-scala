package rochambeau

case object Hand {
  val values: List[Hand] = List(Rock, Paper, Scissors)
}

trait Hand {
  val betterHand: Hand
  val validInputs: List[String]

  def isBeatenBy(otherHand: Hand): Boolean = otherHand == betterHand
}

case object Rock extends Hand {
  override val validInputs: List[String] = List("Rock", "rock", "R", "r")
  override val betterHand: Hand = Paper
}

case object Paper extends Hand {
  override val validInputs: List[String]  = List("Paper", "paper", "P", "p")
  override val betterHand: Hand = Scissors
}

case object Scissors extends Hand {
  override val validInputs: List[String]  = List("Scissors", "scissors", "S", "s")
  override val betterHand: Hand = Rock
}