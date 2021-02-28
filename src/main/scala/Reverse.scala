import io.StdIn.readLine

object Reverse extends App{

  /**
   * function that returns reverse of a list
   * @param list
   * @tparam A
   * @return List[A]
   */

  def reverseList[A](list: List[A]): List[A] = list match {
    case value :: tail => reverseList(tail) ::: List(value)
    case Nil => Nil
  }

  /**
   * function that returns reverse the string
   * @param string
   * @return String
   */
  def reverseString(string: String):String=
    (for(i <- string.length-1 to 0 by -1) yield string(i)).mkString

  /**
   * list of String
   */
  val listOfString=List("Assignment","Scala","First","Jagdish")
  //list of Int
  val listOfInt=List(0,1,2,3,4,5,6,7,8,9)

  /**
   * reverse of list and then reverse of each string of list
   */
  val reverseOfValuesOfList=reverseList(listOfString).map(x=>reverseString(x))
  println("You will be getting reverse of the following :")
  println(listOfString)
  println(listOfInt)
  print("Enter a string to get reverse : ")

  /**
   * String input from user
   */
  val input=readLine()

  /**
   * reverse of string entered by user
   */
  println(s"Reverse of (${input}) is "+reverseString(input)+".")

  /**
   * reverse of list of Int
   */
  println(s"Reverse of ${listOfInt}"+" is "+reverseList(listOfInt)+".")

  /**
   * reverse of list of String
   */
  println(s"Reverse of ${listOfString}"+" is "+reverseList(listOfString)+".")

  /**
   * reverse of whole list of string
   */
  println(s"Reverse of whole list of ${listOfString}"+" is "+reverseOfValuesOfList+".")
}
