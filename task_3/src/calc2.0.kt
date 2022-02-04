fun main() {
    println("""Введите действие: "+", "-", "*", "/" """)
    val key: String? = readLine()
    println("Введите первое число: ")
    val a: Int = readLine()!!.toInt()
    println("Введите второе число: ")
    val b: Int = readLine()!!.toInt()

    fun sum(a: Int, b: Int) = a + b
    fun subtraction(a: Int, b: Int) = a - b
    fun multiply(a: Int, b: Int) = a * b
    fun division(a: Int, b: Int) = a / b

    fun calc(key: String?) : (Int, Int) -> Int{
        when(key) {
            "+" -> return ::sum
            "-" -> return ::subtraction
            "*" -> return ::multiply
            else -> return ::division
        }
    }



    println(calc(key)(a, b))
}



fun calc2(a: Int, b: Int, func: (Int, Int) -> Int){
    println(func(a,b))

}