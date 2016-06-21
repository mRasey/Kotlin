package Hello

fun main(args: Array<String>){
    var info: Info = Info("Billy")
    println("name is ${info.name}, age is ${info.age}")
    var infoCopy = info.copy(name = "Wang")
    println("name is ${infoCopy.name}, age is ${infoCopy.age}")
    var (name, age) = info/*结构声明*/
    println("name is $name, age is $age")
}

data class Info(var name: String = "", var age: Int = 20){

}
