class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set (value) {
            if (value == null) {
                return
            }
            counter += 1
            field = value
        }
}
