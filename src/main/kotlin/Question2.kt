fun main() {
    sortData(4.0, 9.0 , 2.5 , 32.2,34.2 ,3.3)
}

fun sortData(vararg numbers: Double){
    for(i in numbers.indices){
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