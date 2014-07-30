trait Shape{
  def draw()
}

case class Rectangle(length: Int,width: Int) extends Shape {
  override def draw(): Unit = println(" Drawing rectangle using length " + length + " width " + width)
}


case class Circle(radius: Int) extends Shape {
  override def draw(): Unit = println("Drawing circle using radius " + radius)
}

val shapes = Seq(new Circle(5), new Rectangle(2,3), new Rectangle(2,1))

shapes.foreach(x => x.draw())
object A {
  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      // catch Exception to catch null 's'
      case e: Exception => None
    }
  }

  val s1 = Seq(1,2,3,4,"Five","Six",7)
  val s2 = s1.map(x => x.toString).toList
  println(s2)

}
