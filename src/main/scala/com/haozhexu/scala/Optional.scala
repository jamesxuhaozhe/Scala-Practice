package com.haozhexu.scala

object Optional {
  def main(args: Array[String]): Unit = {
    val statesCapitals = Map(
      "Alabama" -> "Montgomery",
      "Alaska" -> "Juneau",
      "Wyoming" -> "Cheyenne")

    println("Get the capitals wrapped in Options:")
    println("Alabama: " + statesCapitals.get("Alabama"))
    println("Wyoming: " + statesCapitals.get("Wyoming"))
    println("Unknown: " + statesCapitals.get("Unknown"))
    
    println("Get the capitals themselves out of the Options")
    println("Alabama: " + statesCapitals.get("Alabama").get)
    println("Wyoming: " + statesCapitals.get("Wyoming").getOrElse("oops1"))
    println("Wyoming: " + statesCapitals.getOrElse("Wyoming", "oops2"))
    println("Unknown: " + statesCapitals.get("Unknown").getOrElse("oops3"))
    println("Unknown: " + statesCapitals.getOrElse("Unknown", "oops4"))
  }
}
