package lesson_11_12

class Dish (     //в круглых скобках - свойства класса. Переменные без инициализации.
    val id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorits: Boolean = false,
    ) {      //фигурные скобки - тело класса. Тут будут методы (функции), которые воспроизводят то или иное действие в приложении.

    fun addToFavorites() {
        println("Блюдо $name добавлено в избранное")
        inFavorits = true
    }

    fun removeFromFavorites() {
        println("Блюдо $name удалено из избранного")
        inFavorits = false
    }

    fun startCooking() {
        println("пользователь перешел на экран приготовления блюда $name")
    }

    fun downloadList(): List<String> {
        return ingredients
    }




}