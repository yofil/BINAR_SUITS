fun main (args:Array<String>) {

    println("------------------------")
    println("Game Gunting_Batu_Kertas")
    println("------------------------")

    println(" Siapakah anda Player 1:")
    var namaPemain1: String = readLine().toString().uppercase()
    println(" Siapakah anda Player 2:")
    var namaPemain2: String = readLine().toString().uppercase()

    println("Pilih jari")

    println("${namaPemain1} memilih:")
    val jari1: String = readLine().toString().lowercase()

    println("${namaPemain2} memilih: ")
    val jari2: String = readLine().toString().lowercase()

    InputJari(jari1,jari2,namaPemain1,namaPemain2)
}


