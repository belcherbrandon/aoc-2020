import Utils.stringListFromFile
import Utils.stringListFromString
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class TestDay5 {

    @Test
    fun runExample1() {
        Assertions
                .assertThat(Day5.calculateSeatId("FBFBBFFRLR"))
                .isEqualTo(357)

        Assertions
            .assertThat(Day5.calculateSeatId("BFFFBBFRRR"))
            .isEqualTo(567)

        Assertions
            .assertThat(Day5.calculateSeatId("FFFBBBFRRR"))
            .isEqualTo(119)

        Assertions
            .assertThat(Day5.calculateSeatId("BBFFBBFRLL"))
            .isEqualTo(820)

        val exampleInput =  """
            FBFBBFFRLR
            BFFFBBFRRR
            FFFBBBFRRR
            BBFFBBFRLL""".trimIndent()

        Assertions
            .assertThat(Day5.runPart1(stringListFromString(exampleInput, LINE)))
            .isEqualTo(820)
    }

    @Test
    fun runPuzzle1() {
        val result = Day5.runPart1(stringListFromFile("5-1", LINE))
        println("Puzzle 5-1: $result")
        Assertions
                .assertThat(result)
                .isEqualTo(970)
    }

    @Test
    fun runPuzzle2() {
        val result = Day5.runPart2(stringListFromFile("5-1", LINE))
        println("Puzzle 5-2: $result")
        Assertions
            .assertThat(result)
            .isEqualTo(587)
    }
}
