import kotlin.math.pow

fun main() {//16 вариант
    try {
        println("Введите a ")
        var a = readLine()!!.toDouble()
        println("Введите b ")
        var b = readLine()!!.toDouble()
        println("Введите c ")
        var c = readLine()!!.toDouble()
        println("Введите v ")
        var v = readLine()!!.toDouble()
        println("Введите u ")
        var u = readLine()!!.toDouble()
        var min = Double.MAX_VALUE
        var max = Double.MIN_VALUE
        when{
            v<u->{
                while(v<=u)
                {
                    val y=a*v.pow(2)+b*v+c
                    when{
                        y<min->min=y
                        y>max->max=y
                    }
                    v+=0.1
                }
                println("на отрезке [v,u] минимальное значение $min максимальное значение $max")
            }
            else-> println("ошибка")
        }
    }
    catch (e: Exception) {
        println("ошибка")
    }
}
