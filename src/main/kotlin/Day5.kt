object Day5 {

    fun runPart1(input: List<String>) =
        input.maxOf(::calculateSeatId)

    fun runPart2(input: List<String>) =
        input.map(::calculateSeatId).sorted().windowed(size = 2).first {
            it[0] + 1 != it[1]
        }.first() + 1

    fun calculateSeatId(input: String) =
        input.map {
            if (it == 'B' || it == 'R') 1 else 0
        }.joinToString("").toInt(2)
}
