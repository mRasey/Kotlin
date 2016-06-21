package Hello

/*尾递归*/

fun main(args: Array<String>) {
    var tailRecursive = TailRecursive(1)
    tailRecursive.foo(tailRecursive.a)
}

class TailRecursive {
    var a = 0

    constructor(a: Int) {
        this.a = a
    }

    tailrec fun foo(input: Int) : Int {/*不加tailrec会导致栈溢出*/
        a += 1
        if(a < 10000)
            return foo(a)
        println("end")
        return a
    }
}
