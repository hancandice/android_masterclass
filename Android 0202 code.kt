package eu.tutorials.helloworld

fun main(){
    // Creating instances of classes
    var denis = Person("Denis", "Panjuta")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")
}

class Person(firstName: String = "John", lastName: String = "Doe"){

    // Initializer Block
    init {
        println("Initialized a new Person object with " +
                "firstName = $firstName and lastName = $lastName ")
    }

}