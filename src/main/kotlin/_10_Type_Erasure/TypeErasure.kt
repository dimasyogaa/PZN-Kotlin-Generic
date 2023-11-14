package _10_Type_Erasure

/**

 * Type erasure adalah proses pengecekan generic pada saat compile time, dan menghiraukan pengecekan pada saat runtime
 * Type erasure menjadikan informasi generic yang kita buat akan hilang ketika kode program kita telah di compile menjadi binary file
 * Compiler akan mengubah generic parameter type menjadi tipe Any (atau Object di Java)

Problem Type Erasure
 * Karena informasi generic hilang ketika sudah menjadi binary file
 * Oleh karena itu, konversi tipe data generic akan berbahaya jika dilakukan secara tidak bijak

 */

class TypeErasure<T>(param:T) {
    private val data: T = param
    fun getData(): T = data
}

// Tools -> Kotlin -> Show Kotlin Bytecode -> Decompile

/**
 * Problem Type Erasure
 */
fun main() {
    val data1 = TypeErasure("Yoga")
    val dataString: String = data1.getData()
    println(dataString)

    val yoga: TypeErasure<Int> = data1 as TypeErasure<Int>
    val dataInt = yoga.getData() // error runtime, karena kita memaksa menjadi int, padahal nilai yang dikembalikan oleh data1.getData() itu objek atau string
    println(dataInt)
}