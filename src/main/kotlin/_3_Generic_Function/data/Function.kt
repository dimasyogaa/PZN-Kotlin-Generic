package _3_Generic_Function.data

/**
 * Generic Function
 * ● Generic parameter type tidak hanya bisa digunakan pada class atau interface
 * ● Kita juga bisa menggunakan generic parameter type di function
 * ● Generic parameter type yang kita deklarasikan di function, hanya bisa diakses di function tersebut,
 * tidak bisa digunakan di luar function
 * ● Ini cocok jika kita ingin membuat generic function, tanpa harus mengubah deklarasi class
 */

class Function(val name: String) {

    fun <T> sayHello(param: T) {
        println("Hello $param, my name is $name")
    }

    // ini T nya beda dengan T pada generic parameter type function diatas
    fun <T> lain(param: T) {
        println("Lain : $param")
    }

    // generic parameter type bisa lebih dari satu
    fun <T, U, V, W> multipleType(param1: T, param2: V){

    }
}


class Function2<T>(val name: String) {

    // param: T => T ini sama dengan T pada class Function2<T>
    fun sayHello(param: T) {
        println("Hello $param, my name is $name")
    }

}

class Function3<T>(val name: String) {

    // fun <T> : T ini sama dengan atau mengoverride T pada class Function2<T>
    fun <T> sayHello(param: T) {
        println("Hello $param, my name is $name")
    }

}