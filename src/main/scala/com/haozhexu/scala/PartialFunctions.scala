package com.haozhexu.scala

class PartialFunctions {

  val pf1: PartialFunctions = {case s: String => "YES"}

  def main(args: Array[String]): Unit = {
    val p1 = new MyPoint(x = 3.3, y = 4.4)

    val p2 = MyPoint(x = 3.3, y = 4.4)

    val p3 = p2.copy(y = 6.6)

    val circle = Circle(MyPoint(0.0, 0.0), 2.0)
    circle.draw(MyPoint(1.0, 2.0))(str => println(s"ShapesDrawingActor: $str"))
    circle.draw(MyPoint(1.0, 2.0)){str => println(s"drawing: $str")}
    circle.draw(){str => println(s"drawwing: $str")}
  }

  case class MyPoint(x: Double = 0.0, y: Double = 0.0) {
    def shift(deltax: Double = 0.0, deltay: Double = 0.0) = copy(x + deltax, y + deltay)
  }

  abstract class Shape() {
    def draw(offset: MyPoint = MyPoint(0.0, 0.0))(f: String => Unit): Unit =
    f(s"draw(offset=$offset), ${this.toString}")
  }

  case class Circle(center: MyPoint, radius: Double) extends Shape

  case class Rectangle(lowerLeft: MyPoint, height: Double, width: Double) extends Shape


}
