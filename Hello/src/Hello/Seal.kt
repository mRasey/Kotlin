package Hello

open class Seal{
    var c: Int
        get(){
            println("getter is called")
            return 123
        }
        set(value){
            println("setter is called")
        }
    private var b = 1

    constructor(a: Int, b: Int){
        this.b = b
    }

    fun print(){
        println(b)
    }
}