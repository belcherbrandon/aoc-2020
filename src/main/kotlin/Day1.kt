object Day1 {

    fun runPart1(input: IntArray): Int {
        input.forEach { a ->
            input.forEach { b ->
                if (a + b == 2020) {
                    return a * b
                }
            }
        }

        throw Error("Not found")
    }

    fun runPart2(input: IntArray): Int {
        input.forEach { a ->
            input.forEach { b ->
                input.forEach { c ->
                    if (a + b + c == 2020) {
                        return a * b * c
                    }
                }
            }
        }

        throw Error("Not found")
    }
}