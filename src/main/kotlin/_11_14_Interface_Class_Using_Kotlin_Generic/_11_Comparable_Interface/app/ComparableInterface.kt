package _11_14_Interface_Class_Using_Kotlin_Generic._11_Comparable_Interface.app

/**

 * Sebelumnya kita sudah tahu bahwa operator perbandingan == dan !=
 * akan menggunakan metode equals sebagai implementasinya.
 * Bagaimana dengan operator perbandingan lainnya? Seperti > >= < <= ?
 * Operator perbandingan tersebut bisa kita lakukan,
 * jika object kita mewariskan interface generic Comparable

0 ~> sama
1 ~> lebih besar
-1 ~> lebih kecil
 */

class Fruit(val name: String, val quantity: Int) : Comparable<Fruit> {

    override fun compareTo(other: Fruit): Int {
        return quantity.compareTo(other.quantity)
    }

}

fun main() {
    println()

    val fruit1 = Fruit("Mangga", 100)
    // val fruit1 = Fruit("Mangga", 10)
    val fruit2 = Fruit("Mangga", 10)

    println(fruit1.compareTo(fruit2))
    println(fruit2.compareTo(fruit1))

    println()

    println(fruit1 > fruit2)
    println(fruit1 >= fruit2)
    println(fruit1 < fruit2)
    println(fruit1 <= fruit2)
}