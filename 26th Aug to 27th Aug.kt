// 26th Aug...
//control statements
fun main(){
    var temperature = 25 
    if(temperature > 20){
        println("It's a warm day")
    }
     val age = 20
    if(age>18){
        println("Adult")
    }
    else{
        println("Not an Adult")
    }
     
     val marks = 95
    if(marks>= 90){
        println("A")
       
    }
    else if( marks>= 80){
        println("B")
    }
    else if(marks>=70){
        println("C")
    }
    else{
        println("D")
    }
    // calculator 
    val num1= 5
    val num2 = 10
    val operators = "*"
    
    if (operators=="+"){
        println("Result: ${num1+num2}")
    }
    else if(operators == "-"){
        println("Result: ${num2-num1}")
    }
    else if(operators == "/"){
        if (num1 != 0){
            println("Result:${num2/num1}")
        }
        else{
            println("Error")
        }
    }
    else if(operators=="*"){
        println("Result: ${num1* num2}")
    }
    
    val agee= 15 
    if(agee < 13){
        println("child")
    }
    else if(agee in 13..19){ // imp
        println("teenager")
        
    }
    else{
        println("Adult")
    }
    
    // when
    val  dayofweek = 6
    val dayname = when(dayofweek){
        1 ->"Mon"
        2 -> "Tue"
        3-> "Wed"
        4 -> "Thur"
        5 -> "Fri"
        6-> "Sat"
        7-> "Sun"
        else -> "Invalid day"
    }
    
    println(dayname)
     val number =8
    when{
        number % 2== 0 -> println("$number is even")
        number % 2 != 0 -> println("$number is odd")
        else ->println("Invalid")
    }
    
    //------------------------------------------------------------------------------------------------------------------------------------------------------
}
//---------------------------------------------------------------------------------------------------------------------------------------------------------
//27th Aug

