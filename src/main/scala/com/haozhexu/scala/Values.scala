package com.haozhexu.scala

class Values {

  def main(args: Array[String]): Unit = {
    //Integers
    val anInt = 3
    val anotherInt: Int = 3

    //Floating point
    val aDouble = 4.0
    val anotherDouble: Double = 4.0

    //Character
    val aCharacter = 'a'
    val anotherCharacter: Character = 'a'

    //Strings
    val aString = "Haozhe Xu"
    val anotherString: String = "Haozhe Xu"

    //Symbols
    val aSymbol = 'foo
    val anotherSymbol: Symbol = 'foo

    //xml element
    //val anXMLElement = <a>{aString}</a>
    // Tuple
    val aPair = (aString, aDouble)
    // explicit tuple declare
    val anotherTuple: Tuple2[String, Double] = (aString, aDouble)
    // with syntatic sugar
    val anotherPair: (String, Double) = (aString, aDouble)

    //List
    val aList = List(1, 2, 3, 4)
    val anotherList: List[Int] = List(1, 2, 3, 4)

    //Ranges
    val aRange = 1 to 5
    val anotherRange: Range = 1 to 5

    //Maps
    val aMap = Map(3 -> "foo", 4 -> "bar")
    val anotherMap: Map[Int, String] = Map(3 -> "foo", 4 -> "bar")

    //Sets
    val aSet = Set(1, 2, 3, 4, 5)
    val anotherSet: Set[Int] = Set(1, 2, 3, 4, 5)

    //Unit
    val aUnit = ()
    val anotherUnit: Unit = ()

    //Null
    val aNull = null
  }

}
