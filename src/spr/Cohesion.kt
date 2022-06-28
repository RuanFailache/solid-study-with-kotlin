package spr

// Single responsibility principle

// Each software component has to be a high level of cohesion
// For example

class Square(
    val side: Int
) {
    var area: Int = this.side * this.side
        private set

    var perimeter: Int = this.side * 4
        private set
}

// spr.Square Responsibility: measurements of the square

class SquareUI {
    fun draw() {
        // Render an image of the square
    }

    fun rotate() {
        // Rotate the image of the square clockwise to
        // the required degree and re-render
    }
}

// spr.SquareUI Responsibility: Rendering images of squares

// In our code we must aim for high cohesion between components
