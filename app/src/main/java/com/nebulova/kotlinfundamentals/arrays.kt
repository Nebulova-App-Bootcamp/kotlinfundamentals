package com.nebulova.explicationkotlinfundamentals

fun main(){
   //val numbers :IntArray = intArrayOf(1,2,3,4,5,6)

    //val numbers = intArrayOf(1,2,3,4,5,6)

    val numbers = arrayOf(1,2,3,4,5,6)

    println(numbers.contentToString())

    /*
    Ejercicio: Barrer todos los datos de la lista con un ciclo for
     */
    for(element in numbers){
       // println(element)
        println("${element + 2}")
    }


    /*
    Ejercicio cambiar los numero de la posicion 1, 3 y 5 e imprimir los datos de la lista
     */

    numbers[0] = 3
    numbers[2] = 7
    numbers[4] = 8

    println("Los valores de la lista actualmente son: ${numbers.contentToString()}")

    /*
    Ejercicio: Realizar una lista como la anterior de valores double y cambiar las posiciones 1, 3 y 5 e imprimir la lista
     */

    val numbersD : DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0,6.0)

    for (element in numbersD){
        println(element)
    }

    numbersD[0] = 3.0
    numbersD[2] = 7.0
    numbersD[4] = 8.0

    println("Los valores de la lista de Double actualmente son: ${numbersD.contentToString()}")

    val days = arrayOf("Lun", "Mar", "Mie", "Jue", "Vie", "Sab", "Dom")
    println(days.contentToString())

    val fruits = arrayOf(Fruit("Manzana", 2.5), Fruit("Platano", 3.0), Fruit("Pera", 4.0))
    println(fruits.contentToString())
    println(fruits.indices)


    //Barrer con un ciclo for los "name" de cada una de las frutas

    for(fruit in fruits){
        println("${fruit.name}")

    }

    for (index in fruits.indices){
        println("${fruits[index].name} está en el índice $index")
    }
    val mix = arrayOf("Dom", 1,2,3,4, Fruit("Platano", 4.0))

    println(mix.contentToString())

}

data class Fruit(val name: String, val price: Double)