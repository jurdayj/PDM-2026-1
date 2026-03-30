//Problema 2: Típico juego de piedra, papel o tijera, usando random()
//Autor: Urday Jerí, Joel Robert
//Fecha creación: 29 de marzo de 2026
//Fecha última modificación: 29 de marzo de 2026


//Se compara las opciones elegidas tanto por el usuario como por la computadora, para al final determinar un ganador
fun juego(usuario:Int, compu:Int) {
    if (usuario == compu)
        println("Empate")
    else if ((usuario == 1 && compu == 3) || (usuario == 2 && compu == 1) || (usuario == 3 && compu == 2))
        println("Ganaste")
    else
        println("Perdiste")
}

//Se traducen los números a las palabras "piedra, papel o tijera"
fun traducir(opcion:Int) {
    when (opcion) {
        1 -> println("Piedra")
        2 -> println("Papel")
        3 -> println("Tijera")
        //Se indicará que hubo un error por si el usuario escribió un valor erróneo
        else -> println("Error")
    }
}

fun main() {
    print("Seleccione una opción (1 = Piedra, 2 = Papel, 3 = Tijera): ")
    val usuario = readln().toInt()

    //La computadora elige una opción aleatoria
    val compu = (1..3).random()

    print("Tu elección: ")
    traducir(usuario)
    print("Elección de la computadora: ")
    traducir(compu)
    print("Resultado: ")
    juego(usuario, compu)
}