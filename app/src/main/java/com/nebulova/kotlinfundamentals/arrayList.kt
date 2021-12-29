package com.nebulova.explicationkotlinfundamentals

fun main(){
    val arrayList = ArrayList<String>()

    arrayList.add("One")
    arrayList.add("Two")

    println(arrayList)

    for (i in arrayList){
        print(i)
    }
    println()
    println(arrayList[1])

    /*
    Escriba un programa que agregue cinco números (double) a una arrayList y luego calcule el promedio
 de esos números. Utilice un bucle for (in) en este ejercicio.
     */


    val myArrayList: ArrayList<Double> = ArrayList()

    myArrayList.add(13.444)
    myArrayList.add(23.544)
    myArrayList.add(54.333)
    myArrayList.add(67.9999)
    myArrayList.add(35.6534)
    var total = 0.0
    println(myArrayList)

    for(i in myArrayList){
        total += i
    }
    println(total)

    var promedio = total / myArrayList.size
    println("mi promedio es: $promedio")
}