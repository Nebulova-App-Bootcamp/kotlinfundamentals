package com.nebulova.explicationkotlinfundamentals

import java.lang.Exception
import kotlin.math.PI
import kotlin.math.ceil


/*
Crear una lista de personas, con su nombre y edad. Seleccionar ¿quién es la mayor?
 */
//val personas = listOf(Persona("Jose", 24), Persona("Alicia", 32), Persona("Pedro", 41))
//
//   val mayor = personas.maxOf { it.edad ?: 0 }
//    println(mayor)
//
//    val menor = personas.minOf { it.edad ?:0 }
//    println(menor)
//    /*
//    Si queremos buscar dentro de la lista a una persona.
//     */
//
//    BuscarPersona(personas, "persona")
//
//
//}
//
//fun BuscarPersona(gente: List<Persona>, nombre: String){
//    for(persona in gente){
//        if(persona.nombre == nombre){
//            println("LA HE ENCONTRADO!")
//            return
//        }
//    }
//
//    println("No está en la lista")
//}
//
//class Persona(val nombre: String, val edad: Int? = null)

/*

Crear la función llamada suma que va a recibir dos números de uno de tipo doble y el otro de tipo float, los cuales va a sumar y retornara el resultado.
Crear una función llamada redondeo que va a recibir un número de tipo doble redondeará hacia arriba y mostrará el resultado.
Crear una función llamada muestra resultado que recibirá un número de tipo doble y le dará un formato de moneda y lo mostrará.
 */


//fun main(){
//var resSuma = suma(22.234, 54F)
//    println(resSuma)
//
//    var resRedondeo = redondeo(resSuma)
//    println(resRedondeo)
//
//    mostrar(resRedondeo)
//}
//
//fun suma(num1: Double, num2:Float) : Double{
//    var resultado = num1 + num2
//
//    return resultado
//}
//
//fun redondeo(num:Double):Double{
//    var redondeo = Math.ceil(num)
//    return redondeo
//}
//
//fun mostrar(num: Double){
//    println(String.format("$%.2f", num))
//}


/*
Si yo me emborracho con 2 Litros de cerveza y un baso mide 6 cm de diámetro y 10 cm de altura.
¿Cuanto vasos debo tomar para emborracharme? Sabiendo que la formula del volumen de un cilindro es
V=πr2h. donde el radio es igual a r=d/2.
 */

//fun main(){
//    try{
//        println("Oyee! Con cuantos litros de alcohol te emborrachas: ")
//        var litrosBorracho = readLine()!!.toDouble()
//
//        var miliLitrosBorracho = litrosBorracho*1000
//        println("¿Cuanto es el diámetro del vaso?: ")
//        var diametro = readLine()!!.toDouble()
//        println("¿Cual es la altura del vaso?: ")
//        var altura = readLine()!!.toDouble()
//
//        var radio = diametro/2
//
//        var volumen = PI*radio*2*altura
//        var limiteVasos = miliLitrosBorracho/volumen
//
//        println("¿Cuantos vasos te has tomado?: ")
//        var vasosTomados = readLine()!!.toDouble()
//
//
//        if(vasosTomados >= limiteVasos){
//            println("Ya has bebido suficiente")
//        }
//        else{
//            println("Te faltan ${limiteVasos - vasosTomados} vasos para estar borracho")
//        }
//    }
//    catch (e:Exception){
//        println("Parece que ya estas borracho -.- ")
//    }
//}
/*
Realizar un sistema bancario que reciba y entregue dinero y va a tener las siguientes opciones:
1.- Ver saldo
2.- Ingresar dinero
3.- Sacar dinero
4.- Salir
 */

//fun main(){
//    println("Bienvenido al Banco!")
//    println("Ingresa alguna de estas opciones: ")
//    println("1.- Ver Saldo")
//    println("2.- Ingresar dinero")
//    println("3.- Sacar dinero")
//    println("4.- Salir")
//
//    try {
//        var opcion = readLine()!!.toInt()
//        var saldo = 100.00
//
//        when(opcion){
//            1->{
//                println("Tu saldo es $saldo")
//            }
//            2->{
//                println("¿Cuanto dinero vas a ingresar?")
//                var dineroIngresar= readLine()!!.toDouble()
//                saldo=saldo+dineroIngresar
//                println("Operacion realizada con éxito!\nTu saldo es $saldo")
//            }
//            3->{
//                println("¿Cuánto dinero vas a sacar?")
//                var dineroSacar= readLine()!!.toDouble()
//                if((saldo-dineroSacar)<0){
//                    println("No tienes tanto dinero!!\nTu saldo es de: $saldo")
//                }else{
//                    saldo= saldo-dineroSacar
//                    println("Operación realizada con éxito!\nTu saldo es $saldo")
//                }
//            }
//            4->{
//                println("Nos vemos en la siguiente ocasión! :)")
//            }
//            else->{
//                println("Esta opción no es valida")
//            }
//
//        }
//
//    }catch (e:Exception){
//        println("Operacion incorrecta $e")
//    }
//}

/*
Calcule la venta de 3 productos de una tienda
Pregunte si deseamos redondear los centimos.
Si se acepta el redondeo agradecer por el redondeo y mostrarlo.
Si no acepta no hacer nada.
 */

fun main(){
    println("¡Bienvenido a nuestra tienda!")
    try {
        println("Ingrese el valor del producto 1: ")
        var prod1 = readLine()!!.toDouble()
        println("Ingrese el valor del producto 2: ")
        var prod2 = readLine()!!.toDouble()
        println("Ingrese el valor del producto 3: ")
        var prod3 = readLine()!!.toDouble()

        var suma = prod1 + prod2 + prod3
        println("¿Deseas redondear los cent? S/N")
        var respuesta = readLine()
        if ((respuesta=="S") or (respuesta == "s")){
            var totalMasRedondeo= ceil(suma)
            var redondeo = totalMasRedondeo-suma
            println("Gracias por redondear %.2f".format(redondeo))
        }

    }catch (e:Exception){
        println("Cometiste algún error")
    }
}