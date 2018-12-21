package enumeration

import Programmer._

object TestDemo {
  def main(args: Array[String]): Unit = {

    for (programmer <- Programmer.values) println(programmer.toString)

    Programmer.values filter(_.toString.startsWith("god")) foreach println

    def isGodLikeProgrammer(p: Programmer) = p.toString.startsWith("god")


    Programmer.values filter isGodLikeProgrammer foreach println
  }

}
