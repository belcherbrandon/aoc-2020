object Day5 {

    fun runPart1(input: List<String>) = input.maxOf { calculateSeatId(it) }

    fun runPart2(input: List<String>): Int {
        return input.asSequence().map { calculateSeatId(it) }.sorted().windowed(size = 2, step = 1).first {
            it[0] + 1 != it[1]
        }.first() + 1
    }

    fun calculateSeatId(input: String): Int {
        return input.map {
            if (it == 'B' || it == 'R') 1 else 0
        }.joinToString("").toInt(2)
    }
}
