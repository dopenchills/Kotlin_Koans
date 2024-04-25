class LazyProperty(val initializer: () -> Int) {
    var isLazyInitialized = false
    var _lazy: Int = 0

    val lazy: Int
        get() {
            if (!isLazyInitialized) {
                _lazy = initializer()
                isLazyInitialized = true
                return  _lazy
            } else {
                return _lazy
            }
        }
}
