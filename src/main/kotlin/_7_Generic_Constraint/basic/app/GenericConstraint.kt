package _7_Generic_Constraint.basic.app

import _7_Generic_Constraint.basic.data.Employee
import _7_Generic_Constraint.basic.data.Manager
import _7_Generic_Constraint.basic.data.VicePresident

/**
 * Generic Constraint
 * ● Kadang kita ingin membatasi data yang boleh digunakan di generic parameter type
 * ● Kita bisa menambahkan constraint di generic parameter type dengan menyebutkan tipe yang
 * diperbolehkan
 * ● Secara otomatis, type data yang bisa digunakan adalah type yang sudah kita sebutkan, atau
 * class-class turunannya
 * ● Secara default, constraint type untuk generic parameter type adalah Any, sehingga semua tipe data
 * bisa digunakan
 */

class Company<T : Employee>(val role: T)

fun main() {
    val data1 = Company(Employee())
    val data2 = Company(Manager())
    val data3 = Company(VicePresident())
    // val data4 = Company("") error, karena String bukan kelas Employee atau turunan dari Employee
}