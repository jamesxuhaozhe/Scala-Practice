package com.haozhexu.scala

class Functions {

  def main(args: Array[String]): Unit = {

  }


  def incImplicit(x: Int)= x + 1

  def incExplicit(x: Int): Int = x + 1

  def anotherFunction(x: Int): Int = {
    return x + 1
  }

  def anotherFunction1(x: Int) = {
    x + 1
  }

  def anotherFunction2(x: Int): Int = {
    return x + 1
  }

  val incAnonymous = (x: Int) => x + 1

  def timesTwo(x: Int): Int = {
    println("Times Two invoked")
    x * 2
  }

  def add(m: Int, n: Int): Int = m + n

  def add2(m: Int, n: Int) = m + n


}
