package Hello

/*委托模式*/

fun main(args: Array<String>) {
    var delegation = Delegation2()
    Derived(delegation).foo()
}

interface Base{
    fun foo()
}

class Delegation : Base{
    override fun foo(){
        println("delegation")
    }
}

class Delegation2 : Base{
    override fun foo(){
        println("delegation2")
    }
}

class Derived(b: Base) : Base by b
