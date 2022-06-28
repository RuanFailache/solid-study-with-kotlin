package ocp

// Open Close Principle
// Open for extensions and closed for modifications
// In the below example we can see how it works

interface CostumerProfile {
    val isLoyalCostumer: Boolean
}

class HealthInsuranceCostumerProfile : CostumerProfile {
    override val isLoyalCostumer = true
}

class VehicleInsuranceCostumerProfile : CostumerProfile {
    override val isLoyalCostumer = true
}

class InsurancePremiumDiscountCalculator {
    fun calculatePremiumDiscountPercent (costumer: CostumerProfile) : Int {
        if (costumer.isLoyalCostumer) {
            return 20
        }
        return 0
    }
}

fun main () {
    val jonas = HealthInsuranceCostumerProfile()
    val carol = VehicleInsuranceCostumerProfile()

    val calculator = InsurancePremiumDiscountCalculator()

    val jonasDiscount = calculator.calculatePremiumDiscountPercent(jonas)
    val carolDiscount = calculator.calculatePremiumDiscountPercent(carol)

    println("Jonas discount is $jonasDiscount")
    println("Carol discount is $carolDiscount")
}
