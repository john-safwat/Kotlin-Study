fun main() {
    println(checkNumber(number = readIntNumber()))
}

// function to check if the number os odd or even
fun checkNumber(number: Int):String {
    return if(number %2 == 0){
        "The Number is Even";
    }else {
        "The Number is Odd";
    }
}