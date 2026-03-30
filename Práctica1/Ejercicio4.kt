//Problema 4: Adivinar un número entre el 1 y 30, en el que el programa proporcionará pistas después de cada intento
//Autor: Urday Jerí, Joel Robert
//Fecha creación: 29 de marzo de 2026
//Fecha última modificación: 29 de marzo de 2026

//Se compara el número del usuario con el número a adivinar, retornando si se logró adivinarlo en cada intento o no
fun verificar(secreto:Int, numIntento:Int): Int {
    if (numIntento == secreto) {
        println("¡Felicidades, lo adivinaste!")
        return 1
    }
    else {
        if (secreto > numIntento)
            println("Pista: El número es mayor.")
        else
            println("Pista: El número es menor.")
        return 0
    }
}

fun main() {
    val numero = (1..30).random()
    var intentos = 5
    //Cuando esta variable cambie a 1, significa que se ganó y que ya no es necesario más intentos
    var victoria = 0

    println("Adivina un número entre el 1 y 30:")

    //El ciclo continúa mientras queden intentos y aún no se haya adivinado el número
    while (intentos > 0 && victoria == 0) {
        print("\nIntentos restantes: $intentos. Ingresa un número: ")
        val numIntento = readln().toInt()

        //Si se adivina el número, se actualiza que ya se ganó y se sale del ciclo
        if (verificar(numero, numIntento) == 1) {
            victoria = 1
            break
        }
        //Queda un intento menos
        intentos = intentos - 1
    }

    //Se indica al usuario que perdió y el número que debía adivinar
    if (victoria == 0) {
        println("\nDerrota, no lograste adivinarlo")
        println("El número era: $numero")
    }
}