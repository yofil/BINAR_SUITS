class InputJari (var jari1: String, var jari2:String, var namaPlayer1:String, var namaPlayer2:String) {

    var pilihanJari1: String
    var pilihanJari2: String
    lateinit var jariPemain1: String
    lateinit var jariPemain2: String

    init {
        pilihanJari1 = jari1
        pilihanJari2 = jari2
        jariPemain1 = namaPlayer1
        jariPemain2 = namaPlayer2

        inputJari(pilihanJari1, pilihanJari2, namaPlayer1, namaPlayer2)

    }

    fun inputJari(jari1: String, jari2: String, namaPlayer1: String, namaPlayer2: String) {
        if (jari1 == jari2) {
            println("Draw")
        } else if (jari1 == "batu" && jari2 == "gunting"||
                jari1 == "gunting" && jari2 == "kertas" ||
                jari1 == "kertas" && jari2 == "batu") {
                println ("$jariPemain1 menang!")
        } else if (jari2 == "batu" && jari1 == "gunting" ||
            jari2 == "gunting" && jari1 == "kertas" ||
            jari2 == "kertas" && jari1 == "batu") {
            println("$jariPemain2 menang")
        } else {
            println("Hanya batu, gunting, atau kertas")
    } }
}