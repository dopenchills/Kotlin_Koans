fun renderProductTable(): String {
    return html {
        table {
            tr/* TODO */ {
                set("bgcolor", getTitleColor())
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            products.forEachIndexed { i: Int, it: Product ->
                tr {
                   td {
                       set("bgcolor", getCellColor(i, 0))
                       text(it.description)
                   }
                    td {
                        set("bgcolor", getCellColor(i, 1))
                        text(it.price)
                    }
                    td {
                        set("bgcolor", getCellColor(i, 2))
                        text(it.popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, column: Int) = if ((index + column) % 2 == 0) "#dce4ff" else "#eff2ff"
