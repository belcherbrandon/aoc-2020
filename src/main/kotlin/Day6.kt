object Day6 {

    fun runPart1(input: List<String>) =
        input.map { it.replace("\n", "").toSet().size }.sum()

    fun runPart2(input: List<String>) =
        input.map { group ->
            group.split("\n").fold(('a'..'z').toSet()) { common, it ->
                common.intersect(it.toSet())
            }.size
        }.sum()
}
