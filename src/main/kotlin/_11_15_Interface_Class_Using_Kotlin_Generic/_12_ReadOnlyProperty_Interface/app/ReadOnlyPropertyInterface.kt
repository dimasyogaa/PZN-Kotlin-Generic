package _11_15_Interface_Class_Using_Kotlin_Generic._12_ReadOnlyProperty_Interface.app

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Sebelumnya kita sudah belajar tentang delegate di Kotlin
 * Di Kotlin, ada sebuah interface generic yang bisa digunakan sebagai delegate property yang sifatnya readonly, alias val (immutable), namanya ReadOnlyProperty
 * ReadOnlyProperty bisa digunakan sebagai delegate, sehingga sebelum data kita kembalikan, kita bisa melakukan sesuatu, atau bahkan mengubah value si property

 */


class LogReadOnlyProperties(val data: String) : ReadOnlyProperty<Any, String> {
    var counter = 0

    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access property ${property.name} with value $data")
        counter++
        return data.uppercase() + " " + counter
    }

}


class NameWithLog(param: String) {
    val iniNama: String by LogReadOnlyProperties(param)
}

fun main() {
    println()

    val nameWithLog = NameWithLog("Yoga Dimas")

    println(nameWithLog.iniNama)
    println(nameWithLog.iniNama)


}
