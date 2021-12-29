package com.nebulova.explicationkotlinfundamentals

import java.lang.ArithmeticException
import java.lang.NullPointerException

fun main(){
    //validate(12)
    try {
       // validate(12)
  val data = 1/0
       println(data)
    } catch (e: Exception){
        println(e)
    } finally {
        println("Todo el codigo se ha ejecutado")
    }
}

fun validate(age: Int){
    if (age < 18)
        throw ArithmeticException("Edad demasiado baja")
    else
        println("Puede conducir")
}