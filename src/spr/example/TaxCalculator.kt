package spr.example

class TaxCalculator {
    fun calculateTax (employee: Employee) {
        when (employee.type) {
            "full-time" -> {
                // Do something
            }
            "contract" -> {
                // Do something
            }
        }
    }
}