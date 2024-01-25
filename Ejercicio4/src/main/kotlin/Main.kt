fun main() {
    val coche1 = Coche("Rojo", "Opel",  "Corsa", 100,5,"2332ABC" )
    val coche2 = Coche("Negro", "Seat", "Panda", 79, 3, "6969CMU")
    val coche3 = Coche("Blanco", "Ford", "Puma", 155, 5, "7894WJK")

    println()
    coche1.mostrarCoche()
    println()
    coche2.mostrarCoche()
    println()
    coche3.mostrarCoche()
    println()
    print("Introduce el número de caballos para cambiarselos al Ford: ")
    val caballos = readln().toInt()
    coche3.setCaballos(caballos)
    println("*************Nº caballos modificado*******************")
    println()
    print("Introduce el número de puertas para cambiarselos al Ford: ")

    println("*************Nº puertas modificado******************")
    println()
    coche1.mostrarCoche()
    println()
    coche2.mostrarCoche()
    println()
    coche3.mostrarCoche()

}