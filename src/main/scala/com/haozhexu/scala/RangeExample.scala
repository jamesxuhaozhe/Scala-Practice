package com.haozhexu.scala

import scala.collection.immutable.NumericRange

class RangeExample {

  def main(args: Array[String]): Unit = {
    val range: Range = 1 to 10

    val range1 = 1 to 10

    val range2 = 1 to 10

    val range3 = 10 to 1 by -3

    val range4 = 1L to 10L by 3

    val range5: NumericRange[Long] = 1L to 100L by 3

    val range6 = 1.1f to 10.3f by 3.1f

    val range7: NumericRange[Float] = 1.1f to 10.3f by 3.1f

    val range8 = 1.1 to 10.3 by 3.1

    val range9: NumericRange[Double] = 1.1 to 10.3 by 3.1

    val range10 = 'a' to 'g' by 3

    val range11: NumericRange[Char] = 'a' to 'g' by 3

    val range12 = BigInt(1) to BigInt(10) by 3

    val range13: NumericRange[BigInt] = BigInt(1) to BigInt(10) by 3

    val range14 = BigDecimal(1.1) to BigDecimal(10.3) by 3.1

    val range15: NumericRange[BigDecimal] = BigDecimal(1.1) to BigDecimal(10.3) by 3.1
  }

}
