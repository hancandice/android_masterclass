package eu.tutorials.helloworld

var b = 3
fun main(){
    myFunction(5)
    b = 5
}
// this a is a parameter
fun myFunction(a:Int){
    // a is a variable
    var a = a
    b = a
    println("b is $b")
}