package edu.knoldus

import org.apache.log4j.Logger

import scala.collection.mutable.ListBuffer

object CollatzProblemUsage {

  def main(args: Array[String]) {

    val log = Logger.getLogger(this.getClass());
    val list: ListBuffer[Int] = new ListBuffer[Int]
    val collatzObj = new CollatzProblem()
    do {
      println("enter  a number")
      val num: Int = Console.readInt()
      val resultList1 = (collatzObj.collatz(num, list, true))
      println(s"List Elements  $resultList1")
    } while (true)
  }
}
