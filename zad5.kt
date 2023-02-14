import kotlin.math.*
fun main() {//11 вариант
    try {
        println("введи x")
        var x = readLine()!!.toDouble()
        println("введи y")
        var y = readLine()!!.toDouble()
        var r = 1
        var R = 0.5
        var z = x * x + y * y
        if (z<=r)
            println("точка принадлежит цельному кругу")
        else
            println("точка НЕ принадлежит цельному кругу")
        if (z <= r && z >= R)
            println("точка принадлежит полому кругу")
        else
            println("точка НЕ принадлежит полому кругу")
        if (x.absoluteValue<=1&&y.absoluteValue<=1)
            println("точка принадлежит квадрату")
        else
            println("точка НЕ принадлежит квадрату")
    } catch (e: Exception) {
        println("ошибка")
    }
}