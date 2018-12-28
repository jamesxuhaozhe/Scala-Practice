package com.haozhexu.scala.patternmatching

object Example4_11 {

  def main(args: Array[String]): Unit = {

    sealed abstract class HttpMethod() {
      def body: String
      def bodyLength = body.length
    }

    case class Connect(body: String) extends HttpMethod
    case class Get(body: String) extends HttpMethod
    case class Put(body: String) extends HttpMethod

    def handle(method: HttpMethod) = method match {
      case Connect(body) => s"connect: ${body.length} $body"
      case Get(body) => s"body: ${body.length} $body"
      case Put(body) => s"body: ${body.length} $body"
    }

    val methods = Seq(
      Connect("connect.... "),
      Get("get...."),
      Put("Put....")
    )

    methods foreach{method => println(handle(method))}
  }


}

