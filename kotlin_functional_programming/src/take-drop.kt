fun main() {
    val list = generateSequence(0) { it + 10 }
    val list2 = (0..1000).toList()

    val drop900 = list2.drop(900).toList()
    val first20 = list.take(20).toList()
    println(drop900)
    println(first20)
}