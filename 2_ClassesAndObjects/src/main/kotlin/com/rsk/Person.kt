package com.rsk

import java.lang.Exception

interface Signatory {
    fun sign()
}

open class Person(val name : String, var age : Int, var isMarried: Boolean = false) : Signatory {
    init {
        if (age > 30) throw Exception("Too Old")
    }

    var partnerName : String = ""

    override fun sign() = println("$name who is $age can sign documents and their marital status is $isMarried")

    companion object {
        @JvmStatic
        fun main(args : Array<String>) {
            val p = Person("Cody Static", 23, true)
            p.sign()
            p.age = 33
            p.sign()
            p.partnerName = "Alice"
            println("Partner name is ${p.partnerName}")
            p.partnerName = "Bob"
            println("Partner name is ${p.partnerName}")
        }
    }
}

class Student(name : String, age : Int) : Person(name, age)

data class User(val name : String, val id : Int)

fun main(args : Array<String>) {
    val p = Person("Cody", 23)
    p.sign()

    p.age = 33
    p.sign()

    val kevin = User("Kevin", 1)
    println(kevin)

    val (name, id) = kevin
    println("User is $name and their id is $id")

    val otheruser = kevin.copy(id = 2)
    println(otheruser)
}
