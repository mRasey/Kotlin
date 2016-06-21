package Hello

import kotlin.reflect.KProperty

fun main(args: Array<String>) {
    val e = DelegateProperty()
    println(e.c)
}

class DelegateProperty{
    var a = 0
    var c: Int by Property()
}

class Property{

    operator fun getValue(any: Any, property: KProperty<*>): Int {
        return 123
    }

    operator fun setValue(any: Any, property: KProperty<*>, i: Int) {

    }

}
