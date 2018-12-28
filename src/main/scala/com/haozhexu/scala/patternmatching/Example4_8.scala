package com.haozhexu.scala.patternmatching

object Example4_8 {
  def main(args: Array[String]): Unit = {
    val BookExtractorRE = """Book: title=([^,]+),\s+author=(.+)""".r
    val MagazineExtractorRE = """Magazine: title=([^,]+)\s+issue=(.+)""".r

    val catalog = Seq(
      "Book: title=Scala is Awesome, author=James",
      "Magazine: title= Scala is great, issue=James",
      "unknown catalog"
    )

    for (book <- catalog) {
      book match {
        case BookExtractorRE(title, author) => println(s"$title $author")
        case MagazineExtractorRE(title, issue) => println(s"$title, $issue")
        case _ => println("fuck, I don't know")
      }
    }
  }
}
