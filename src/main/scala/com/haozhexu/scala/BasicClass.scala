package com.haozhexu.scala

class BasicClass {

  def main(args: Array[String]): Unit = {
    val point = new Point(1, 2)
    point.move(2, 3)
  }

  class Point(xc: Int, yc: Int) {
    var x: Int = xc
    var y: Int = yc

    def move(dx: Int, dy: Int): Unit = {
      x = x + dx
      y = y + dy
      println("Point x location: " + x)
      println("Point y location: " + y)
    }
  }
}

