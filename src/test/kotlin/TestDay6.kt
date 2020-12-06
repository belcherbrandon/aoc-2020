import Utils.stringListFromFile
import Utils.stringListFromString
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class TestDay6 {

    private val exampleInput =  """
            abc
            
            a
            b
            c
            
            ab
            ac
            
            a
            a
            a
            a
            
            b""".trimIndent()

    @Test
    fun runExample1() {
        Assertions
            .assertThat(Day6.runPart1(stringListFromString(exampleInput, DOUBLE_LINE)))
            .isEqualTo(11)
    }

    @Test
    fun runPuzzle1() {
        val result = Day6.runPart1(stringListFromFile("6-1", DOUBLE_LINE))
        println("Puzzle 6-1: $result")
        Assertions
                .assertThat(result)
                .isEqualTo(6735)
    }

    @Test
    fun runExample2() {
        Assertions
            .assertThat(Day6.runPart2(stringListFromString(exampleInput, DOUBLE_LINE)))
            .isEqualTo(6)
    }

    @Test
    fun runPuzzle2() {
        val result = Day6.runPart2(stringListFromFile("6-1", DOUBLE_LINE))
        println("Puzzle 6-2: $result")
        Assertions
            .assertThat(result)
            .isEqualTo(3221)
    }
}
