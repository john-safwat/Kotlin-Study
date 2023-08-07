fun main() {
    sortNumbers(firstNumber = readDoubleNumber() , secondNumber = readDoubleNumber() , thirdNumber = readDoubleNumber())
}

// function to sort the numbers
fun sortNumbers(firstNumber:Double , secondNumber:Double , thirdNumber:Double){
    if(firstNumber < secondNumber){
        if(firstNumber < thirdNumber){
            println(firstNumber)
            if(secondNumber<thirdNumber){
                println(secondNumber)
                println(thirdNumber)
            }else {
                println(thirdNumber)
                println(secondNumber)
            }
        }else{
            println(thirdNumber)
            println(firstNumber)
            println(secondNumber)
        }
    }else {
        if(secondNumber < thirdNumber){
            println(secondNumber)
            if(firstNumber<thirdNumber){
                println(firstNumber)
                println(thirdNumber)
            }else {
                println(thirdNumber)
                println(firstNumber)
            }
        }else{
            println(thirdNumber)
            println(secondNumber)
            println(firstNumber)
        }
    }
}