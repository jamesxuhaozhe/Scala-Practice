package com.haozhexu.scala

object Upper {
  def main(args: Array[String]): Unit = {
    args.map(_.toUpperCase()).foreach(println("%s", _))
  }
}
