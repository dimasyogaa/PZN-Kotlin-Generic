package _9_Star_Projection.app

/**
 * Kadang ada kasus kita tidak peduli dengan generic parameter type pada object
 * Misal kita hanya ingin mengambil panjang data Array<T>,
 * dan kita tidak peduli dengan isi data T nya
 * Jika kita mengalami kasus seperti ini, kita bisa menggunakan Star Projection
 * Star projection bisa dibuat dengan mengganti generic parameter type dengan karakter * (star, bintang)

 */

fun displayLength(array: Array<*>) {
    println("Length Array is ${array.size}")
}

fun main() {
    val arrayInt = arrayOf(1, 2, 3, 4, 5, 6)
    val arrayString = arrayOf("Yoga", "Dimas", "Pambudi")
    displayLength(arrayInt)
    displayLength(arrayString)

    // tidak peduli dengan generic parameter type pada object, baik itu invariant, covariant, maupun contravariant
    val arrayIntToString = arrayInt
    displayLength(arrayIntToString)
}

