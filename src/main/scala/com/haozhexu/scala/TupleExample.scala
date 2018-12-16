package com.haozhexu.scala

import scala.collection.mutable

object TupleExample {
  def main(args: Array[String]): Unit = {
    val t1: (Int, String) = (1, "two")
    val t2: Tuple2[Int, String] = (1, "two")

    val t = ("Hello", 1, 2, 3.3)

    println("Print the whole tuple " + t)

    println("Print the first element " + t._1)

    println("Print the second element " + t._2)

    val (tt1, tt2, tt3) = ("World", '!', 0x22)

    val string =
      """Programming\nScala
        |He exclaimed, "Scala is great!"
        |First line\n
        |Second line\t
        |Fourth line
      """.stripMargin
  }

  def makeList(strings: String*) = {
    if (strings.length == 1) {
      List(0)
    } else {
      strings.toList
    }

    val intToStringMap: mutable.HashMap[Integer, String] = new mutable.HashMap()

    val intToStringMap1 = new mutable.HashMap[Integer, String]()

  }
}
