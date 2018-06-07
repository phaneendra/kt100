package sample

fun isChar(character: Char) = character in 'a'..'z' || character in 'A'..'Z'
fun isNotDigit(character: Char) = character !in '0'..'9'

fun  recognize(character: Char) = when(character) {
    in 'a'..'z' -> "Is a character"
    in '0'..'9' -> "Is a digit"
    else -> "Not recognizable"
}

fun main(args: Array<String>) {
    println("Checking if \"a\" is a character ${isChar('a')}")
    println("Checking if \"c\" is not a digit ${isNotDigit('c')}")

    println("Recognizing character \"b\" ${recognize('b')}")
    println("Recognizing digit 1 ${recognize('1')}")
    println("Recognizing character \"?\" ${recognize('?')}")
}
