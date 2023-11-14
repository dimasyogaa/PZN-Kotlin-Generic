package _2_Generic_Class.data

/**
 * Generic Type
 * ● Generic type adalah class atau interface yang memiliki parameter type
 * ● Tidak ada ketentuan dalam pembuatan generic parameter type, namun biasanya kebanyakan
 * orang menggunakan 1 karakter sebagai generic parameter type
 * ● Nama generic parameter type yang biasa digunakan adalah :
 * ○ E - Element (biasa digunakan di collection atau struktur data)
 * ○ K - Key
 * ○ N - Number
 * ○ T - Type
 * ○ V - Value
 * ○ S,U,V etc. - 2nd, 3rd, 4th types
 *
 * tanda <> dinamakan diamond operator
 */

class MyData<T>(val firstData : T) {

    fun getData(): T = firstData

    fun printData() {
        println("Data is $firstData")
    }

}

/**
 * Multiple Parameter Type
 * ● Parameter type di Generic type boleh lebih dari satu
 * ● Namun harus menggunakan nama type berbeda
 * ● Ini sangat berguna ketika kita ingin membuat generic parameter type yang banyak
 * Jumlah Parameter Type berdasarkan banyaknya generic parameter type yang di deklarasikan di diamond operator class
 * misal :
 * MyDataMultiple<T, U> berarti bisa menggunakan 2 generic parameter type, jika hanya salah satu saja yang digunakan, tidak apa apa
 */

class MyDataMultiple<T, U> (val firstData : T, val secondData : U) {

    fun getData(): T = firstData

    fun getSecond(): U = secondData

    fun printData() {
        println("Data is $firstData $secondData")
    }

}

class MyDataMultiple2<T, U> (val firstData : T) {

    fun getData(): T = firstData

    fun printData() {
        println("Data is $firstData")
    }

}