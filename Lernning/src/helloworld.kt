fun main(args: Array<String>) {
    println("hello world!")
    val nemo=Customer("nemo")
    val stu1=Student(1234,1)
    stu1.mytype();


}



class Customer(name: String) {
    init {
        println("Customer initialized with value ${name}") //使用主构造函数的参数
    }
    val customerKey=name.toUpperCase() //属性， 使用主构造器参数
    // 或者 class Person(val firstName:String,val LastName:String, var age:Int)  直接在主构造器里申明并初始化属性
}

open class Person(val ID:Int){
    constructor(ID:Int,name:String,age:Int,gender:String):this(ID){ //this(name,xx) 调用主构造函数
    }
    constructor(ID:Int,name:String,age:Int,gender:String,parent:Person):this(ID,name,age,gender){  //this(name,xx) 调用第二构造函数
        //parent.children.add(this)
    }
    open fun mytype(){
        println("Hi I'm a Person");
    }

    open val myID: Int get(){
        println("Get myID in Person class")
        return 1;
    }

}

class Student:Person{
    constructor(ID:Int,grade:Int) : super(ID)
    constructor(ID:Int,grade:Int,name:String,age:Int,gender:String) : super(ID,name,age,gender)
    override fun mytype() {
        super.mytype()
        println("Also, I am a student")
    }
    override  val myID:Int get(){
        println("get myID from Student class super.myID+1:");
        return super.myID+1;
    }
}