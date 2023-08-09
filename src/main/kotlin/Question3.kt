fun main() {
    println("Enter Your Age ?")
    isEligible(readIntNumber())
}

fun isEligible(age:Int) = if(age >= 21) println("Congratulation! You are eligible for casting your vote.") else println("Sorry You Are not allowed to vote")
