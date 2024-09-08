//5th Sep 2024
//Design a store to determine eligiblity for a special offer based on the total amount and membership status.
//that stimulates a discount system for a store
// Define the membership status


fun calculateDiscount(totalAmount: Double, PremiumMember: Boolean): Double {
    var discount = 0.0

    if (PremiumMember) {
        if (totalAmount >= 50) {
            discount = totalAmount * 0.15
        }
    } else {
        if (totalAmount >= 100) {
            discount = totalAmount * 0.1 
        }
    }

    return discount
}


fun main() {
    val totalAmount = 120.0
    val PremiumMember = true 
    val discount = calculateDiscount(totalAmount, PremiumMember)

    println("Total Amount: $totalAmount")
    if (PremiumMember) {
        println("Premium Member Discount: $discount")
    } else {
        println("Basic Member Discount: $discount")
    }
}
