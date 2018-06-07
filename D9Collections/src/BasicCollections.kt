/*
 * General collections and its implementation
 */

val set = hashSetOf(1, 4, 18)
val list = arrayListOf(2, 8, 56)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty three")

fun main(args: Array<String>) {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
}
