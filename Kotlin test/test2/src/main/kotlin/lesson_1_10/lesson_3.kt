fun main() {
    val greetings = "hello"
    val space = ' '
    val username = "Dimi"
    //println(greetings + '!' + space + "test string")
    /*println("$greetings, $username! What is your question?")
    println("i wanna say ${40 + 2}")*/

    //многосторочный текст
    var multiString = """
        string1
        string2
        string4
    """.trimIndent()
    println(multiString)
}