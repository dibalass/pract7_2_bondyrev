import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt

fun main() {//21 вариант
    try {
        var p = 3.14
        println("введи x1")
        var x1 = readLine()!!.toDouble()
        if (x1 < 0)
            x1 = 4.0
        else if (x1 > 1)
            x1 = x1 + 7
        else
            x1 = x1.pow(2) + 3 * x1 + 4
        println(x1)
    } catch (e: Exception) {
        println("ошибка")
    }
}