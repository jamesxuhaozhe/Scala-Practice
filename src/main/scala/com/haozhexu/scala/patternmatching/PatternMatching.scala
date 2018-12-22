package com.haozhexu.scala.patternmatching

object PatternMatching {
  def main(args: Array[String]): Unit = {
    val bools = Seq(true, false)
    for (bool <- bools) {
      bool match {
        case true => println("Got heads")
        case false => println("Got tails")
      }
    }

    for (bool <- bools) {
      val which = if (bool) "head" else "tail"
      println("Got " + which)
    }

    for {
      x <- Seq(1, 2, 2.7, "one", "two", 'four)
    } {
      val str = x match {
        case 1 => "int 1"
        case i: Int => "other int: " + i
        case d: Double => "a double : " + d
        case "one" => "String one"
        case s: String => "other string" + s
        case unexpected => "unexpected value: " + unexpected
      }
      println(str)
    }
  }
}
