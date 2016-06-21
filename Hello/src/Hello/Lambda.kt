package Hello

import java.util.*

fun main(args: Array<String>) {
    var lambda = Lambda()
    lambda.use()

    var array = 100 downTo 1
    var list = array.toList()
    list = list.filter { it ->  lambda.judge(it)}
    list = list.filter(fun(a) = a > 0)/*匿名函数*/

    var closure = 0
    list.filter { it > 50 }.forEach {
        closure += it/*不能修改it本身，因为是val*/
    }
    println(list)

    var mutableList: MutableList<Int> = mutableListOf(1,2,3)
    mutableList[1] = 1

    var mutable: ArrayList<Int> = arrayListOf(1)
}

class Lambda {
    var a = 1
    var b = 2

    fun use() {
        println(foo (a, b, { a, b -> bigger(3, 4) }))
        println(foo2(smaller()))/*高阶函数，用函数作为参数传递*/
        println(foo3(a, b, {a, b -> judge2(a, b)}))
        /*amazing!!!*/
        println(foo3(a = 1, inputFun = {a, b ->
            if (a > b) {
                println("a > b")
                return@foo3 true
            } else {
                println("a < b")
                return@foo3 false
            }
        }))
    }

    fun judge2(a: Int, b: Int) : Boolean{
        return a > b
    }

    fun judge(any: Any) : Boolean {
        when(any){
            is Int -> {
                if(10 < any && any < 50)
                    return true
                return false
            }
            else -> return false
        }
    }
    
    fun foo(a: Int, b: Int, inputFun: (Int, Int) -> Boolean) : Boolean {
        return inputFun(a, b)
    }

    fun foo2(inputFun: Boolean): Boolean {
        return inputFun
    }

    fun foo3(a: Int = this.a, b: Int = this.b, inputFun: (Int, Int) -> Boolean) : Boolean {
        return inputFun(a, b)
    }

    fun bigger(a: Int, b: Int) : Boolean{
        return a > b
    }

    fun smaller() : Boolean {
        return a < b
    }

}