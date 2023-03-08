import java.io.File
import java.util.*

fun hittaSumman(sequence: String): Int {
    var sum = 0
    for (i in sequence.indices) {
        if (sequence[i] == sequence[(i + 1) % sequence.length]) {
            sum += sequence[i].toString().toInt()
        }
    }
    return sum
}

fun main() {
    val scanner = Scanner(File("src/main/kotlin/2017.txt"))
    val inputSiffror = scanner.nextLine()
    scanner.close()

    val sum = hittaSumman(inputSiffror)

    println("Sum: $sum")

    val halvaSumman = hittaSvarethalvags(inputSiffror)

    println("Halfway sum: $halvaSumman")

    val sc = Scanner(File("src/main/kotlin/2017.txt"))
    val input = sc.nextLine()
    scanner.close()

    val summa = sistaLösning(input)

    println("efterlösning: $summa")
}

fun hittaSvarethalvags(input: String): Int {
    var sum = 0
    val halfway = input.length / 2
    for (i in 0 until halfway) {
        val current = input[i]
        val opposite = input[i + halfway]
        if (current == opposite) {
            sum += 2 * current.toString().toInt()
        }
    }
    return sum
}

//https://github.com/isaiahliu/adventofcode/blob/master/src/main/kotlin/y2017/Day01.kt

fun sistaLösning(input: String): Int {
    val circularInput = input + input[0]
    return circularInput
        .zipWithNext()
        .filter { it.first == it.second }
        .filter { it.first.isDigit() }
        .map { it.first.toString().toInt() }
        .sum()
}






