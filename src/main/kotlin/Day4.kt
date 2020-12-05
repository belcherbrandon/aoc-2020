object Day4 {

    private val reqFields = listOf("ecl", "pid", "eyr", "hcl", "byr", "iyr", "hgt")
    private val hclRegex = Regex("^#([a-fA-F0-9]{6})")

    fun runPart1(input: List<String>) =
        run(input) {
            it.keys.containsAll(reqFields)
        }

    fun runPart2(input: List<String>) =
        run(input) {
            it.keys.containsAll(reqFields) &&
            it["byr"]?.toInt() in 1920 .. 2002 &&
            it["iyr"]?.toInt() in 2010 .. 2020 &&
            it["eyr"]?.toInt() in 2020 .. 2030 &&
            validHgt(it["hgt"]!!) &&
            hclRegex.matches(it["hcl"]!!) &&
            it["ecl"] in listOf("amb", "blu", "brn", "gry", "grn", "hzl", "oth") &&
            it["pid"]!!.length == 9 && it["pid"]!!.toInt() > 0
        }

    private fun run(input: List<String>, validator: (fields: Map<String,String>) -> Boolean): Int {
        return input.filter {
            val map = it.replace("\n", " ").split(" ").map { field ->
                val keyVal = field.split(":")
                keyVal[0] to keyVal[1]
            }.toMap()
            validator(map)
        }.count()
    }

    private fun validHgt(s: String) =
        when {
            s.endsWith("cm") -> {
                s.removeSuffix("cm").toInt() in 150..193
            }
            s.endsWith("in") -> {
                s.removeSuffix("in").toInt() in 59..76
            }
            else -> false
        }
}
