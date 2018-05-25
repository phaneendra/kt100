package d4Classes
class Person (
        val name: String,
        val isMarried: Boolean
)

fun main(args: Array<String>) {
    val person = Person("Bob", true)
    println("Name : ${person.name}")
    println("Married : ${person.isMarried}")
}
