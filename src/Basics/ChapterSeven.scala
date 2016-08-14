package Basics

/**
  * Created by Sagar on 13-08-2016.
  */
object ChapterSeven extends App {

  val examples = new Examples()
  val gdcValue =  examples.gcd(12,7)
  println("GCD is: " + gdcValue+ "\n")

  examples.forTestInScala()
  examples.grep(".*")
  examples.ExceptionHandling(4)

}
