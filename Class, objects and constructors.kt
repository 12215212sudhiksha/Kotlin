//2nd sep 2024
class Person{
    var name: String
    var age: Int
    
    constructor(x: String, y: Int){//secondary constructor
        this.name = x
        this.age = y
    }
    constructor(x:String){
        this.name = x
        this.age =0
    }
    constructor(){
        this.name="Rahul"
        this.age= 32
    }
    fun intro(){
        println("my name is $name and age is $age")
        
    }
}
fun main(){
    var a= Person("Riya",22) // var an is object
    a.intro()// will take arguments from 1st constructor
    var b= Person()// var b is an object
    b.intro()
    var c = Person("Heena")
    c.intro()
}

//------------------------------------------------------
// using primary constructor
class Person(var name:String, var age:Int){ //primary constructor
    constructor(x:String) : this(){
        this.name = x
        this.age=0
    }
    constructor():this("rahul",50)
    fun intro(){
        println("my name is $name and age is $age")
    }
}
fun main(){
    var a= Person("Riya",22) 
    a.intro()
    var b= Person()
    b.intro()
    var c = Person("Heena")
    c.intro()
}

//-----------------------------------------------------------------------------------------------------------
open class Rectangle(val a:Double, val b:Double){
    fun area():Double{
        return a* b
    }
    open fun display(){
        println("area of rectangle us $a * $b is ${area()}")
    }
}
class Square(side:Double): Rectangle(side,side){
    override fun display(){
        println("area of square with side $a is ${area()}")
    }
}
fun main(){
    //val myrectangle= Rectangle(4.0,5.0)
    //myrectangle.display()
    //val mysquare= Square(4.0)
    //mysquare.display()
    
    val mysquare= Square(4.0)
    mysquare.display()
    val myrectangle= Rectangle(4.0,5.0)
    myrectangle.display()
    
}
