package lesson_16

fun main() {
    /*
    public      по умолчанию во всех классах, виден из любого раздела
    private     данные доступны только в рамках файла или класса
    protected   данные видны в классе и в классах наследниках
    internal    данные доступны в любой части модуля, где они определены (напр, папка main)
     */

    val guide = HhGuide()
//    guide.title = "Don't panic"
//    guide.chooseArticle()


    Support().printInfo()

    println(guide.getNumberPages())

}

