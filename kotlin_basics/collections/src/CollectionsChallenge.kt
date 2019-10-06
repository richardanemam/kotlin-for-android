fun main() {
    printArrayValues(generateArrayOfRandomNumbers())
}

fun generateArrayOfRandomNumbers(): IntArray {
    val intArr = IntArray(100)

    for (i in 0..99) {
        intArr[i] = (1..100).random()
    }

    return intArr
}

//The challenge is to avoid using if or when
fun printArrayValues(intArray: IntArray) {
    for (i in intArray.indices){
        while(intArray[i] <= 10) {
            println("$i: ${intArray[i]} ")
            break
        }
    }
}