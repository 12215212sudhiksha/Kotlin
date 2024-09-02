//28th Aug
fun sum(a:Int=10, b:Int= 20){ //Default arguments 
    val c= a+b
    println(c)
}
fun main(){
    sum(20,50)
    sum()
}

fun sum(a:Int, b:Int){
    val c= a+b
    println(c)
}
fun main(){
    sum(20,50)
    //sum() This line will give an error 
}

fun main(args: Array<String>){
    val a =10
    val b= 20 
    val c= sum(a,b)
    println(c)
}
fun sum(a:Int, b:Int):Int{
    val x= a+b
    return x
}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// create fun to convert temp from celsius fahrenhiet 
//°F = (9/5 × °C) + 32. 
// C= 5/9 x f- 32
fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9 / 5 + 32
}

fun fahrenheitToCelsius(Fahrenheit: Double): Double {
    return (Fahrenheit - 32) * 5 / 9
}


fun main() {
    val c = 20.0
    val f = celsiusToFahrenheit(c)
    println("$c degrees Celsius = $f degrees Fahrenheit.")

    val f2 = 68.0
    val c2 = fahrenheitToCelsius(f2)
    println("$f2 degrees Fahrenheit = $c2 degrees Celsius.")
}*/
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Factorial 
fun factorial(n: Int): Int {
    if (n == 0 || n == 1) {
        return 1 // Base Case
    } else {
        return n * factorial(n - 1)                   
    }
}

fun main() {
    val result = factorial(3)
    println("The factorial of 3 is: $result")
}*/

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
