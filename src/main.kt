fun main() {
    printTotalProductPrice(
        productName = "картофель",
        productPrice = 45.75,
        productAmount = 1.2,
        discount = 30
    )

    printTotalProductPrice(
        productName = "огурец",
        productPrice = 45.0,
        productAmount = 0.6,
        discount = 12
    )

    printTotalProductPrice(
        productName = "манго",
        productPrice = 150.50,
        productAmount = 0.9,
        discount = 15
    )

    printTotalProductPrice(
        productName = "яблоко",
        productPrice = 35.75,
        productAmount = 1.6,
        discount = 10
    )


}

fun printTotalProductPrice(
    productName: String,
    productPrice: Double,
    productAmount: Double,
    discount: Int
) {
    val totalPrice = productPrice * productAmount * ((100 - discount) / 100.0)
    println("Итого $productName стоит $totalPrice")
}