package lesson_11_12

class Ingredient(val name: String, val weight: Int, val count: Int) {
// обычно прописывается ключевое слово constructor, т.е. class Ingredient constructor()
// если в круглых скобках нет данных - это пустой (primary/первичный) конструктор
// свойства - это переменные внутри класса
// если переменные класса в теле, то в круглых скобках данные пишутся без val/var, т.е.
// class Ingredient(name: String, weight: Int, count: Int)

// если первичный конструктор пустой - эти переменные можно перезаписывать,
// если конструктор имеет свойства - то, эти данные будут распечатываться всегда.
/*
    var name = "name"
    var weight = 999
    var count = 888
*/

// чтобы можно было перезаписать данные, нужно присвоить переменным названия из конструктора:
// class Ingredient(name: String, weight: Int, count: Int)
/*
    var name = name
    var weight = weight
    var count = count
*/

// упрощенная запись в конструктор:
// перед именем свойства прописываем val/var, тогда, не нужно инициализировать переменные в теле ф-ции
// class Ingredient(val name: String, val weight: Int, val count: Int)



// ВТОРИЧНЫЙ (SECONDARY) КОНСТРУКТОР
// в нем нельзя добавлять переменные класса, в основном он нужен для добавлени параметров.

// если основной конструктор не пустой, то в нем нужно перечислить все те же поля и только потом
// добавлять новые свойства (чтобы новое свойство проинициализировалось корректно, нужно прописать его в теле класса (Ingredient)):

    var isNeedToPrepare = false

    constructor(
      name: String,
      weight: Int,
      count: Int,
      isNeedToPrepare: Boolean,
    ) : this(name, weight, count) {  //это обращение к основному конструктору
// тут мы обращаемся к переменной из тела класса, и, чтобы не было путаницы, добавляем ключевое слово this
// т.е. инициализировав переменную из класса, присваиваем ей свойства из конструктора:
        this.isNeedToPrepare = isNeedToPrepare
// если переменная и свойство называются по разному, ключевое слово this не нужно
    }

// БЛОКИ ИНИЦИАЛИЗАЦИИ
    init {
        println("ингридиент $name выбран")
    }
 /*
 вызывается вторичный конструктор
 вызывается первичный конструктор
 инициализация полей блоков init
 запуск кода в теле вторичного конструктора
  */
}