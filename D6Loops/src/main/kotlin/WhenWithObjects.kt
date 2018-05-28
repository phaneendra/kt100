package samples

import samples.colors.Color
import samples.colors.Color.*

fun mix(c1: Color, c2: Color) = when(setOf(c1,c2)) {
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    setOf(BLUE, VIOLET) -> INDIGO
    else -> throw Exception("Not a color !")
}

fun main(args: Array<String>) {
    println(mix(BLUE, YELLOW))
}
