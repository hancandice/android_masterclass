// Type Casts

fun main(args: Array<String>) {
    val stringList: List<String> = listof(
        "Denis", "Frank", "Michael", "Garry")
    val mixedTypeList: List<Any> = listOf(
        "Denis", 31, 5, "BDay", 70.5, "weighs", "Kg")

    for(value in mixedTypeList) {
        if (value is Int) {
            println("Integer: '$value'")
        } else if (value is Double) {
            println("Double: '$value' with Floor value ${
                Math.floor(value)}")
        }else if (value is String) {
            println("String: '$value' of length ${
                value.length} ")
        } else {
            println("Unknown Type")
        }
    }

    // ALternatively
    for(value in mixedTypeList) {
        when(value) {
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value 
            with Floor value ${Math.foor(value)}")
            is String -> println("String: '$value' 
            of length ${value.length} ")
            else -> println("Unknown Type")
        }
    }

    // SMART CAST
    val obj: Any = "I have a dream"
    if(obj !is String) {
        println("Not a String")
    } else {
        // obj is automatically cast to a String in this scope
        println("Found a String of length ${obj.length}")
    }

    // Explicit (unsafe) Casting using the "as" keyword - can go wrong
    val str: String = obj as String
    println(str.length)

    val obj: Any = 1337
    val str: String = obj as String 
    println(str)

    // Explicit (safe) casting using the "as?" keyword
    val obj: Any = 1337
    val str: String? = obj as? String // Works
    println(str)  // Prints null

    
}