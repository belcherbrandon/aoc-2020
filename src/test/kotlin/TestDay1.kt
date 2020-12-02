import org.junit.jupiter.api.Test
import Utils.intArrayFromFile
import org.assertj.core.api.Assertions

class TestDay1 {

    @Test
    fun runExample1() {
        Assertions
                .assertThat(Day1.runPart1(intArrayOf(1721, 979, 366, 299, 675, 1456)))
                .isEqualTo(514579)
    }

    @Test
    fun runPuzzle1() {
        val result = Day1.runPart1(intArrayFromFile("1-1", LINE))
        println("Puzzle 1-1: $result")
        Assertions
                .assertThat(result)
                .isEqualTo(838624)
    }

    @Test
    fun runExample2() {
        Assertions
                .assertThat(Day1.runPart2(intArrayOf(1721, 979, 366, 299, 675, 1456)))
                .isEqualTo(241861950)
    }

    @Test
    fun runPuzzle2() {
        val result = Day1.runPart2(intArrayFromFile("1-1", LINE))
        println("Puzzle 1-2: $result")
        Assertions
                .assertThat(result)
                .isEqualTo(52764180)
    }
}
