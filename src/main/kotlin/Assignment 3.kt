fun main() {
    println("The Second Smallest Number of the Numbers = ${getSecondDSmallestNumber(readArrayOfIntegers())}")
}

// function to read array from user
fun readArrayOfIntegers(): ArrayList<Int> {
    print("Enter The Number of Numbers : ")
    val arrayLength = readln().toInt()

    val array = arrayListOf<Int>();
    for (i in 0..<arrayLength){
        print("Enter Value Number $i : ")
        array.add(readln().toInt())
    }

    return array;
}

// function to find the value in the array
fun arraySearch(array:ArrayList<Int> , value:Int){
    for(i in array.indices){
        if(array[i] == value){
            println("Yes The Value Found")
            return
        }
    }
    println("No The Value Not Found")
}

// function to calculate the average of some numbers
fun calcAverage(array:ArrayList<Int>):Double{
    var sum = 0;
    for(i in array.indices){
        sum+= array[i]
    }
    return sum.toDouble()/array.size
}

// function to find the second-smallest number in list
fun getSecondDSmallestNumber(numbers:ArrayList<Int>): Int{
    for( i in numbers.indices){
        var swapped = false
        for(j in i..<numbers.size-i-1){
            if(numbers[j] > numbers[j+1]){
                val temp = numbers[j]
                numbers[j] = numbers[j+1]
                numbers[j+1] = temp
                swapped = true
            }
        }
        if(!swapped){
            return numbers[1]
        }
    }
    return numbers[1]
}