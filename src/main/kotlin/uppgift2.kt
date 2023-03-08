import java.io.File

fun main() {
    var finalFrequency = 0

    val input = File("src/main/kotlin/2018.txt").readLines()
    for (line in input) {
        val value = line.substring(1).toInt()
        if (line.startsWith("+")) {
            finalFrequency += value
        } else {
            finalFrequency -= value
        }
    }

    println("Final frequency: $finalFrequency")
    println(findFirstRepeatingFrequency("src/main/kotlin/2018.txt"))
    println (inspireradLösning())
    println(del2inspireradLösning())
}

fun findFirstRepeatingFrequency(inputPath: String): Int {
    val input = File(inputPath).readLines().map { it.toInt() }
    val seenFrequencies = mutableSetOf(0)
    var frequency = 0
    var index = 0

    while (true) {
        frequency += input[index]
        if (seenFrequencies.contains(frequency)) {
            return frequency
        }
        seenFrequencies.add(frequency)
        index = (index + 1) % input.size
    }
}

fun inspireradLösning() {
    val input= File("src/main/kotlin/2018.txt").readLines().map { it.toInt() }
    val result= input.sum()
    println(result)
}


//https://www.youtube.com/watch?v=YgNt6746q80&list=PLfzJKXh_D71SJkxZ_2eKHRUiVebhUPgZ4&index=1
//https://www.youtube.com/watch?v=9y8iCSu0KYQ&list=PLfzJKXh_D71SJkxZ_2eKHRUiVebhUPgZ4&index=2

fun del2inspireradLösning() {
    var result= 0
    var values = File("src/main/kotlin/2018.txt").readLines().map { it.toInt() }
    val seen: MutableSet<Int> = mutableSetOf()
    while (!seen.contains(result)) {
        seen.add(result)
        if (values.isEmpty()) {
            values = File("src/main/kotlin/2018.txt").readLines().map { it.toInt() }
        }
        result= result+ values[0]
        values = values.drop(1)
    }
    println(result)
}






