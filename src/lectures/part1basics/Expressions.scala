package lectures.part1basics

import java.lang.String

object Expressions extends App {

  val x = 2 + 3
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>>

  println(1 == x)
  // == != > >= < <=

  println(!(1==x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 //also works with -= *= /= .... side effects
  println(aVariable)

  // Instructions (DO, are executed) vs Expressions (VALUE, are evaluated)

  // IF expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionValue)
  println(if(aCondition) 5 else 3)

  var i = 0
  val aWhile = while(i<10){
    println(i) // NEVER WRITE THIS AGAIN
    i+=1
  }
  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable=3) //Unit == void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2) "hello" else "goodbye"
  }
  //1. difference between "hello world" vs println("hello world")?
    // "hello World" is a type of String
    // println("hello world") is an expression, type = Unit, side effect
  //2.

  val someValue ={
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 900
    42
  }
}
