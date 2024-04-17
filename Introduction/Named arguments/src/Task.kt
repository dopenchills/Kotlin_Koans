fun joinOptions(options: Collection<String>) =
        options.joinToString(
//              Intentionally change the order of
//              named arguments
                postfix = "]",
                prefix = "[",
                separator = ", "
        )
