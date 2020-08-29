import java.util.*

public var input = Scanner(System.`in`);
fun main(){
    println("==========MASUKKAN IDENTITAS ANDA==========")
    print("Nama : ")
    val nama: String? = input.nextLine()

    if (nama.isNullOrEmpty()){
        println("Mohon diisi")
        main()
    }
    print("Kelas : ")
    val kelas: String? = input.nextLine()
    if(kelas.isNullOrEmpty()){
        print("Jangan Lupa Diisi")
    }
    print("No Absen : ")
    val Absen: String?  = input.nextLine()
    println("==========MENGHITUNG BANGUN RUANG==========")
    menu()
}
fun menu(){
    println("1. Volume Balok\n2. Volume Bola\n ")
    print ("Silahkan pilih menu di atas : ")
    val pill:Int? = input.nextInt()
    when (pill) {
        1 -> balok()
        2 -> bola()
        else -> {
            println("Pilihan tidak ada, silahkan pilih ulang : ")
            menu()
        }
    }
}
fun bola(){
    println("======MENGHITUNG VOLUME BOLA======")
    print("Masukkan Jari-jari : ")
    val jari: Double = input.nextDouble()
    val v: Double = ((jari * jari * jari * 22 * 4 / 7) / 3)
    println("==========HASILNYA==========")
    print("Volume bola adalah ")
    System.out.printf("%.2f", v)
    println()
    println("====================================")
}
fun balok(){
    println("=====MENGHITUNG VOLUME BALOK=====")
    print("Masukkan panjang : ")
    var panjang: Double? = null
    panjang = input.nextDouble()
    print("Masukkan lebar : ")
    var lebar: Double? = null
    lebar = input.nextDouble()
    print("Masukkan tinggi : ")
    var tinggi: Double? = null
    tinggi = input.nextDouble()
    val v :Double = panjang * lebar * tinggi
    println("==========HASILNYA==========")
    print("Volume balok adalah ")
    System.out.printf("%.2f", v)
    println()
}
