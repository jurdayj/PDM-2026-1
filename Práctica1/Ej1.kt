//Problema 1: Se requiere que el programa devuelva el nivel de rendimiento y el total de la cantidad de dinero a recibir, después de realizar una operación matemática
//Autor: Urday Jerí, Joel Robert
//Fecha creación: 29 de marzo de 2026
//Fecha última modificación: 29 de marzo de 2026


//Se clasifica el desempeño del trabajador según la puntuación obtenida
fun nivel(puntuacion:Int) {
    if (puntuacion>= 0 && puntuacion<= 3)
        println("Inaceptable")
    else if (puntuacion>= 4 && puntuacion <= 6)
        println("Aceptable")
    else if (puntuacion >= 7 && puntuacion <= 10)
        println("Meritorio")
    else
        //Se indicará que hubo un error por si el usuario escribió una puntuación errónea
        println("Puntuación errónea")
}

//Se calcula el dinero total que tendrá que recibir de acuerdo a su salario y puntaje
fun dinero(salario:Double, puntuacion:Int):Double {
    //Se divide entre "10.0" para forzar la división decimal
    return salario * (puntuacion / 10.0)
}

fun main() {
    print("Ingrese salario: ")
    val salario = readln().toDouble()
    print("Ingrese puntuación: ")
    val puntuacion = readln().toInt()

    println("Resultado:")
    print("Nivel de rendimiento: ")
    nivel(puntuacion)
    println("Cantidad de Dinero Recibido: ${dinero(salario, puntuacion)}")
}
