package Hello

import java.util.*

open class hello{

    var a = 0
    var b = 0
    var array = 5 downTo 1
    var l = 123L
    var arr = arrayOf(1,2,3)
    var arr2 = Array(5, {i -> i * i})

    init{

    }

    constructor(){

    }

    constructor(a:Int, b:Int){
        this.a = a
        this.b = b
    }

    open fun say(){
        println("hello kotlin")
    }

    open fun add(a: Int, b: Int) = a + b

    fun printNotNull(input : String){
        println(input)
    }

    fun printNull(input : String?){
        println(input)
    }

    fun testDownTo(){
        var k: Double= 1.0
        var j = array.iterator()
        for(i in 1..5)
            println(j.nextInt())
    }

    fun testWhen(input : Int){
        when(input){
            1 -> println(1)
            2 -> println(2)
            3 -> println(3)
            4 -> println(4)
            else -> printNotNull("123")
        }
    }

    fun testListFilter(input: ArrayList<Int>){
        var i = input.filter { p -> p > 5 }
        println(i)
    }

    fun testLet(input : Int){
        a = input
        a?.let { println("a is not null") }
    }

    fun testString(){
        var string: String = "1+1"
        println("${string.length}")
    }
}




