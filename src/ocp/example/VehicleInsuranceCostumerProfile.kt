package ocp.example

import kotlin.random.Random

class VehicleInsuranceCostumerProfile: CostumerProfile {
    override val isLoyalCostumer = Random.nextBoolean()
}