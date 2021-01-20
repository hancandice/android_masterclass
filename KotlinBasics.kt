fun main() {
    println("Hello, world!!!")
    // This is a comment. Comments start with //
    // val is used for variables which are immutable (not changable)
    val myName = "Denis"
    // myName = "Michael" // ERROR: Val cannot be reassigned

    /* This is a multi line comment starts with /* and ends with *'/ without the '
     var is used for variables which are mutable/changeable.
     kotlin is a strongly typed language that supports Type Inference. 
     The compiler will directly assume the size and type to a variable by that. 
     For example, if you assign any whole number to a variable,
     the compiler will directly assume that the variable is of type Int
    */
    var myAge = 31

    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_039_812_309_487_120_394

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37
    val myDouble: Double = 3.14159265358979323846

    // Booleans he type Boolean is used to represent logical values. 
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    // not sunny anymore...
    isSunny = false
   
    // Characters
    val letterChar = 'A'
    val digitChar = '1'
    
    // Strings
    val myStr = "Hello World"
    var firCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1] 

    

    // Operators:

    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    result = result / 2
    result = result * 5
    result = result - 1
    var moduloResult = 5%2
    println( moduloResult)

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    // Concatenation - adding of "Strings"
    println("isEqual is " + isEqual)
    val isNotEqual = 5!=5
    // Kotlin has a feature called String Interpolation. 
    // This feature allows you to directly insert a template expression inside a String.
    // Template expressions are tiny pieces of code that are evaluated and 
    // their results are concatenated with the original String.
    // A template expression is prefixed with $ symbol. 
    // Following are examples of String interpolation 
    println("isNotEqual is $isNotEqual")

    println("is5Greater3 ${5 > 3}")
    println("is5LowerEqual3 ${5 >= 3}")
    println("is5LowerEqual5 ${5 >= 5}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")


    //Increment & Decrement operators (++, --)
    myNum++
    println("myNum is $myNum")
    // increments after use
    println("myNum is ${myNum++}")
    // increments before use
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")

    

    // Control Flow
    // If Statements
    var age = 17
    if(age >= 21){
        print("now you may drink in the US")
    }
    // Else If Statement - only executed if the if statement is not true
    else if(age >= 18){
        print("now you may vote")
    }
    // Else If Statement - only executed if the foregoing else if statement is not true
    else if (age >= 16){
        print("you now may drive")
    }
    // else is only executed if all of the foregoing statements weren't true
    else{
        print("you're too young")
    }

    

    // Kotlin’s "when" expression is the replacement of switch statement 
    // from other languages like C, C++, and Java. 
    // It is compact and more powerful than switch statements.
    var season = 3
    when(season) {
    1 -> println("Spring")
    2 -> println("Summer")
    3 -> println("Fall")
    4 -> println("Winter")
    else -> println("Invalid Season")
    
    var month = 3
    when(month) {
        1,2,3 -> println("Spring")
        in 4..6 -> println("Summer")
        in 7..9 -> println("Fall")
        in 10..12 -> println("Winter")
        else -> println("Invalid Season")
    }

    // challenge - translate the if statement with the age to a when expression
    when(age){
        // with the !in it's the same as saying not in ...
        !in 0..20  -> print("now you may drink in the US")
        in 18..20  -> print("now you may vote")
        in 16,17 -> print("you now may drive")
        else -> print("you're too young")
    }

    var x : Any = 13.37
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    // Loops
    // While Loop
    // While loop executes a block of code repeatedly as long as a given condition is true
    while(condition) {
        // code to be executed
    }

    var x = 1
    while(x <= 10) {
        println("$x ")
        x++
    }

    // Do while loop
    // The do-while loop is similar to while loop except that it 
    // tests the condition at the end of the loop. 
    // This means that it will at least execute the body once
    var x = 1
    do {
        print("$x ")
        x++
    } while(x <= 10)

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp == 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }


    // For Loop
    // A for-loop is used to iterate through ranges, arrays, collections, or anything 
    // that provides an iterator (You’ll learn about iterator, arrays, ranges and collections in a future lecture).
    for(num in 1..10) {
        print("$num ")
    }

    // infix notation
    for(i in 1 until 10) {	// Same as - for(i in 1.until(10))
        print("$i ")
    }

    for(i in 10 downTo 1) {	 // Same as - for(i in 10.downTo(1))
        print("$i ")
    }

    for(i in 1 until 10 step 2) { // Same as - for(i in 1.until(10).step(2))
        print("$i ")
    }

    // thi is how you call a function
    myFunction()

    addUp(5,3)
}

// The syntax of a function - fun stands for function
fun myFunction(){
    // The body of a function
    println("myFunction was called")
}

// This function has two parameters and returns a value of type Int
fun addUp(a: Int, b: Int): Int{
    // the return keyword indicates that this function will return the following value
    // once this function is called and executed
    return (a+b)
}
// Article on Kotlin words https://blog.kotlin-academy.com/kotlin-programmer-dictionary-function-vs-method-vs-procedure-c0216642ee87
// CHALLENGE: create a function that calculates the average and call it
fun avg(a: Double, b: Double): Double {
    return  (a + b)/2
}



// NULLABLES/OPTIONALS in Kotlin
// Kotlin supports nullability as part of its type System.
// That means You have the ability to declare whether 
// a variable can hold a null value or not.
// By supporting nullability in the type system,
// the compiler can detect 
// possible NullPointerException errors at compile time 
// and reduce the possibility of having them thrown at runtime.
var name: String = "Denis"
name = null // Compilation Error

var nullableName: String? = "Denis"
nullableName = null // Works

// Here name cannot/must not be null
val len = name.length 
val upper = name.toLowerCase() 

// but the same methods won't work on nullable types
val len = nullableName.length // Compilation Error
val upper = nullableName.toLowerCase()  // Compilation Error

// So how can we solve this? We could do a null check before hand

val nullableName: String? = "Denis"

if(nullableName != null) {
    println("Hello, ${nullableName.toLowerCase()}.")
    println("Your name is ${nullableName.length} characters long.")
} else {
    println("Hello, Guest")
}

// This works but seems to be quite some work...
// So how about we shorten the syntax...
// Kotlin provides a Safe call operator, ?.  
// It allows you to combine a null-check and 
// a method call in a single expression.

nullableName?.toLowerCase()

// This is the same as:
if(nullableName != null) 
    nullableName.toLowerCase()
else
    null   

// You can use methods on a nullable variable like this
val nullableName: String? = null

println(nullableName?.toLowerCase()) // prints null
println(nullableName?.length) // prints null

// You can perform a chain safe calls:
val wifesAge: String? = user?.wife?.age


// Let'S say we don’t want to print anything if 
// the variable is null?

// In order to perform an operation only if the 
// variable is not null, we can use the safe call 
// operator with let -

val nullableName: String? = null

nullableName?.let { println(it.toLowerCase()) }
nullableName?.let { println(it.length) }
// Prints nothing because there nullableName is null 
// and we used let to prevent anything from being performed


// What if we would like to enter a default value?
// Then we can use the elvis operator ?:
val name = nullableName ?: "Guest"

val wifesAge: String? = user?.wife?.age ?: 0


// Not null assertion : !! Operator
// The !! operator converts a nullable type to a 
// non-null type, and throws a NullPointerException 
// if the nullable type holds a null value.
// This is risky, and you should only use it if 
// you are 100% certain, that there will be a value in 
// the variable.
val nullableName: String? = null
nullableName!!.toLowerCase() // Results in NullPointerException


// CLASSES and OBJECTS

class Person constructor(_firstName: String, _lastName: String) { // or class Person constructor    (_firstName: String, _lastName: String) 
    // Member Variables (Properties) of the class
    var firstName: String
    var lastName: String

    // Initializer Block
    init {
        this.firstName = _firstName
        this.lastName = _lastName

        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}

// create an object like so:
// val denis = Person("Denis", "Panjuta")

// ALternatively:
class Person (_firstName: String, _lastName: String) {
    // Member Variables (Properties) of the class
    var firstName: String = _firstName
    var lastName: String = _lastName

    // Initializer Block
    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}

// Alternatively:
class Person(var firstName: String, var lastName: String) {
    // Initializer Block
    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}

// Or even:
class Person(var firstName: String = "John", var lastName: String= "Doe") {
    // Initializer Block
    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}

// Create an object:
/*
    val john = Person()
    val johnPeterson = Person(lastname: "Peterson")

*/

class Person(var firstName: String, var lastName: String) {
    var age: Int? = null
    var hobby: String = "Watch Netflix"
    var myFirstName = firstName

    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)  {
        this.age = if(age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
    }

    fun stateHobby(){
        println("$firstname \'s Hobby is: $hobby'" )
    }
}

// You can use primare or secondary Constructor to create an object

// Calls the primary constructor (Age will be null in this case)
val person1 = Person("Denis", "Panjuta")

// Calls the secondary constructor
val person2 = Person("Elon", "Musk", 48) 



// Having multiple overloads:

class Person(var firstName: String, var lastName: String) {
    var age: Int? = null
    var eyeColor: String? = null
    
    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)  {
        this.age = if(age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
    }

    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int, eyeColor: String): 
            this(firstName, lastName, age)  {
        this.eyeColor = eyeColor
    }
}


// SETTERS AND GETTERS

// User class with a Primary constructor that accepts
// three parameters
class Car(_brand: String, _model: String, _maxSpeed: Int) {
    // Properties of User class
    val brand: String = _brand         // Immutable (Read only)
    var model: String = _model  // Mutable
    var maxSpeed: Int = _maxSpeed       // Mutable
}

// Kotlin internally generates a default getter and setter for mutable properties, and a getter (only) for read-only properties.

It calls these getters and setters internally whenever 
// you access or modify a property using the dot(.) notation.
This is how it would look like internally
class Car(_brand: String, _model: String, _maxSpeed: Int) {
    val brand: String = _brand
        get() = field
    
    var model: String = _model
        get() = field
        set(value) {
            field = value
        }
    
    var maxSpeed: Int = _maxSpeed
        get() = field
        set(value) {
            field = value
        }
}

// value
// We use value as the name of the setter parameter. This is the default convention in Kotlin but you’re free to use any other name if you want.
// The value parameter contains the value that a property is assigned to. For example, when you write user.name = "Elon Musk", 
// the value parameter contains the assigned value "Elon Musk".

// 2. Backing Field (field)
// Backing field helps you refer to the property 
// inside the getter and setter methods. 
// This is required because if you use the property 
// directly inside the getter or setter then you’ll
// run into a recursive call which will generate 
// a StackOverflowError.


class Car() {

    lateinit var owner : String

    val myBrand: String = "BMW"
    // Custom getter
    get() {     
        return field.toLowerCase()
    }   
    
    
    // default setter and getter
    var myModel: String = "M5"
        private set

    var myMaxSpeed: Int = maxSpeed
        get() = field
        // Custom Setter
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("_maxSpeed must be greater than zero")
    }

    init{
        this.myModel = "M3"
        this.owner = "Frank"
    }
}

       
