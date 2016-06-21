package Hello

fun main(args: Array<String>) {
    var reload = Reload()
    reload.foo()
}

class Reload{
    var a: Int = 0

    fun Int.get() : Int{
        return 123
    }

    fun foo(){
        println(a.get())
    }
}
