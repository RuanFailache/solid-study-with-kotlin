package ocp.example

import kotlin.random.Random

class HealthInsuranceCostumerProfile: CostumerProfile {
    override val isLoyalCostumer = Random.nextBoolean()

}