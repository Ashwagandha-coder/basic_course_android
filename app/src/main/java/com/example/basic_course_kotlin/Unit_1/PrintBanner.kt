package com.example.basic_course_kotlin.Unit_1

fun main() {

    val border = "!"
    val timeToRepeat = 25

    printBanner(border, timeToRepeat)
    println("Happy Birthday, Jhansi!")
    printBanner(border, timeToRepeat)

}


fun printBanner(border: String, timeToRepeat: Int) {

    repeat(timeToRepeat) {
        print(border)
    }
    println()


}