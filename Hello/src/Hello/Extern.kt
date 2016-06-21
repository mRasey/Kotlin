package Hello

interface A{

    fun aaa(){

    }

    fun bbb(){

    }
}

interface B{
    fun aaa(){

    }

    fun bbb(){

    }
}

open class C : A, B{

    override fun aaa(){
        super<A>.aaa()
    }

    override fun bbb(){
        super<B>.bbb()
    }
}

class D : C() {
    fun aaabbb(){
        super.aaa()
        super.bbb()
    }
}
