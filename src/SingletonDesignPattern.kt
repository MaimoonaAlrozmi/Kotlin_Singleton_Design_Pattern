object Singleton {
    init {
        println("Singleton initialized")
    }

    var message = "welcome to Kotlin's world ^-^"

    fun showMessage() {
        println(message)
    }
}

class Test {
    init {
        Singleton.showMessage()
    }
}

fun main() {
    println("----------------------------------")
    println("")
    Singleton.showMessage()
    Singleton.message = "Kotlin is cool"

    val test = Test()
    println("")
    println("----------------------------------")

}