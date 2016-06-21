package Hello

fun main(args: Array<String>) {
    var op = Operator()
    op.foo()
    println(op.a)
}

class Operator{
    var a = 1
    var b = 2

    fun foo(){
        a += b
    }

    operator fun plusAssign(a: Int) : Unit{
        println("plus assign")
    }
}
