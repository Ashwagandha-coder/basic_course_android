package com.example.basic_course_kotlin.Unit_1

fun main() {

    printBanner()
    println("Happy Birthday, Jhansi!")
    printBanner()

}


fun printBanner() {

    repeat(23) {
        print("=")
    }
    println()


}