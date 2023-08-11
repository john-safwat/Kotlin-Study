fun main() {
    primeNumberCheck(readIntNumber())
}

fun printFirst10Numbers(){ for ( i in 1..10) println(i) }
fun printNumbersAndGetSum(number:Int){
    var sum = 0
    for(i in 1..number){
        print("$i ")
        sum += i
    }
    println("\nThe Sum of Natural Number up to $number terms : $sum")
}

fun sumOfOddNumbers(number:Int){
    var sum = 0
    var value = 1
    print("The odd numbers are :")
    for(i in 1..number){
        print("$value ")
        sum += value
        value+=2
    }
    print("\nThe Sum of odd Natural Number up to $number terms : $sum")
}

fun counter(){
    print("How many Number you want to check : ")
    val total = readln().toInt()

    var posCount = 0;
    var nigCount = 0;
    var zeroCount = 0;
    for(i in 0..<total){
        print("Enter Number : ")
        val number = readln().toInt()
        when{
            number > 0 -> posCount++
            number < 0 -> nigCount++
            else -> zeroCount++
        }
    }
    println("You Entered $posCount Positive numbers And $nigCount Negative and $zeroCount Zero")
}

fun calcFactorial(number:Int):Int{
    return if(number == 1){
        number
    } else {
        number*calcFactorial(number-1)
    }
}

fun reverseNumber(number:Int){
    val value = number.toString()
    println(value.reversed())
}

fun dividableNumber() {
    var start = readIntNumber()
    var end = readIntNumber()

    if(start > end){
        val temp = start;
        start =end;
        end = temp
    }

    for(i in start..end){
        if(i%5==0 && i%6==0){
            println(i)
        }
    }
}

fun primeNumberCheck(number :Int) {
    for(i in 2..<number){
        if(number%i ==0){
            println("Number isn't prime number")
            return
        }
    }
    println("number is prime")
}