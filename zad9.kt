import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt
fun main() {//21 вариант
    try {
        var p = 3.14
        println("введи x2")
        var x2 = readLine()!!.toDouble()
        println("введи a")
        var a = readLine()!!.toDouble()
        println("введи b")
        var b = readLine()!!.toDouble()
        if (x2 < 0) {
            x2 = sin(x2 + (p / 2)).pow(2)
            println(x2)
        } else if (x2 > b) {
            x2 = sqrt(abs(sin(x2 + (p / 3))) + 2.1 * 10.0.pow(-3))
            println(x2)
        } else if (x2 <= b && x2 >= a) {
            x2 = Math.E.pow(x2) * (sin(x2 + (p / 2)))
            println(x2)
        } else
            println("корней нет")
    } catch (e: Exception) {
        println("ошибка")
    }
}