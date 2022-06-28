package ocp

import ocp.example.HealthInsuranceCostumerProfile
import ocp.example.InsurancePremiumDiscountCalculator
import ocp.example.VehicleInsuranceCostumerProfile

// Open Close Principle
// Open for extensions and closed for modifications
// In the below example we can see how it works

fun main() {
    val jonas = HealthInsuranceCostumerProfile()
    val carol = VehicleInsuranceCostumerProfile()

    val calculator = InsurancePremiumDiscountCalculator()

    val jonasDiscount = calculator.calculatePremiumDiscountPercent(jonas)
    val carolDiscount = calculator.calculatePremiumDiscountPercent(carol)

    println("Jonas discount is $jonasDiscount%")
    println("Carol discount is $carolDiscount%")
}
