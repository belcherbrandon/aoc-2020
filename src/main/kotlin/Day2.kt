object Day2 {

    private val pattern = Regex("(\\d+)-(\\d+) ([a-z]): ([a-z]+)")

    fun runPart1(input: List<String>): Int {
        return input.count {
            val (minCount, maxCount, validator, password) = pattern.find(it)!!.destructured
            val count = password.count { character -> character == validator.single() }
            count in minCount.toInt()..maxCount.toInt()
        }
    }

    fun runPart2(input: List<String>): Int {
        return input.count {
            val (index1, index2, validator, password) = pattern.find(it)!!.destructured
            (validator[0] == password[index1.toInt() - 1]).xor(validator.single() == password[index2.toInt() - 1])
        }
    }
}