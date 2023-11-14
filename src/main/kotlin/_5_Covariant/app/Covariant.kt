package _5_Covariant.app


/**
 * Covariant
 * ● Covariant artinya kita bisa melakukan subtitusi subtype (child) dengan supertype (parent)
 * ● Tidak semua jenis class generic yang mendukung covariant, hanya class generic yang menggunakan
 * generic parameter type sebagai return type function
 * ● Artinya saat kita membuat object Contoh<String>, maka bisa disubtitusi menjadi Contoh<Any>
 * ● Untuk memberitahu bahwa generic parameter type tersebut adalah covariant, kita perlu
 * menggunakan kata kunci out
 *
 * syarat :
 * dideklarasikan dengan keyword out
 * val data: T => tidak bisa var, harus val
 * tidak boleh digunakan sebagai tipe parameter input pada function,hanya boleh sebagai return value
 *
 *  fun data(param: T) => tidak boleh
 *  fun data() : T => Boleh
 */

class Covariant<out T> (val data: T) {

    fun data(): T {
        return data
    }

}

fun main() {

    val covariantString = Covariant("Yoga")
    val covariantAny: Covariant<Any> = covariantString

    println(covariantAny.data())

}