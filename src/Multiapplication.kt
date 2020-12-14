/**
 * Create by Muhammad Al Faisal on 12/13/20, 2020
 */
class Multiapplication {
    fun print() {
        println("+ Fitur Multiapplication +")
        println("=====================")
        var nil1 = 0
        var nil2 = 0

        print("Masukan Nila 1: ")
        nil1 = readLine()!!.toInt()
        print("Masukan Nila 2: ")
        nil2 = readLine()!!.toInt()

        println("Nilai A : ${nil1}")
        println("Nilai B : ${nil2}")

        println("Total Penambahan : ${nil1 + nil2}")
        println("Total Pengurangan : ${nil1 - nil2}")
        println("Total Pembagian : ${nil1 / nil2}")
        println("=====================")
    }
}