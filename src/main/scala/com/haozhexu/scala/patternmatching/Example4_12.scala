package com.haozhexu.scala.patternmatching

object Example4_12 {
  def main(args: Array[String]): Unit = {
    case class Address(street: String, city: String, country: String)
    case class Person(name: String, age: Int)

    val address1 = Address("hehai", "Changzhou", "China")
    val address2 = Address("xinbei", "Changzhou", "China")

    val james = Person("James", 29)
    val Adam = Person("Adam", 28)

    val addresses = Seq(address1, address2)
    val people = Seq(james, Adam)

    val pas = addresses zip people

    pas map {
      tup =>
        val address = tup._1
        val person = tup._2
        println(s"${address.city} + ${person.name}")
    }

    pas map {
      case (Address(street, city, country), Person(name, age)) => s"$street  $name"
    }
  }
}
