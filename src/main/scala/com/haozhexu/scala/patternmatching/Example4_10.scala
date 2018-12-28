package com.haozhexu.scala.patternmatching

object Example4_10 {
  def main(args: Array[String]): Unit = {
    def doSeqMatch[T](seq: Seq[T]): String = seq match {
      case Nil => "Nothing"
      case head +: _ => head match {
        case _ : String => "String"
        case _ : Double => "Double"
        case _ => "unmatched Seq"
      }
    }

    val result = for {
      seq <- Seq(
        Seq(1.1, 2.3, 5.6, 4.5),
        Seq("one", "two", "three"),
        Nil
      )
    } yield {
      seq match {
        case stuff: Seq[_] => (s"seq ${doSeqMatch(stuff)}", stuff)
        case _ => (s"Unknown seq", seq)
      }
    }

    println(result)
  }
}
