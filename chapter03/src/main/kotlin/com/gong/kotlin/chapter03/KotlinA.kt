package com.gong.kotlin.chapter03

import java.util.logging.XMLFormatter

/**
 * Created by gong on 2017/6/20.
 */
class X


class A (var c:String){
    var b = 0
        get() {
            println("getB")
            return field
        }
        set(value) {
            println("setB $value")
            field = value
        }
    lateinit var d:X
    val e:X by lazy {
        println("init X")
        X()
    }
}

fun main(args: Array<String>) {
    val a = A("Hello")
    a.b = 25;
    println(a.b)
    println(a.e)

    a.d = X()
    println(a.d)

    println(a.c)
}