const val COMMA = ","
const val LINE = "\n"
const val COMMA_SPACE = ", "

object Utils {

    fun intArrayFromString(input: String, delimiter: String) : IntArray {
        return input.split(delimiter).map { it.toInt() }.toIntArray()
    }

    fun intArrayFromFile(path: String, delimiter: String) : IntArray {
        return stringFromFile(path).split(delimiter).map { it.toInt() }.toIntArray()
    }

    fun mutableIntListFromFile(path: String, delimiter: String) : MutableList<Int> {
        return stringFromFile(path).split(delimiter).map { it.toInt() }.toMutableList()
    }

    fun stringListFromFile(path: String, delimiter: String) : List<String> {
        return stringFromFile(path).split(delimiter)
    }

    fun stringListFromString(input: String, delimiter: String) : List<String> {
        return input.split(delimiter)
    }

    fun stringFromFile(path: String) : String {
        return this.javaClass.classLoader.getResource(path).readText().dropLast(1)
    }

}