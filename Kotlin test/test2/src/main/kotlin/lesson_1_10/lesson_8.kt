fun main() {
    val ingr1 = "яйцо"
    val ingr2 = "помидор"
    val ingr3 = "зелень"
    val ingr4 = "соль"
    val ingr5 = "перец"

    val arrayOfIngr = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")

    val intArray1 = intArrayOf() // указав тип массива, можно оставитьего пустым, ошибки не будет
    val charArray = charArrayOf()

//    val intArray3 = intArrayOf(1, 2, 3)
//    intArray3 = intArrayOf(4, 5, 6)  перезаписать тип val нельзя, только var

//    println("size of array is ${arrayOfIngr.size}")  .size - узнать размер массива

//    println(arrayOfIngr.indexOf("помидор"))   .indexOf - узнать индекс элемента

//    println(arrayOfIngr[1])
//    println(arrayOfIngr[2])

    arrayOfIngr[4] = "паприка"
//    println(arrayOfIngr[4])

    for (i in arrayOfIngr) {  //перебор значений массива
//        println(i)
        println("ingredient ${arrayOfIngr.indexOf(i) + 1}) $i")
    }

}