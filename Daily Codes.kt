//eg: var name: String = "Sudhiksha"


//fun main(args: Array<String>){
      var a =40
     print(a)
}


// fun main() {
//     var name: String = "Car"
//     println(name)
//     val a= 20
//     println(a)
//     var c= 40
//     var d: String
//     println(c)
//     var message="Good morning" // local variable
//     println(message)
    
// }
/*class Person{
    var kotlin ="hello"
    fun info()
    {
        println(kotlin)
        
    }
}
fun main(){
    val person= Person()
    person.info()
}*/


//STRING INTERPOLATION
/*fun main(){
    val a= 10
    val b=20
    val result="Sum of $a and $b is ${a+b}" // string interpolation
    println(result)
}*/



// CHARACTER DATA TYPE
/*fun main(){
    val letter: Char
    letter ='A'
    print("$letter")
    print('\n') //prints in new line
    print('\$')// prints the $ symbol
   
    print('\\') // prints \ symbol
    
}*/

// RAW STRING
/*fun main(){
    val x: String= """
    Sudhiksha
    sudhiksha
    sudhiksha
    sudhiksha
    sudhiksha"""
    print(x)
    val y: String ="""
        sudhiksha
            sudhiksha
                sudhiksha"""
    print(y)
    val z: String="""
                 
                 sudhiksha
          sudhiksha      sudhiksha
                 sudhiksha"""
    print(z)
    
}*/


//ARRAYS
fun main(){
    val numbers = arrayOf(1,2,3,4,5)
    val words: Array<String> = arrayOf("Kotlin","Sudhiksha")
    val squares = Array(5){i-> i*i}
    println(numbers)
    println(words)
    println(squares)
    
}
