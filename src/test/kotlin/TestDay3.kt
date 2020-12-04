import Utils.stringListFromFile
import Utils.stringListFromString
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class TestDay3 {

    val exampleInput =  """
            ..##.......
            #...#...#..
            .#....#..#.
            ..#.#...#.#
            .#...##..#.
            ..#.##.....
            .#.#.#....#
            .#........#
            #.##...#...
            #...##....#
            .#..#...#.#""".trimIndent()

    @Test
    fun runExample1() {
        Assertions
                .assertThat(Day3.runPart1(stringListFromString(exampleInput, LINE)))
                .isEqualTo(7)
    }

    @Test
    fun runPuzzle1() {
        val result = Day3.runPart1(stringListFromFile("3-1", LINE))
        println("Puzzle 3-1: $result")
        Assertions
                .assertThat(result)
                .isEqualTo(156)
    }

    @Test
    fun runExample2() {
        Assertions
            .assertThat(Day3.runPart2(stringListFromString(exampleInput, LINE)))
            .isEqualTo(336)
    }

    @Test
    fun runPuzzle2() {
        val result = Day3.runPart2(stringListFromFile("3-1", LINE))
        println("Puzzle 3-2: $result")
        Assertions
                .assertThat(result)
                .isEqualTo(3521829480L)
    }
}
