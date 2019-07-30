

object accecpt2items {     //create object of scala
  def main(args:Array[String])  // def keyword to define function
  {  
    for(i<-1 until 2)   // loop 2-1 = 1
    {
      
      println("What do you can to buy?") //display to standard output
      val items = scala.io.StdIn.readLine() // input string
      println("How many kilogram do you want?")  // display again 
      val kilo = scala.io.StdIn.readFloat()  // input number as float
      println("Item:" + items) // display Item: with items
      println("Weight:" + kilo)  // display Weight: with kilo
      println("What is the second stuff do you want to buy?")  // display to standard output
      val items1 = scala.io.StdIn.readLine() // input string
      println("How many kilogram do you want?") // display again
      val kilo1 = scala.io.StdIn.readFloat() // input number as float
      println("Item1:" + items1) //display Item1: with items
      println("Weight1:" + kilo1) //display Weight1: with kilos1
      
      println("#_________________________________________________________#")
      println("Total Items:" + items +" and "+ items1) // display 2 items
      println("Total weight:" + functionresult(kilo, kilo1))  // call function functionresult(a,b)
      } 
  }
  def functionresult(a: Float, b: Float) : Float = // function for return result sum
  {
    var sum: Float = 0  // declare sum = 0
    sum = a + b // a is kilo and b is kilo1
    return sum // return to function
  }
}