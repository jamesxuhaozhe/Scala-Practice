package com.haozhexu.scala.syntax

object IfExample {
  def main(args: Array[String]): Unit = {
    if (2 + 2 == 5) {
      println("Hello from 1984.")
    } else if (2 + 2 == 3) {
      println("Hello from Remedial Math class?")
    } else {
      println("Hello from a non-Orewellian future.")
    }

    val configFile = new java.io.File("Somefile.txt")

    val configFilePath = if (configFile.exists()) {
      configFile.getAbsolutePath
    } else {
      configFile.createNewFile()
      configFile.getAbsolutePath
    }
  }
}
