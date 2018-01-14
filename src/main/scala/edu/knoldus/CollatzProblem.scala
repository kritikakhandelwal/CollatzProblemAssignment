package edu.knoldus

import scala.collection.mutable.ListBuffer

class CollatzProblem {

  def collatz(num: Int, list: ListBuffer[Int], isFirst: Boolean): ListBuffer[Int] = {

    if (num == 1) {
      list += num
      return list
    }
    if (isContain(num, list)) {

      if (list(0) == num)
        return list
      else
        collatz(num, list.tail, false)
    }
    else {

      if (isFirst) {

        getList(num, ListBuffer[Int]())
      }
      else
        getList(num, list)
    }
  }

  def getList(num: Int, list: ListBuffer[Int]): ListBuffer[Int] = {
    num % 2 match {
      case 0 => collatz(num / 2, list += num, false)
      case 1 => collatz((3 * num + 1), list += num, false)
    }
  }
  def isContain(num: Int, list: ListBuffer[Int]): Boolean = {

    list.foreach {
      x: Int => if (x == num) true
    }
    false
  }
}



