package com.haozhexu.scala.patternmatching

object PatterMatching2 {
  def main(args: Array[String]): Unit = {
    val nonEmptySeq = Seq(1, 2, 3, 4, 5)
    val emptySeq = Seq.empty[Int]
    val nonEmptyList = List(1, 2, 3, 4, 5)
    val emptyList = Nil
    val nonEmptyVector = Vector(1, 2, 3, 4, 5)
    val emptyVector = Vector.empty[Int]
    val nonEmptyMap = Map("one" -> 1, "two" -> 2, "three" -> 3)
    val emptyMap = Map.empty[String, Int]

    val list0 = List(1, 2, 3, 4, 5, 7, 7, 9)
    val emptyList0 = Nil
    val map0 = Map("one" -> 1, "two" -> 2, "three" -> 3)

    def windows2[T](seq: Seq[T]): String = seq match {
      case head1 +: head2 +: tail => s"($head1, $head2), " + windows2(tail)
      case head +: tail => s"($head, _), " + windows2(tail)
      case Nil => "Nil"
    }

    for (seq <- Seq(list0, emptyList0, map0.toList)) {
      println(windows2(seq))
    }

    def setToString[T](seq: Seq[T]): String = seq match {
      case head +: tail => s"$head +: " + setToString(tail)
      case Nil => "Nil"
    }

    for (seq <- Seq(
      nonEmptySeq, emptySeq, nonEmptyList, emptyList,
      nonEmptyVector, emptyVector, nonEmptyMap.toSeq, emptyMap.toSeq)) {
      println(setToString(seq))
    }

    val list1 = List(1, 2, 3, 4, 5)
    val list2 = Nil

    def listToString2[T](seq: Seq[T]): String = seq match {
      case head :: tail => s"($head :: ${listToString2(tail)})"
      case Nil => "(Nil)"
    }


  }
}
