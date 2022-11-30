package lesson_16

private val supportInfo = "Support" // прив переменная, но, распространяется на весь файл, в отличии от chooseArticle

class HhGuide {

    var title = ""

    private val getPages = 999  // приватная переменная для класса HhGuide

    private fun chooseArticle(){ //сделал его приватным в рамках рассмотрения второго класса
        println("Open catalog")
    }

    fun getNumberPages() = getPages  //публичный метод, возвращающий данные из приватной переменной
}


class Support {
    fun printInfo() {
        println(HhGuide::class.simpleName)
        println(HhGuide().title)
        println(supportInfo)
    }
}