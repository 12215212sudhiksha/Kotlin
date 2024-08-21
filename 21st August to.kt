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
