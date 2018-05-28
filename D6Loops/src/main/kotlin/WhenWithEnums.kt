package samples

import samples.colors.Color
import samples.colors.Color.*

fun getMnemonics(color: Color) =
    when(color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun getWarmth(color: Color) = when(color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    VIOLET, INDIGO, BLUE -> "cold"
}

fun main(args: Array<String>) {
    println("Fetching Mnemonics for ${Color.RED} = ${getMnemonics(Color.RED)}")
    println("Warmth of color ${Color.GREEN} = ${getWarmth(GREEN)}")
}
