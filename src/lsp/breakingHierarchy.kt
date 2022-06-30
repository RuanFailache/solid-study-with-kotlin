package lsp

import kotlin.random.Random

// Liskov Substitution Principle
// Objects should be replaceable with their subtypes without affecting the correctness of the program

// An example of code that uses an object that affects the correctness of the program

abstract class Bird {
    open fun fly() {
        println("Flying...")
    }
}

class Ostrich : Bird() {
    override fun fly() {
        throw Error("Ostrich cannot fly!")
    }
}

// An example of code with a great abstraction that use the subtypes correctly

abstract class Vehicle {
    abstract val interiorWidth: Double
}

class Car : Vehicle() {
    override val interiorWidth: Double
        get() = this.cabinWidth

    private val cabinWidth: Double = Random.nextDouble() * 100
}

class RacingCar : Vehicle() {
    override val interiorWidth: Double
        get() = this.cockpitWidth

    private val cockpitWidth: Double = Random.nextDouble() * 100
}

// Breaking the hierarchy is when we need to restructure our system to solve the above problem

fun main() {
//    val cars = Array<Vehicle>(3) {
//        Car();
//        Car();
//        RacingCar()
//    }
//
//    for (car in cars) {
//        println(car.interiorWidth)
//    }
    productUtils()
}
