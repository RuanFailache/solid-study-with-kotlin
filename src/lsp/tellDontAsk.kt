package lsp

open class Product {
    var discount: Double = 20.0
        protected set
}

class InHouseProduct : Product() {
    init {
        this.applyExtraDiscount()
    }

    private fun applyExtraDiscount() {
        super.discount *= 1.5
    }
}

fun productUtils() {
    val productList = Array<Product?>(5) { null }

    productList[0] = InHouseProduct()
    productList[1] = Product()
    productList[2] = InHouseProduct()
    productList[3] = InHouseProduct()
    productList[4] = Product()

    var discountAverage = 0.0

    for (product in productList) {
        try {
            product as Product
            discountAverage += product.discount / 5
        } catch (err: NullPointerException) {
            println("Occurred an error!")
        }
    }

    println("The average of discounts is $discountAverage")
}
