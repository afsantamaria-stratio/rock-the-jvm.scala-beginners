package lectures.part1basics

object ValuesVariablesTypes extends App{

  val x: Int = 42

  println(x)

  // VALS ARE INMUTABLE

  // COMPILER can infer types

  val astring: String = "hello"

  val aBoolean: Boolean = true
  val aChar: Char = 'b'
  val anInt: Int = x
  val aShort: Short= 4000
  val aLong: Long = 333333333333333L
  val aFloat: Float = 3.2F
  val aDouble: Double = 3.2

  // variables
  var aVariable = 20
  aVariable = 30 //side effects



}
