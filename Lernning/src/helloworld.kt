fun main(args: Array<String>) {
    println("hello world!")
    val nemo=Customer("nemo")
}

class Customer(name: String) {
    init {
        println("Customer initialized with value ${name}")
    }
}