package Basics

/**
  * Created by Sagar on 13-08-2016.
  */
class Examples {

  def gcd(x: Int, y: Int): Int = {

    // Use of 'if' condition in Scala
    if(y == 0) x else gcd(y, x%y)

  }

  def forTestInScala(): Unit = {

    // Scala's for loop can take collection as input and iterate through it
    val filesHere = (new java.io.File(".")).listFiles
    for(file <- filesHere)
      println(file)

    // Scala for loop can also filter its subset and can iterate over it.
    // if condition is valid to use in Scala's for loop.
    for(file <- filesHere if file.getName.endsWith(".iml"))
      println("filter the .iml files: " + file)


    // We can have multiple conditions in a for loop
    for(file <- filesHere
      if file.isFile
      if file.getName.startsWith(".iml")
    ) println(file)

  }

}
