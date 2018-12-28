package com.haozhexu.scala.patternmatching

import com.haozhexu.scala.patternmatching.Example4_7.WhereOp

object Example4_7 {


  import Op._

  case class WhereOp[T](columnName: String, op: Op, value: T)
  case class WhereIn[T](columnName: String, value1: T, value2: T*)

  val wheres = Seq(
    WhereIn("state", "IL", "CA", "VA"),
    WhereOp("state", EQ, "IL"),
    WhereOp("name", EQ, "Buck Trends"),
    WhereOp("age", GT, 29)
  )

  for (where <- wheres) {
    where match {
      case WhereIn(col, val1, vals @ _*) =>
        val valStr = (val1 +: vals).mkString(", ")
        println(s"WHERE $col IN ($valStr)")
      case WhereOp(col, op, value) => println(s"WHERE $col $op $value")
      case _ => println("unknown statement")
    }
  }
}

object Op extends Enumeration {
  type Op = Value

  val EQ = Value("=")
  val NE = Value("!=")
  val LTGT = Value("<>")
  val LT = Value("<")
  val LE = Value("<=")
  val GT = Value(">")
  val GE = Value(">=")
}



