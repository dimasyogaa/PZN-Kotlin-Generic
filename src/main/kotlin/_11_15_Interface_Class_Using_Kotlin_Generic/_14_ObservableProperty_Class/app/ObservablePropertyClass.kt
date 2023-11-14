package _11_15_Interface_Class_Using_Kotlin_Generic._14_ObservableProperty_Class.app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

/**
 * Generic interface delegate yang sebelumnya kita gunakan (ReadOnlyProperty dan ReadWriteProperty) kita perlu mengatur value datanya secara manual
 * Kadang kita hanya butuh melakukan sesuatu sebelum dan setelah data nya diubah
 * Untuk kasus seperti ini, kita bisa menggunakan generic class ObservableProperty
 * Untuk mendeteksi adanya perubahan
 * jika ada perubahan maka function after dan before change akan tereksekusi, jika tidak maka juga tidak tereksekusi
 * before change akan mengembalikan nilai boolean, jika true maka after change akan tereksekusi


 */

class LogObservableProperty<T>(param: T) : ObservableProperty<T>(param) {

    /**
     * method beforeChange dan afterChange akan dieksekusi ketika terjadi perubahan data
     * jika tidak ada perubahan maka tidak tereksekusi
     */

    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change ${property.name} from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change ${property.name} from $oldValue to $newValue")
    }
}

class Car(brand: String, year: Int) {
    var brand: String by LogObservableProperty(brand)
    var year: Int by LogObservableProperty(year)

    /** helper function Object Delegates
    - Delegates.notNull() ReadWriteProperty yang nilai awal bisa
    null, namun error jika masih null
    - Delegates.vetoable(value, lambda beforeChange) ObservableProperty dengan beforeChange
    - Delegates.observable(value, lambda afterChange) ObservableProperty dengan afterChange*/


    // jika null maka terjadi exception
    var owner: String by Delegates.notNull<String>()

    // ObservableProperty dengan beforeChange
    var description: String by Delegates.vetoable("initdesc") { property, oldValue, newValue ->
        println("Before change ${property.name} from $oldValue to $newValue")
        true
    }

    // ObservableProperty dengan afterChange
    var other: String by Delegates.observable("initother") { property, oldValue, newValue ->
        println("After change ${property.name} from $oldValue to $newValue")
    }
}

fun main() {
    println()
    val car = Car("Toyota", 2019)

    println(car.brand) // beforeChanges dan afterChanges tidak terkeksekusi karena tidak terjadi perubahan

    println()

    car.brand = "Wuling"
    println(car.brand)

    println()

    car.year = 2020
    println(car.year)

    println("===========================================")
    try {
        println(car.owner)
    } catch (e: IllegalStateException) {
        println(e.message) // Property owner should be initialized before get.
    }
    println()

    car.owner = "Yoga"
    println("owner : ${car.owner}")

    println()

    car.description = "ikidesc"
    println(car.description)

    car.other = "ikiother"
    println(car.other)
}