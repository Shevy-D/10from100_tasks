fun division(a: Int, b: Int): Int{
    if (a < 0) throw Exception("Negative number")
    return a/b
}
fun multiply(a: Int, b: Int): Int{
    return a*b
}

fun main() {

    try {
        val nums = arrayOf(1, 5, 7, 10)
        var a = nums[2]
        //a = -1                              //Negative number
        //val b = nums[4]                   //ArrayIndexOutOfBoundsException
        //val b = 0                         //ArithmeticException
        //val b = "Int".toInt()             //NumberFormatException
        val b = 21
        println(multiply(a, b))
        println(division(a, b))
    }
    catch (e: Exception) {
        println(e)
    }
    catch (e: ArrayIndexOutOfBoundsException) {         // обработка исключения
        println("One of the numbers outside the array")
    }
    catch (e: ArithmeticException) {
        println(e.message)
    }
    catch (e: NumberFormatException) {
        println(e.message)
    }

    catch (e: Exception) {
        println(e.message)
    }/*
    catch (e: Exception) {
        println(e.message)
    }*/
    finally {
        println("Program has been finished")   // постобработка
    }
}