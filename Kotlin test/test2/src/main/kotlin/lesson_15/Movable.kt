package lesson_15

interface Movable {
    /*
    тут можно объявить гипотетическую функциональность - методы, без реализации (типа шаблонов)
    или прописать методы с телами.
     */

    fun startEngine() {
        println("Двигатель запущен")  // есть тело "println" - метод для всех
    }

    fun prepareForTakeOff()
    fun prepareForLanding()   // методы без тела (без реализации) - для каждого объекта (типа корабля) - индивидуальная.

}