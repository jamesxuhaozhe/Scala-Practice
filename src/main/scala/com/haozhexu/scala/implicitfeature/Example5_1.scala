package com.haozhexu.scala.implicitfeature

object Example5_1 {
  def main(args: Array[String]): Unit = {
    def calcTax(amount: Float)(implicit rate: Float): Float = amount * rate

    object SimpleStateSalesTax {
      implicit val rate: Float = 0.05F
    }

    case class ComplicatedSalesTaxData(baseRate: Float, isTaxHoliday: Boolean, storeId: Int)

    object ComplicatedSalesTax {
      private def extractRateForStore(id: Int): Float = {
        0.1F
      }

      implicit def rate(implicit cstd: ComplicatedSalesTaxData): Float = if (cstd.isTaxHoliday) 0.0F else cstd.baseRate + extractRateForStore(cstd.storeId)
    }

    {
      import SimpleStateSalesTax.rate
      val amount = 100F
      println(s"${calcTax(amount)}")
    }

    {
      import ComplicatedSalesTax.rate
      implicit val myStore = ComplicatedSalesTaxData(0.06F, false, 1010)
      println(s"${calcTax(100F)}")
    }

    case class MyList[A](list: List[A]) {
      def sortBy1[B](f: A => B)(implicit order: Ordering[B]): List[A] =
        list.sortBy(f)(order)

      def sortBy2[B : Ordering](f: A => B): List[A] = list.sortBy(f)[Ordering[B]]
    }

  }
}
