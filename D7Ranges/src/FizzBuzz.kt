package sample

fun fizzbuzz(num: Int) = when {
    num % 15 == 0 -> "FizzBuzz "
    num % 5 == 0 -> "Fizz "
    num % 3 == 0 -> "Buzz "
    else -> "$num "
}

fun printFizzBuzz() {
    for (i in 0..100) {
        println(fizzbuzz(i))
    }
}

fun printReverseFizzBuzz() {
    for (i in 100 downTo 0 step 2) {
        println(fizzbuzz(i))
    }
}

fun main(args: Array<String>) {
    println("Fizz Buzz Output : ")
    printFizzBuzz()
    println("Reverse Fizz Buzz Output : ")
    printReverseFizzBuzz()
}
