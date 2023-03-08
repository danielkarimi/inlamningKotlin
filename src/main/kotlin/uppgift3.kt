import java.io.File

fun main() {
    val inputFile = File("src/main/kotlin/2020.txt")
    val numbers = inputFile.readLines().map { it.toInt() }
    val likaMed = 2020

    val answer = numbers.find { number -> numbers.contains(likaMed - number) }

    if (answer != null) {
        println("Svaret är ${answer * (likaMed - answer)}")
    } else {
        println("Det finns inga två tal som summerar till $likaMed")
    }
    inspireradLösning2020()
}

fun inspireradLösning2020() {
    val inputFile = File("src/main/kotlin/2020.txt")
    val nummer = inputFile.readLines().map { it.toInt() }
    val equalsTo = 2020

    val result = hittaSumma2020(nummer, equalsTo)

    if (result != 0) {
        println("InspireratSvar är $result")
    } else {
        println("Det finns inga två tal som summerar till $equalsTo")
    }
}

fun hittaSumma2020(input: List<Int>, equalsTo: Int): Int {
    for (i in input.indices) {
        for (j in i + 1 until input.size) {
            if (input[i] + input[j] == 2020) {
                return input[i] * input[j]
            }
        }
    }
    return 0
}



