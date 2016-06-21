package Hello

fun main(args: Array<String>) {
    var num: Number = 1
    println(num.toInt())

    var generic = Generic<String>("123")
    generic.print()

    generic.a = ""
    println(generic.a)
}

class Generic<T>(t: T){
    var value = t
    var a = "init"/*使用field关键字代表值*/
        get() = field + " get"
        set(value) {
            field = value + " set"
        }

    fun print(){
        println(value)
    }


}
