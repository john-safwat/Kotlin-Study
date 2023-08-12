fun main() {
    primeNumberCheck(readIntNumber())
}

// print the first 10 integer numbers 1 to 10
fun printFirst10Numbers(){ for ( i in 1..10) println(i) }

// print the numbers from 0 to stop point the user set and get its sum
fun printNumbersAndGetSum(number:Int){
    var sum = 0
    for(i in 1..number){
        print("$i ")
        sum += i
    }
    println("\nThe Sum of Natural Number up to $number terms : $sum")
}

// find the sum of odd numbers from 0 to stop point the user set and get its sum
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

// the user enter random number and the function count how many of them is positive , negative and zero
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

// function to calc the factorial of any number user enter
fun calcFactorial(number:Int):Int{
    return if(number == 1){
        number
    } else {
        number*calcFactorial(number-1)
    }
}

// function to reverse any number tht user enter
fun reverseNumber(number:Int){
    val value = number.toString()
    println(value.reversed())
}

// print the numbers that are dividable on 5 & 6
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

// check if the number is prime
fun primeNumberCheck(number :Int) {
    for(i in 2..<number){
        if(number%i ==0){
            println("Number isn't prime number")
            return
        }
    }
    println("number is prime")
}