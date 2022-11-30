package lesson_11_12

fun main() {     //создаем объекты(экземляры) класса - блюда с уникальными характеристиками
    val dish1 = Dish(
        id = 1,
        name = "Яичница",
        category = "Завтраки",
        ingredients = listOf("яйцо", "помидор", "соль", "перец"),
    )

    val dish2 = Dish(
        id = 2,
        name = "Суп",
        category = "Обед",
        ingredients = listOf("вода", "вермишель", "соль", "перец"),
    )

/*
    println(dish1.name)   // обращаться к свойствам объекта нужно через . - .name, .id
    println(dish1.ingredients)
    println(dish1.inFavorits)
    println()
    println(dish2.name)
    println(dish2.ingredients)
    println(dish2.inFavorits)
*/
/*
    dish1.category = "Блюда из яиц"   // можно изменять значения свойств - среда предлагает изменить val на var
    dish2.inFavorits = true
    println(dish1.category)
    println(dish2.inFavorits)
*/
/*
    println("Действия для блюда Яичница")
    dish1.addToFavorites()   //добавить блюдо в Избранное
    println(dish1.inFavorits)   //распечатать
    dish1.startCooking()  //перешли на экран приготовления блюда

    println()

    println("Действия для блюда Суп")
    dish2.addToFavorites()
    println(dish2.inFavorits)
    val ingredientsForSoup = dish2.downloadList()  //добавили переменную, куда сохраняем вызваный метод для скачивания списка
    println(ingredientsForSoup)
    dish2.removeFromFavorites() //удаление из Избранного
    println(dish2.inFavorits)
*/

    val ingredient1 = Ingredient("potato", 1, 1)
    val ingredient2 = Ingredient("carrot", 2, 2, true)
// если конструктор пустой и переменная var - можно присвоить новое, например, имя ингредиенту: ingredient1.name = "tor"
    println(ingredient1.name)
    println(ingredient2.name)

}