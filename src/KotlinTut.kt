/** this is a practice from following a tuturial
 * NO ; semicolons
 * **/
package demo

import java.math.BigInteger
import java.util.*

fun main(args : Array<String>) {
/*
    println("Hello world!")

    val name = "Michael" //immutable and can't change variable
    var myAge = 47       // mutable and is changeable variable

    //type inference string and integer is figured out by Kotlin but can be defined.
    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest Int : " +bigInt)
    println("Smallest Int: $smallInt") //String Interpolation with $

    // Long Double, Float
    // Loss of precision with floating point numbers after 15 digits
    var dblNum1: Double = 1.11111111111111111
    var dblNum2: Double = 1.11111111111111111
    println("Sum :"+ (dblNum1 + dblNum2))


    if (true is Boolean){
        print("true is boolean \n")

    }

    var letterGrade: Char = 'A'
    println("A is a Char:: ${letterGrade is Char}")
    println("3.14 into an Int: "+ (3.14.toInt()) )

    val longStr = """ This is a long string
        |created with three quotes at the start and
        |end of the string with multiple lines...
    """.trimMargin()
    println(longStr)

    println("Strings equal: ${name.equals(letterGrade)}")
    println ("compare A to B : ${"A".compareTo("B")}")
    println("2nd Index : ${longStr[2]} and  ${longStr.get(2)}")
    println("Index from 1-7: ${longStr.subSequence(1,8)}")
    println("Contains the word created : ${longStr.contains("created")}")

    var myArray = arrayOf (1,1.23,"Michael")
    println(myArray[2])
    myArray[1] = 3.14 // change value of index
    print( " array leng : ${myArray.size}")
    println( "${myArray.contains("Michael")}")
    var partArray = myArray.copyOfRange(0,1)
    println("First index = ${myArray.first()}")
    println("Michael index at: ${myArray.indexOf("Michael")}")

    var sqArray = Array(5) { x -> x * x}
    println(sqArray[4])

    var arr2: Array<Int> = arrayOf(5,23,1971)

    val oneTo10 = 1..10
    val alpha = "A".."Z"
    println("R in alpha: ${"R" in alpha}")

    val tenTo1 = 10.downTo(1)
    val twoTo20 = 2.rangeTo(20)
    val rng3 = oneTo10.step(3)

    for(x in rng3) print(x)
    for (x in tenTo1.reversed()) println(x)

    val age = 8

    when(age){
        0,1,2,3,4 -> println("preschool")
        5 -> println("Kindergarten")
        in 6..17 -> {
            val grade = age - 5
            println("go to grade $grade")

        }
        else -> println("go to college")
    }
*/


    fun getSum(vararg nums: Int) : Int {
        var sum = 0
        nums.forEach {n -> sum += n}

        return sum
    }

    println("Sum = ${getSum(1,2,3,4,5,6,7,8,9,10)}")

    println(getFibonacciNumber(20, BigInteger("1"), BigInteger("0")))


    val number = 20
    val sum = addNumbers(number)
    println("Sum = $sum")

    var stud = Student("Michael", 10)
    println(stud.id)

    var ingredients: MutableList<String> = mutableListOf("water","flour","salt")
    println(ingredients)
    val reader = Scanner(System.`in`)
    println("Add One Ingredient Please")
    ingredients.add(reader.nextLine())
    println(ingredients)
    println("${ingredients.get(ingredients.size-1)} added to the list of ingredients")

} //end of main ///////////////////


tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger{
    return if (n==0)
        b
    else {
        //println("a: $a, b: $b")
        getFibonacciNumber(n - 1, a + b, a)
    }

}

fun addNumbers(num: Int): Int {
    if (num != 0) {
        return num + addNumbers(num - 1)
    }
    else
        return num
}

class Student( val name: String){
    var id: Int = -1
    init{
        println("Student has the name $name and the id as $id") // will print -1 still
    }
    constructor(n: String, id: Int): this(n){  // initializing in parameters of the second constructor is not allowed
        //The body of the secondary constructor is called after the init block of the first
        this.id = id
    }
}