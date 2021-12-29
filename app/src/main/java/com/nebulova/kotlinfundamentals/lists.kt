package com.nebulova.explicationkotlinfundamentals

fun main(){
    /*
    Los arrays tienen un tamaño fijo y las Lists pueden modificar su tamaño dinámicamente.
    Los arrays son mutables mientras que las Lists no lo son.
     */

//    val monthsA = arrayOf("Enero", "Febrero", "Marzo")
//    println(monthsA)
//    val monthsB = listOf("Enero", "Febrero", "Marzo")
//    println(monthsB)

    val months = listOf("Enero", "Febrero", "Marzo")
    println(months.size)

    val anyTypes = listOf(1,2,3, true, false, "String")
    println(anyTypes.size)
    println(anyTypes[4])


    val newMonths = listOf("Octubre", "Noviembre", "Diciembre")

    val additionalMonths = months.toMutableList()

    println(additionalMonths)

   // months.addAll(newMonths)

    additionalMonths.addAll(newMonths)

    println(additionalMonths)

    additionalMonths.add("Julio")
    println(additionalMonths)

    // println(months)

    val otherMonths = arrayOf("Abril", "Mayo")


    additionalMonths.addAll(otherMonths)

    println(additionalMonths)
    println(months)

    /*
    Ejercicio: En base al apartado anterior inicializar una lista con 3 dias de la semana y agregar
    los elementos restantes añadiendolos a la lista inicial
     */

    val days = mutableListOf<String>("Lunes", "Martes", "Miercoles")

    println(days)

    days.add(3, "Jueves")

    println(days)

    val newDays = arrayOf("Viernes", "Sabado", "Domingo")
    days.addAll(newDays)

    println(days)


    days.removeAt(6)
    println(days)

    val removeList = mutableListOf<String>("Lunes", "Martes")
    days.removeAll(removeList)
    println(days)

    days.removeAt(1)
    println(days)

    days.removeAll(days)
    println(days)



}