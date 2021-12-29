package com.nebulova.explicationkotlinfundamentals

fun main(){

    //Sets
    val colors = setOf("orange", "blue", "pink","green", "orange", "pink", "Black")
    println(colors)
   // println(colors.size)


//    val comp = object: Comparator<String>{
//        override fun compare(s1: String, s2: String) : Int{
//            return s1.compareTo(s2)
//        }
//    }
//
//    sortedSetOf(comp, "aasdf", "bas")
//
//    println(comp)

    val set = listOf("a", "c", "b").toSortedSet { s1, s2 -> s1.compareTo(s2) }
    println(set)

    val newColors = colors.toMutableList()
    newColors.add("Yellow")
    newColors.add("pink")
    println(newColors)
    println(newColors.elementAt(3))

    //Maps

    val days = mapOf(0 to "Lunes", "pedro" to "Martes", 3 to "Miercoles")
    println(days)
    println(days["pedro"])

    /*
    Ejercicio: Imprime con un ciclo for cada una de las llaves del mapa anterior
    */

    for (key in days.keys){
       // println(days.keys)
        println("$key es ${days[key]}")
    }

    // days[0]= "other"

    val newDays = days.toMutableMap()
    newDays[0] = "Other"
    newDays[3] = "Valor"

    println(newDays)


    val fruitsMap = mapOf("Favourite" to FruitsMap("Manzana", 2.0), "Ok" to FruitsMap("Orange", price = 1.0))

    println(fruitsMap)
    println(fruitsMap["Favourite"])

    for(key in fruitsMap.keys){
        println("$key es ${fruitsMap[key]}")
    }


}


data class FruitsMap(val name: String, val price: Double)