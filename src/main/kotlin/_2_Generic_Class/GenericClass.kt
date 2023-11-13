package _2_Generic_Class


fun main() {

    val myDataString : MyData<String> = MyData("Dimas")
    myDataString.printData()

    val myDataInt : MyData<Int> = MyData(10)
    myDataInt.printData()

    println()

    // Multiple Parameter Type
    val myDataString2 : MyDataMultiple<String, Int> = MyDataMultiple("Dimas", 100)
    myDataString2.printData()

    val myDataInt2 : MyDataMultiple<Int, String> = MyDataMultiple(50, "Yoga")
    myDataInt2.printData()

    // kotlin pintar - tidak mendeklarasikan tipe parameter
    val myDataInt3 = MyDataMultiple(80, "Dimas")
    myDataInt3.printData()

}