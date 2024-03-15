class Solver {
}
fun solve() {
    var result = readln().toInt()
    when {
        result % 3 == 0 && result % 5 == 0 -> println("FizzBuzz")
        result % 3 == 0 -> println("Fizz")
        result % 5 == 0 -> println("Buzz")
        else -> println("Не делится")
    }
}


