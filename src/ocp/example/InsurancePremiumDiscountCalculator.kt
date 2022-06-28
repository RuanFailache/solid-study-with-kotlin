package ocp.example

class InsurancePremiumDiscountCalculator {
    fun calculatePremiumDiscountPercent (costumer: CostumerProfile) : Int {
        if (costumer.isLoyalCostumer) {
            return 20
        }
        return 0
    }
}
