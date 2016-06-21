package Hello

fun main(args: Array<String>) {
    var infix = InfixNotation()
    infix.foo()
    infix.test(b = "2")
}

class InfixNotation{
    var a = 1

    fun foo(){
        a = a fuck a
        println(a)
    }

    infix fun Int.fuck (input: Int) : Int{
        a += input
        return a
    }

    fun test(a: Int = 0, b: String, c: Boolean = true){

    }
}