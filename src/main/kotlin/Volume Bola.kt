package Challenge.VBalok
import java.util.*

fun main() {
    var jari: Float
    var volumepi: Float
    val reader = Scanner(System.`in`)
    print("Masukkan Jari jari : ")
    jari = reader.nextFloat()
    volumepi = ((jari * jari * jari * 22 * 4 / 7) / 3)
    val s = String.format("%.2f", volumepi)
    println("============================")
    print("Jadi Volume Bola = $s")
}