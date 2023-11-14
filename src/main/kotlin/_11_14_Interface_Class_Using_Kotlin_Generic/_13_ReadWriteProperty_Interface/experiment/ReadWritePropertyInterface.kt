package _11_14_Interface_Class_Using_Kotlin_Generic._13_ReadWriteProperty_Interface.experiment

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


class aaa(var data: String) : ReadWriteProperty<Person, String> {

    override fun getValue(thisRef: Person, property: KProperty<*>): String {
        println("Get Property ${property.name} with value $data")
        return data
    }

    override fun setValue(thisRef: Person, property: KProperty<*>, value: String) {
        println("Set Property ${property.name} from $data to $value")
        data = value
    }

}

class Person(param: String) {
    var iniNama: String by aaa(param)
}

class Person2(param: String) {
    // var iniNama: String by a(param) // ini tidak bisa karena
    // ReadWriteProperty<Person, String => hanya bisa digunakan oleh objek Person
    // ini juga berlaku di ReadOnlyProperty Interface
}

