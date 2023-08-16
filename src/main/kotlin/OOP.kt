fun main() {

    var dog = Pet("JOhn")
}


class Pet (private var name :String){
    init {
        name.also(::println)
    }
    constructor() : this("") {
        this.name = "unKnown Pet".also(::println)
    }
}
