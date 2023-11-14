package _7_Generic_Constraint.where_keyword.data

interface CanSayHello {
    fun sayHello(name: String)
}

open class Employee

class Manager : Employee()

class VicePresident : Employee(), CanSayHello {

    override fun sayHello(name: String) {
        println("Hello $name, I'm vice president")
    }

}


