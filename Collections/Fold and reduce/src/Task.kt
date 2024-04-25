// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> =
    customers
        .map { c -> c.orders.flatMap(Order::products).toSet() }
        .reduce { intersection, set -> set.intersect(intersection) }


fun Customer.getOrderedProducts(): Set<Product> =
    orders.flatMap(Order::products).toSet()