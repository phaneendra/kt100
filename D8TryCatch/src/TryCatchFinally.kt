package sample

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (exception: NumberFormatException) {
        null
    } finally {
        reader.close()
    }
    println(number)
}

fun main(args: Array<String>) {
    readNumber(BufferedReader(StringReader("389")))
    readNumber(BufferedReader(StringReader("Not a number")))
}
