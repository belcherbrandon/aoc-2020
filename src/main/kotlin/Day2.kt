object Day2 {

    fun runPart1(input: List<String>): Int {
        return input.count {
            val parse = it.split("-", ": ", " ")
            val minCount = parse[0].toInt()
            val maxCount = parse[1].toInt()
            val validator = parse[2][0]

            val count = parse[3].count { character -> character == validator }
            count in minCount..maxCount
        }
    }

    fun runPart2(input: List<String>): Int {
        return input.count {
            val parse = it.split("-", ": ", " ")
            val index1 = parse[0].toInt() - 1
            val index2 = parse[1].toInt() - 1
            val validator = parse[2][0]

            (validator == parse[3][index1]).xor(validator == parse[3][index2])
        }
    }
}