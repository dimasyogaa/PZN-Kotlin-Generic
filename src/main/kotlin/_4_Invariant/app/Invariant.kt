package _4_Invariant.app

class Invariant<T>(val data: T)

fun main() {


    /**
     * Invariant
     * ● Secara default, saat kita membuat generic parameter type, sifat parameter tersebut adalah
     * invariant
     * ● Invariant artinya tidak boleh di subtitusi dengan subtype (child) atau supertype (parent)
     * ● Artinya saat kita membuat object Contoh<String>, maka tidak sama dengan Contoh<Any>,
     * begitupun sebaliknya, saat membuat object Contoh<Any>, maka tidak sama dengan
     * Contoh<String>
     */

    val invariantString = Invariant("String")
    // val invariantAny: Invariant<Any> = invariantString// error
}