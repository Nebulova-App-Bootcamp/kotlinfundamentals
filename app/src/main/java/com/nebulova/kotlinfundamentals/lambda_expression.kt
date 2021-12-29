package com.nebulova.explicationkotlinfundamentals

fun main(){
    addNumber(5, 6)
    val c = sum(12, 4)
    println(c)
}

fun addNumber(a: Int, b: Int){
    val add = a + b
    println(add)
}

val sum: (Int, Int) -> Int = {a: Int, b: Int -> a + b}