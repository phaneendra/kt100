package d4Classes.geometry.shapes

import java.util.*

class Rectangle(val width: Int, val height: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}
