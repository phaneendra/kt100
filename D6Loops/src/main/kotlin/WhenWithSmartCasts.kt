package samples

interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr

fun eval(expression: Expr): Int = when(expression) {
    is Num -> {
        println("Number ${expression.value}")
        expression.value
    }
    is Sum -> {
        val left = eval(expression.left)
        val right = eval(expression.right)
        println("Sum of $left and $right = ${left + right}")
        left + right
    }
    else -> throw IllegalArgumentException("Unknown expression")
}

fun main(args: Array<String>) {
    println(eval(Sum(Num(56), Num(44))))
}
