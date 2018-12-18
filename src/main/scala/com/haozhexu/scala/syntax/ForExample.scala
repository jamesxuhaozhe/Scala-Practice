package com.haozhexu.scala.syntax

object ForExample {
  def main(args: Array[String]): Unit = {
    val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund",
                         "Scottish Terrier", "Great Dane", "Portuguese Water Dog")
    for (breed <- dogBreeds) {
      println(breed)
    }

    for (i <- 1 to 10) println(i)

    for (breed <- dogBreeds if breed.contains("Terrier")) println(breed)

    for (breed <- dogBreeds
    if breed.contains("Terrier")
    if !breed.startsWith("Yorkshire")) println(breed)

    for (breed <- dogBreeds if breed.contains("Terrier") && !breed.startsWith("Yorkshire")) println(breed)

    val filteredBreeds = for {
      breed <- dogBreeds
      if breed.contains("Terrier") && !breed.startsWith("Yorkshire")
    } yield breed

    val dogBreeds1 = List(Some("Doberman"), None, Some("Yorkshire Terrier"),
      Some("Dachshund"), None, Some("Scottish Terrier"), None, Some("Great Dane"), Some("Portuguese Water Dog"))
    println("first pass: ")
    for {
      breedOption <- dogBreeds1
      breed <- breedOption
      upcasedBreed = breed.toUpperCase()
    } println(upcasedBreed)

    println("second pass: ")
    for {
      Some(breed) <- dogBreeds1
      upcasedBreed = breed.toUpperCase()
    } println(upcasedBreed)
  }
}
