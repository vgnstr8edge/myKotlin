fun main() {
    val name = getName()
    val age = getAge()
    printNameAge(name, age) // можно дать другие названия аргументам (в выпадающем меню - Refactor - Rename), например: printNameAge(User = name, Old = age)
                            // можно вместо аргументов вписать сами методы: printNameAge(getName(), getAge()) и убрать переменные name и age

}

/*fun getName() {
    println("write name:")
    val name = readLine()
    println(name)
}

fun getAge() {
    println("write age:")
    val age = readLine()?.toInt()
    println(age)
} */


/* Если нужно, чтобы ф-ция возвращала значение:
1. после названия ф-ции и круглых скобок пишем тип, например :String?
2. написать return и что возвращать -> например, return name
3. можно прописать новые переменные в main для этих вызываемых ф-ций
4. println из ф-ций можно удалить
5. можно поставить в return метод считывания readLine
*/
fun getName(): String? {
    println("write name:")
    return readLine()
}

fun getAge(): Int? {
    println("write age:")
    return readLine()?.toInt()
}

// Метод, принимающий два значения:
fun printNameAge(name: String?, age: Int?) {
    println("Date of user are $name and $age")
}

/*
Можно максимально сократить ф-ции getName И getAge, убрав {} и println и поставив знак =
fun getName(): String? = return readLine()
fun getAge(): Int? = return readLine()?.toInt()

Т.к. есть метод printNameAge, где есть println, имя и возраст все равно распечатаются.
*/