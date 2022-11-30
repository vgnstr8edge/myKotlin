import kotlin.concurrent.thread

fun main() {
    var counter = readLine()!!.toInt()

    while (counter > 0) {
        println("Start after ${counter--}")
        Thread.sleep(1000)
    }
    println("ready!")
/*
    do {
        println("Start after ${counter--}")
        Thread.sleep(1000)
    } while (counter > 0)

    println("ready!")

 */
}