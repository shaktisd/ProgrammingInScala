
object TraitsExample {
  class Point(val x: Int, val y: Int)

  trait RectangularShape {
    def topLeft: Point

    def bottomRight: Point

    def width = bottomRight.x - topLeft.x

    def length = bottomRight.y - topLeft.y
  }
/*
  case class Rectangle(val topLeft: Point, val bottomRight: Point) extends RectangularShape{
    override def topLeft: Point = ???
    override def bottomRight: Point = ???
  }
*/

}