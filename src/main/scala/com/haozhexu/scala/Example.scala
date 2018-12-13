package com.haozhexu.scala

class Example {

  def main(args: Array[String]): Unit = {
    val James = new Person("James", 29)

    println(James.name + James.age)
  }

  class Person(val name: String, var age: Int)

}
