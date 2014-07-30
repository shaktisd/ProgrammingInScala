object A {
  case class Money(amount: Int, currency: String) {
    def + (that: Money): Money = { Money(amount = this.amount + that.amount,currency = this.currency) }
  }
  val someMoney = Money(10,"USD")
  val moreMoney = Money(20,"USD")
  someMoney + moreMoney
  val amounts = List(Money(10,"USD"),Money(2,"EUR"),Money(20,"GBP"),Money(75,"EUR"),Money(100,"USD"),Money(50,"USD"))
  amounts.filter(x => x.currency == "EUR")
  amounts.filter(_.currency == "EUR")
  val (euros,everythingElseOtherThanEuro) = amounts.partition(_.currency == "EUR")
  val wallet = Map( "EUR" -> 10, "GBP" -> 20 , "USD" -> 30)
  val mayBeSomeEuro = wallet.get("EUR")
  val mayBeSomeInr = wallet.get("INR")

  def currencyEval(input: Option[Int]):String = input match {
    case None => "I don't have it"
    case Some(value) => "I have " + value + " currency "
  }

  currencyEval(mayBeSomeEuro)
  currencyEval(mayBeSomeInr)
}