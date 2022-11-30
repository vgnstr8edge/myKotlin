fun main() {
    val userAge = 66
    val resultIs = (userAge >= AGE_OF_MAJORITY) && (userAge <= AGE_OF_RETIREMENT)

    println("Age of user is: $resultIs")

}

//const val AGE_OF_MAJORITY = 18
const val AGE_OF_RETIREMENT  = 65


// && - и, || - или, ! - не