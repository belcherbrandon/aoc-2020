import Utils.stringListFromFile
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class TestDay2 {

    @Test
    fun runExample1() {
        val list = listOf(
            "1-3 a: abcde",
            "1-3 b: cdefg",
            "2-9 c: ccccccccc"
        )
        Assertions
                .assertThat(Day2.runPart1(list))
                .isEqualTo(2)
    }

    @Test
    fun runPuzzle1() {
        val result = Day2.runPart1(stringListFromFile("2-1", LINE))
        println("Puzzle 2-1: $result")
        Assertions
                .assertThat(result)
                .isGreaterThan(312)
                .isEqualTo(467)
    }


    @Test
    fun runExample2() {
        val list = listOf(
                "1-3 a: abcde",
                "1-3 b: cdefg",
                "2-9 c: ccccccccc"
        )
        Assertions
                .assertThat(Day2.runPart2(list))
                .isEqualTo(1)
    }

    @Test
    fun runPuzzle2() {
        val result = Day2.runPart2(stringListFromFile("2-1", LINE))
        println("Puzzle 2-2: $result")
        Assertions
                .assertThat(result)
                .isEqualTo(441)
    }
}
