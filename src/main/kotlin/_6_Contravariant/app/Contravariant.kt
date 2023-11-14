package _6_Contravariant.app

/**
 * Contravariant (parent -> child)
 * ● Contravariant artinya kita bisa melakukan subtitusi supertype (parent) dengan subtype (child)
 * ● Tidak semua jenis class generic yang mendukung contravariant, hanya class generic yang
 * menggunakan generic parameter type sebagai parameter function
 * ● Artinya saat kita membuat object Contoh<Any>, maka bisa disubtitusi menjadi Contoh<String>
 * ● Untuk memberitahu bahwa generic parameter type tersebut adalah contravariant, kita perlu
 * menggunakan kata kunci in
 *
 * syarat :
 * dideklarasikan dengan keyword in
 * tidak bisa membuat properti yang bertipe contravariant di dalam class
 * tidak boleh digunakan sebagai sebagai return value pada function,hanya boleh sebagai tipe parameter input
 *
 *  fun data(param: T) => Boleh
 *  fun data() : T => Tidak boleh
 *
 *
 *  intinya :
 *  out : hanya boleh output (covariant)
 *  in : hanya boleh input (contravariant
 */

class Contravariant<in T> {

    fun sayHello(param: T) {
        println("Hello $param")
    }
}

fun main() {
    val contravariantAny = Contravariant<Any>()
    val contravariantString:  Contravariant<String> = contravariantAny

    contravariantString.sayHello("Dimas")

}