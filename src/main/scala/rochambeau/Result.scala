package rochambeau

trait Result

case object Win extends Result {
  override def toString: String = "Player 1 wins!"
}

case object Lose extends Result {
  override def toString: String = "Player 1 loses."
}

case object Draw extends Result {
  override def toString: String = "It's a draw."
}