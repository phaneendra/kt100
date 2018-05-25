package d4Classes.geometry.example

import d4Classes.geometry.shapes.Rectangle
import d4Classes.geometry.shapes.createRandomRectangle

fun main(args: Array<String>) {
    val rectangle = Rectangle(41, 41)
    println("New Rectangle of width: ${rectangle.width} and height: ${rectangle.height}")
    println("Is the rectangle a square: ${rectangle.isSquare}")
    println("Checking a random rectangle if its a square: ${createRandomRectangle().isSquare}")
}
