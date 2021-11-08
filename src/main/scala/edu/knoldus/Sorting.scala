package edu.knoldus

class Sorting {

  def isort(xs: List[Int]): List[Int] =
    if (xs.isEmpty) Nil
    else insert(xs.head, isort(xs.tail))

  def insert(x: Int, xs: List[Int]):List[Int]={
    if (xs.isEmpty || x <= xs.head) x :: xs
    else xs.head :: insert(x,xs.tail)
  }


}

object main extends App{
  val result = new Sorting
  val L: List[Int] = List(5, 8, 9, 1, 2, 7, 6, 2, 5)
  println(result.isort(L))
}
