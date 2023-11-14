package _7_Generic_Constraint.where_keyword.app

import _7_Generic_Constraint.where_keyword.data.CanSayHello
import _7_Generic_Constraint.where_keyword.data.Employee
import _7_Generic_Constraint.where_keyword.data.VicePresident

/**
 * Where Keyword
 * ● Kadang kita ingin membatasi tipe data dengan beberapa jenis tipe data di generic parameter type
 * ● Secara default, hanya satu tipe data yang bisa digunakan untuk membatasi generic parameter type
 * ● Jika kita ingin menggunakan lebih dari satu tipe data, kita bisa menggunakan kata kunci where
 */

class Company<T>(val role: T) where T: Employee, T:CanSayHello

fun main() {
    val data1 = Company(VicePresident())

    // val data2 = Company(Employee()) error, karena hanya kelas Employee, bukan termasuk Interface CanSayHello

    // val data3 = Company(Manager()) error, karena hanya kelas turunan Employee, bukan termasuk Interface CanSayHello
}