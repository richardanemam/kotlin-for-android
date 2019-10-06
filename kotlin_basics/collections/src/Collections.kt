/**
 * simple Study of collections in Kotlin
 */

fun main(args: Array<String>) {
    createArray()
    createSpecificArray()
    createList()
    createSpecificList()
    createMutableList()
    createSet()
    createMutableSet()
    createMaps()
}

/**
 * Create a simple general Array
 */
fun createArray() {
    val arr = arrayOf(1, 1, 2, 3, 5, "teste")
    println("simple array: " + arr.joinToString())
    println("get the item at the position 4: " + arr.get(3))
}

/**
 * Create an Array of Int type
 */
fun createSpecificArray() {
    val arr = intArrayOf(1, 1, 2, 3, 5, 8)
    println("Specific int array: " + arr.joinToString())
}

/**
 * Create a simple general List
 */
fun createList() {
    val list = listOf(1, 1, 2, "beta teste", 5, "teste")
    println("Simple List: " + list.joinToString())
}

/**
 * Create a simple int List
 */
fun createSpecificList() {
    val list = listOf<Int>(1, 1, 2, 3, 5, 8)
    println("Specific int list: " + list.joinToString())
}

/**
 * Create a mutable list
 */
fun createMutableList() {
    val mutableList = mutableListOf(99, 1, 2)
    mutableList[0] = 1
    println("Mutable list: " + mutableList.joinToString())
}

/**
 * Create a simple set
 */

fun createSet() {
    val set = setOf(1, 1, 2, 3)
    println("Print set: $set")
}

/**
 * Create a mutable set
 */
fun createMutableSet() {
    val mutableSet = mutableSetOf(1, 1, 2, 3)
    println("Print mutable set: $mutableSet")
    mutableSet.add(5)
    println("adding new element to the set: $mutableSet")
}

/**
 * Create Maps
 */
fun createMaps() {
    val map: Map<Int, String> = mapOf(Pair(1, "Kotlin"), Pair(2, "Android"))
    val mutableMap = mutableMapOf((1 to "Kotlin"), (2 to "Android"))
    mutableMap[3] = "Java"
    println(mutableMap[2])
}