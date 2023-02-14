fun main() {//1 вариант
    try {
        println("введи число")
        var z = readLine()!!.toInt()
        if (z % 3 == 0)
            println("число " + z + " кратно 3")
        else
            println("число " + z + " НЕ кратно 3")
    } catch (e: Exception) {
        println("ошибка")
    }
}