fun main() {
    println("The Maximum Value is ${getMax(1.1,3.3,4.5,2.3,2.3,4.2,2.4,3.3)}")
    println("The Minimum Value is ${getMin(1,3,45,23,23,4,2,3)}")
}

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

