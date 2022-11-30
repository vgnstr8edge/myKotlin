fun main() {
    val userAge = readLine()!!.toInt()

    /*if(userAge >= AGE_OF_MAJORITY)
        println("OK")
     else if(userAge == 16 || userAge == 17)
        println("a little more than usual")
     else
        println("Back to Main page")*/

    val resultText = if(userAge >= AGE_OF_MAJORITY) "OK"
    else if(userAge == 16 || userAge == 17) "a little more than usual"
    else "Back to Main page"

    println(resultText)

    /*when(userAge) {
        10 -> println("put 10")
        20 -> println("put 20")
        30 -> println("put 30")
        else -> println("put another char")*/
/*
    val consolNumber =  when(userAge) {
        10 -> "put 10"
        20 -> "put 20"
        30 -> "put 30"
        else -> "put another char"
    }
    println(consolNumber)
*/
}

const val AGE_OF_MAJORITY = 18