package sample

import java.util.*

fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()
    for (character in 'A'..'Z') {
        val binary = Integer.toBinaryString(character.toInt())
        binaryReps[character] = binary
    }
    for ((letter, binary) in binaryReps) {
        println("$letter == $binary")
    }
}
