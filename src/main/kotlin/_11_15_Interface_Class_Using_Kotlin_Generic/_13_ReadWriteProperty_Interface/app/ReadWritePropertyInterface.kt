package _11_15_Interface_Class_Using_Kotlin_Generic._13_ReadWriteProperty_Interface.app

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * ReadWriteProperty Interface
 * ● Selain ReadOnlyProperty, kita juga menggunakan interface generic ReadWriteProperty sebagai
 * delegate
 * ● ReadWriteProperty bisa digunakan untuk variable var (mutable)
 */


class StringLogReadWriteProperty(var data: String) : ReadWriteProperty<Any, String> {

    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Get Property ${property.name} with value $data")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("Set Property ${property.name} from $data to $value")
        data = value
    }

}

class Person(param: String) {
    var iniNama: String by StringLogReadWriteProperty(param)
}

fun main() {

    println()
    val person = Person("Yoga")

    println(person.iniNama)

    person.iniNama = "Pambudi"

    println(person.iniNama)
}