package Hello

class World : hello {
    private var c = 0
    private var d = 0

    constructor(c: Int, d: Int) : super() {
        this.c = c
        this.d = d
    }

    override fun say() {
        println("hello world")
    }

    fun getC() = c
    fun getD() = d  //对非private属性使用get方法报错

    override fun add(a: Int, b: Int): Int = e + f

    companion object obj {
        /*静态变量都要放在伴生对象里，外部类可以直接调用*/
        var e = 0
        var f = 0

        fun add2(a: Int, b: Int) : Int{
            return a + b
        }
    }

    fun Array<Int>.sub(a: Int, b:Int) : Int{
        /*拓展函数的作用域为所在类，写在外面作为静态方法,this代表当前对象*/
        return this.get(a) - this.get(b)
    }

}


