package Challenge.VBalok

import java.util.*

fun main() {
    val panjang: Double
    val lebar: Double
    val tinggi: Double
    val volume: Double

    val reader = Scanner(System.`in`)

    print("Masukkan Panjang : ")
    panjang = reader.nextDouble()

    print("Masukkan Lebar : ")
    lebar = reader.nextDouble()

    print("Masukkan Tinggi : ")
    tinggi = reader.nextDouble()

    volume = hitungVolume(panjang, lebar, tinggi)
    val s = String.format("%.2f", volume)
    println("============================")
    print("Jadi Volume Balok = $s")

}
fun hitungVolume(p: Double, l: Double, t:Double): Double {
    return p * l * t
}



