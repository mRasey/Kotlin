package Hello

fun main(args: Array<String>) {
    var enumClass: EnumClass = EnumClass.UP
    enumClass.foo()
}

enum class EnumClass(bool: Boolean) {

    UP(true){
        override fun foo(){
            println("UP")
        }
    },
    DOWN(true){
        override fun foo(){
            println("DOWN")
        }
    },
    LEFT(true){
        override fun foo(){
            println("LEFT")
        }
    },
    RIGHT(true){
        override fun foo(){
            println("RIGHT")
        }
    };

    open abstract fun foo()
}
