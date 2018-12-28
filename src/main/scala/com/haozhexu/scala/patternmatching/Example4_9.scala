package com.haozhexu.scala.patternmatching

object Example4_9 {
  def main(args: Array[String]): Unit = {
    case class Address(street: String, city: String, country: String)
    case class Person(name: String, age: Int, address: Address)

    val James = Person("James", 29, Address("james st", "Changzhou0", "China"))
    val Adam = Person("Adam", 29, Address("Adam", "Changzhou1", "China"))
    val Phil = Person("Phil", 29, Address("Phil", "Changzhou2", "China"))

    for (person <- Seq(James, Adam, Phil)) {
      person match {
        case p @ Person("James", _, _) => println(p.name, p.age, p.address)
        case p @ Person(_, 29, a @ Address(_, "Changzhou1", _)) => println(p.name, a.city)
        case other => println("fuck I don't know")
      }
    }
  }
}
