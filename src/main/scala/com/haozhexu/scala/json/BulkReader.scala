package com.haozhexu.scala.json

abstract class BulkReader {
  type In
  val source: In
  def read: String
}

class StringBulkReader(val source: String) extends BulkReader {
  type In = String
  def read: String = source
}


