fun main() {
    println("Hey there, what's your name?")
    val user: String? = readLine()
    print(defineGreetings(user))
}

fun defineGreetings(user: String?): String {
    return if (user != null && user.isNotEmpty()) {
        "Hello, $user!"
    } else {
        "Hello you!"
    }
}