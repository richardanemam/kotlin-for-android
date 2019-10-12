/**
 * LAMBDA FUNCIONS:
 * Lambda expressions (or lambda functions) are essentially blocks of code that can be assigned to variables, passed as
 * an argument, or returned from a function call, in languages that support high-order functions.
 *
 * HIGHER ORDER:
 * A higher order function is a function that takes a function as an argument, or returns a function.
 */

fun main() {

    //Lambdas
    val timesTwo: (Int) -> (Int) = {x: Int -> x*2}
    val add = {x: Int, y: Int -> x+y}
    println(timesTwo(3))
    println(add(2,3))

    //Higher order: filter is higher order function
    val list = (0..100).toList()

    println(list.filter { element: Int -> element % 2 == 0})

    //It: implicit name of a single parameter
    println(list.filter { it % 2 != 0})

    println(list.filter (::isNotEven))

    println(list.filter { it.even()})

}

fun isNotEven(i: Int) = i % 2 != 0
fun Int.even() = this % 2 == 0