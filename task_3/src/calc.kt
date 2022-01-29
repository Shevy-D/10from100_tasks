/*Написать программу, которая умеет выполнять следующие действия:
 * сложение, вычитание, умножение, деление и возведение в степень.
 * Количество чисел выбирайте произвольное (простая задача - два числа,
 * сложная задача - количество чисел вводит пользователь).
 */


fun main() {

    println("Input first number: ")
    var a: String? = readLine()
    println("Input second number: ")
    var b: String? = readLine()
    println("Input action (+, -, *, /):")
    val act = readLine()
    if ((a != null) && (b != null)) {
        when(act){
            "+" -> println(a.toInt()+b.toInt())
            "-" -> println(a.toInt()-b.toInt())
            "*" -> println(a.toInt()*b.toInt())
            "/" -> println(a.toInt()/b.toInt())
            else -> {
                println("Numbers cannot be empty")
            }

        }
    }
}


fun main() {
    println("Input action (+, -, *, /):")
    val act = readLine()

    if (act == "+"){
        println("Input first number: ")
        var a: Int = readLine().toInt()
        println("Input second number: ")
        var b: Int = readLine().toInt()
        println(a.toInt()+b.toInt())
    } else if(act == "-"){
        println("Input first number: ")
        var a: String = readLine()
        println("Input second number: ")
        var b: String = readLine()
        println(a.toInt()-b.toInt())
    } else if(act == "*"){
        println("Input first number: ")
        var a: String? = readLine()
        println("Input second number: ")
        var b: String? = readLine()
        println(a.toInt()*b.toInt())
    } else if(act == "/"){
        println("Input first number: ")
        var a: String? = readLine()
        println("Input second number: ")
        var b: String? = readLine()
        println(a.toInt()/b.toInt())
    } else {
        println("Unknown expression")
    }

}