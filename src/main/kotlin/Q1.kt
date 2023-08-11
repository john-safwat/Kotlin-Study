fun main() {
   counter()
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