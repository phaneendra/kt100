package d5Enumns.colors

enum class Colors(val r: Int, val g: Int, val b: Int) {
    VIOLET(238, 130, 238), INDIGO(75, 0,130),
    BLUE(0, 0, 255), GREEN(0, 255, 0), YELLOW(255, 255, 0),
    ORANGE(255, 165,0), RED(255,0,0);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(args: Array<String>) {
    println(Colors.RED.rgb())
}
