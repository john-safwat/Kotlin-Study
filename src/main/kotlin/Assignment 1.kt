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
// function to sort data
fun sortData(vararg numbers: Double){
    for(i in numbers.indices - (numbers.size-1)){
        var swapped = false
        for (j in 0..<numbers.size-i-1){
            if(numbers[j] > numbers[j+1]){
                val temp = numbers[j]
                numbers[j] = numbers[j+1]
                numbers[j+1] = temp
                swapped = true;
            }
        }
        if(!swapped){
            break
        }
    }

    for (i in numbers.indices) println(numbers[i])
}
// single expression function to check if the user allowed to vote or not
fun isEligible(age:Int) = if(age >= 21) println("Congratulation! You are eligible for casting your vote.") else println("Sorry You Are not allowed to vote")
// single expression function to check if the char is vowel of consonant
fun vowelValidator(char :Char) = when{
    char.uppercaseChar() == 'A' -> println("The alphabet is Vowel")
    char.uppercaseChar() == 'I' -> println("The alphabet is Vowel")
    char.uppercaseChar() == 'O' -> println("The alphabet is Vowel")
    char.uppercaseChar() == 'U' -> println("The alphabet is Vowel")
    char.uppercaseChar() == 'E' -> println("The alphabet is Vowel")
    else -> println("The alphabet is a consonant.")
}
// functions overloaded to get the max and min of list of double and int numbers
fun getMax(vararg numbers:Int):Int{
    var max = numbers[0];
    for(i in numbers.indices-0){
        if(max < numbers[i]){
            max = numbers[i]
        }
    }
    return  max
}
fun getMax(vararg numbers:Double):Double{
    var max = numbers[0];
    for(i in numbers.indices-0){
        if(max < numbers[i]){
            max = numbers[i]
        }
    }
    return  max
}

fun getMin(vararg numbers:Int):Int{
    var max = numbers[0];
    for(i in numbers.indices-0){
        if(max > numbers[i]){
            max = numbers[i]
        }
    }
    return  max
}
fun getMin(vararg numbers:Double):Double{
    var max = numbers[0];
    for(i in numbers.indices-0){
        if(max > numbers[i]){
            max = numbers[i]
        }
    }
    return  max
}