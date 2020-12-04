object Day3 {

    private fun <T> Sequence<T>.repeat() =
        sequence { while (true) yieldAll(this@repeat) }

    fun runPart1(input: List<String>) =
        run(3, 1, input)

    fun runPart2(input: List<String>) =
        1L *
        run(1, 1, input) *
        run(3, 1, input) *
        run(5, 1, input) *
        run(7, 1, input) *
        run(1, 2, input)

    private fun run(right: Int, down: Int, input: List<String>): Int {
        return input.filterIndexed { lineNumber, line ->
            val isSkipped = lineNumber % down != 0
            val isTree = line.asSequence().repeat().elementAt(lineNumber / down * right) == '#'
            !isSkipped && isTree
        }.count()
    }
}