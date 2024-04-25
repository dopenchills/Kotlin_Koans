// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> = customers.filter { customer ->
    val (delivered, undelivered) = customer.orders.partition { order -> order.isDelivered }
    delivered.size < undelivered.size
}.toSet()
