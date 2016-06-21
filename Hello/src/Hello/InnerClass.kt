package Hello

fun main(args: Array<String>) {
    var innerClass = InnerClass()
    innerClass.b.foo()
    innerClass.c.foo()
    innerClass.outFun()
}

open class InnerClass() {
    var b = object : Inner(){
        override fun foo(){
            println("b.foo")
        }
    }
    var c = C

    object C : InnerClass(){
        fun foo(){
            println("c.foo")
        }
    }

    open inner class Inner {
        open fun foo(){
            println("a.foo")
        }
    }

    companion object D{
        fun foo(){
            println("companion object")
        }
    }

    /*内部函数，可以读取外部函数变量*/
    fun outFun(){
        var a = 0
        fun innerFun(){
            println("inner fun and read a is $a")
        }
        innerFun()
        println("out fun")
    }
}