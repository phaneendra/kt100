/*
* String templates examples
 */

fun simpleTemplates(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello $name")
}

fun expressionTemplates(args: Array<String>) = if (args.isNotEmpty()) {
    println("Hello ${args[0]}")
} else {
    println("Hello Kotlin")
}

fun conciseTemplates(args: Array<String>) {
    println("Hello ${ if(args.isNotEmpty()) args[0] else "Kotlin" }")
}

fun main(args: Array<String>) {
    simpleTemplates(args)
    expressionTemplates(args)
    conciseTemplates(args)
}
