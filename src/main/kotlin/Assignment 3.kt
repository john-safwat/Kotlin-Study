fun main() {
    println("The Average of the Numbers = ${calcAverage(readArrayOfIntegers())}")
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