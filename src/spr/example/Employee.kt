package spr.example

class Employee(
    id: Int,
    name: String,
    address: Address,
    contractNumber: Int,
    type: String
) {
    var id: Int = id
        private set

    var name: String = name
        private set

    var address: Address = address
        private set

    var contractNumber: Int = contractNumber
        private set

    var type: String = type
        private set

    fun save() {
        EmployeeRepository().save(this)
    }
}
