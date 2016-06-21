package World

fun main(args: Array<String>){
    var a = A()
    var b = B()
    b.print()
}

class A{
    var string = "AAAAA"

    fun foo(){
        println("A.foo method")
    }
}

class B{
    var a = A()
    var A.length: Int
        get() = string.length
        set(value){
            string = "BBBBBB"
        }

    fun foo(){
        a.foo()
    }

    fun print(){
        a.length = 1
        println("${a.string} : ${a.length}")
    }

    fun A.foo(){
        println("B.foo method")
    }


}
