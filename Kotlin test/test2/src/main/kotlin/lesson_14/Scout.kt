package lesson_14

class Scout(
    name: String,
    speed: Int,
    val radarSpeed: Int, // добавил поля (св-ва) характерные только для этого класса
    val afterburnerSpeed: Int,

) : Spaceship(name, speed) {    /*указывается название родительского класса
                     если в род классе есть теже св-ва как и в наследуемом - их нужно перечислить в (),
                     т.к. переменные есть уже в род классе, тут их объявлять не нужно
                     */

    // добавил методы характерные только для этого класса

    fun handleDataFromRadar() {
        println("$name: обработка данных с радара")
    }

    fun runAfterburner() {
        println("$name: форсаж запущен")
    }

}