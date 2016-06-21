package Hello

import java.util.*

fun main(args : Array<String>){
    val hello = hello(1, 2)
    val world1 = World(1, 2)
    val world2 = World(1, 2)
    val seal = Seal(1, 2)
    var array: Array<Int> = arrayOf(1,2,3)

    seal.c = 1
    println(seal.c)
    hello.testString()
    println(hello.arr2.asList())
    println(world1.equals(world2))
    hello.say()
    hello.printNotNull("123")
    hello.printNull(null)
    hello.testDownTo()
    for(i in 1..5){
        hello.testWhen(i)
    }
    var b = 10 downTo 1 step 2
    var a : ArrayList<Int> = ArrayList(b.toList())
    hello.testListFilter(a)
    for(i in a)
        println(i)
    hello.testLet(1)
    with(hello){
        say()
        printNotNull("123")
        printNull(null)
    }
}