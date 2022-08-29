package com.example.basic_course_kotlin.Unit_1

fun main() {

    val age = 5
    val layers = 5

     printCakeCandles(age)
     printCakeTop(age)
     printCakeBottom(age, layers)



}

fun printCakeCandles(age: Int) {

    print(" ")
    repeat(age) {
        print(",")
    }
    println()

    print(" ")
    repeat(age) {
        print("|")
    }
    println()


}

fun printCakeTop(age: Int) {

    repeat(age + 2) {
        print("=")
    }

    println()

}


fun printCakeBottom(age: Int,layers: Int) {

    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }


}

