package _15_Generic_Extension_Function


/**
 * Generic juga bisa digunakan pada extension function
 * Dengan begitu kita bisa memilih jenis generic parameter type apa yang bisa menggunakan extension function tersebut

 */
class Data<T>(val data: T)

fun Data<String>.print() {
    val data = this.data
    println(data)
}

fun Data<Int>.printInt() {
    val data = this.data
    println(data)
}





fun main() {
    println()

    val data1 = Data(1)
    val data2 = Data("Dimas")

    // data1.print error
    data2.print()
    data1.printInt()

    println()

    genericExtensionFunctionChatGPT()

    println()

    myExperiment1()

    println()

    myExperiment2()

    println()

    myExperiment3()
}

fun genericExtensionFunctionChatGPT () {

    // Generic extension function untuk menggabungkan dua list
    fun <T> List<T>.mergeWith(other: List<T>): List<T> = this + other

    val list1 = listOf("apple", "banana")
    val list2 = listOf("orange", "grape")

    // Menggunakan generic extension function
    val mergedList = list1.mergeWith(list2)

    println("List 1: $list1")
    println("List 2: $list2")
    println("Merged List: $mergedList")
}

fun myExperiment1() {
    // fun  T.mergeWith() = println(this) error, harus ada deklarasi function generic yaitu fun <T>

    fun <T> T.cetak() = println(this)

    "Yoga".cetak()
    10.cetak()
    5.3.cetak()
    true.cetak()
    listOf(1, 2, 3).cetak()
}

fun myExperiment2() {

    fun <T> T.cetak(param1: T) = println("$this $param1")

    "Yoga".cetak("Dimas")
    "Yoga".cetak(21)
    10.cetak("Pambudi")
    false.cetak(5.3)
    listOf(1, 2, 3).cetak(true)
}

fun myExperiment3() {

    fun <T, U> U.cetak(param1: T, param2: U) = println("$this $param1 $param2")


   false.cetak("Dimas", 15)

}