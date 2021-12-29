package com.nebulova.explicationkotlinfundamentals

open class Base(){
    var a = 1 //publico por defecto
    private var b = 2 //privada para la clase Base
    var c = b + a
    protected open val d = 4 //Visible para la clase Base y clase Derivada
    internal val f = 20 //visible en el mismo modulo
    protected fun g(){}//Visible para la clase Base y clase Derivada

}

class Derivada : Base(){
    //a,c,d, f,g es visible
    //b no es visible

    override val d = 9
}

fun main(){
    val base = Base()
    //base.a, base.c, base.f es visible
    //base.b, base.d, base.g no es visible
    val derived = Derivada()

}