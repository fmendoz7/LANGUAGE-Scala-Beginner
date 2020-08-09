package Lectures.Part1Basics

// 'Extends App' basically makes a main class for use
object ValuesVariablesTypes extends App {

  val x: Int = 42
  val y = 24
  println(x)

  /*
      DATA TYPE: Val
        - Cannot be reassigned a value
        - Thought of as CONSTANT/IMMUTABLE
        - Types of vals are optional (compiler can infer, make sure it matches)
  */
  //x = 2

  //Could use the ; to have multiple LOC on one line
  val aString: String = "hello"; val anotherString = "goodbye"

  /*
      DATA TYPE: Boolean
        - Booleans are NOT capitalized
  */
  val aBoolean: Boolean = false
}
