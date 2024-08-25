fun main(){
    val numbers= arrayOf(1,2,3,4,5) //1d array
    val words: Array<String> = arrayOf("jennie","Sudhiksha","rose")
    val squares = Array(5){i-> i*i} //lambda function 
    println(numbers[0])
    println(words[1])
    println(squares[2])
    val firstNumber = numbers[0]
    val secondWord = words[1]
    println("first number : $firstNumber")
    println(secondWord)
    numbers[0] =10 //modifying the value
    println(numbers[0])
    println("Modified Array:")
    for(num in numbers){ // to get the whole array
        println("$num")
    }
    
    val matrix = arrayOf(
        arrayOf(5,6,7,8,9),
        arrayOf(7,8,9,10),
        arrayOf(11,12,1,4))
    println(matrix[0][1])//creating matrix
    
}

fun main(args: Array<String>){// type conversion
    val x : Int = 100 
    val y: Long =x.toLong() 
    println(y)
}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------
//safe and unsafe casting 
fun main(){
    var a = "hi"
    var b :String = a as String
    println("unsafe casting result : $b")
    //val c :Int = a as Int
    //println("unsafe casting result: $c")// here we will get classcastexception
    val d: Int?= a as? Int
    println("safe casting: $d")
    
}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------
//homework 3d array
fun main() {
    // Create a 3D array using arrayOf
    val array3D = arrayOf(
        arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4, 5, 6),
            arrayOf(7, 8, 9)
        ),
        arrayOf(
            arrayOf(10, 11, 12),
            arrayOf(13, 14, 15),
            arrayOf(16, 17, 18)
        )
    )

    // Printing the whole array
    for (matrix2D in array3D) {
        for (row in matrix2D) {
            for (element in row) {
                print("$element ")
            }
            println()
        }
        println()
    }
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
//22nd Aug
//operators....
fun main(){
    var a = 10
    var b = 5
    val istrue= true
    val isfalse= false
    val add= a+b
    val multiplication = a*b
    val subtraction = a-b
    val div = a/b
    
    //Arithmetic operator
    println("Addition: $a + $b = $add")
    println("Multiplication: $a * $b = $multiplication")
    println("Subtraction: $a-$b= $subtraction")
    println("Division: $a/$b = $div")
    println("Modulus :$a%$b = ${a%b}")
    
    // Relational Operator
    
    val num1 = 10
    val num2 = 20

    if (num1 > num2) {
        println("$num1 is greater than $num2")
    }

    if (num1 < num2) {
        println("$num1 is less than $num2")
    }

    if (num1 >= num2) {
        println("$num1 is greater than or equal to $num2")
    }

    if (num1 <= num2) {
        println("$num1 is less than or equal to $num2")
    }

    if (num1 == num2) {
        println("$num1 is equal to $num2")
    }

    if (num1 != num2) {
        println("$num1 is not equal to $num2")
    }
    
    //Assignment Operators
    var n = 15

    n += 5  
    println("After += operation: $n") // in this the value gets updated 

    n -= 3  
    println("After -= operation: $n")

    n *= 2  
    println("After *= operation: $n")

    n /= 4  
    println("After /= operation: $n")

    n %= 3  
    println("After %= operation: $n")
    
   // unary operator 
    var s = 10
    var v = +s
    var z = -s
    var y = ++s
    var x = --s
    
    println(v)
    println(z)
    println(y)
    println(x)
    
    //logical operators 
    val result1 = istrue && isfalse
    println("Result of logical AND (istrue && isfalse): $result1") 

    // Logical OR operator ||
    val result2 = istrue || isfalse
    println("Result of logical OR (istrue || isfalse): $result2")

    // Logical NOT operator !
    val result3 = !istrue
    println("Result of logical NOT (!istrue): $result3")
    
    
    

    
}
