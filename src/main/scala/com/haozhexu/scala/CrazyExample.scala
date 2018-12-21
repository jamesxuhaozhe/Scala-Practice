package com.haozhexu.scala

import scala.io.Source
import scala.util.control.NonFatal

object CrazyExample {
  def main(args: Array[String]): Unit = {
    args foreach(arg => countLines(arg))
  }

  object manage {
    def apply[R <: { def close(): Unit}, T](resource: => R)(f: R => T) = {
      var res: Option[R] = None
      try {
        res = Some(resource)
        f(res.get)
      } catch {
        case NonFatal(ex) => println(s"Non Fatal exception! &ex")
      } finally {
        if (res.isDefined) {
          println(s"Closing resource...")
          res.get.close
        }
      }
    }
  }

  def countLines(fileName: String) = {
    println()
    manage(Source.fromFile(fileName)) { source =>
      val size = source.getLines.size
      println(s"file $fileName has $size lines")
      if (size > 20) throw new RuntimeException("Big file!")
    }
  }

  lazy val resource: Int = init()

  def init(): Int = {
    0
  }

}
