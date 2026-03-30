//Problema 3: Calculadora básica de suma, resta, multiplicación, y división
//Autor: Urday Jerí, Joel Robert
//Fecha creación: 29 de marzo de 2026
//Fecha última modificación: 29 de marzo de 2026

//Se realizarán las operaciones correspondientes de acuerdo a las elecciones del usuario, y devuelve el resultado
fun calcular(v1:Double, v2:Double, opcion:Int) {
    when (opcion) {
        1 -> println("\nResultado: ${v1 + v2}")
        2 -> println("\nResultado: ${v1 - v2}")
        3 -> println("\nResultado: ${v1 * v2}")
        4 -> {
            //Si el usuario quiere hacer una división entre cero, se le notificará el error
            if (v2 == 0.0)
                println("\nResultado: Error, no se puede dividir entre cero.")
            else
                println("\nResultado: ${v1 / v2}")
        }
    }
}

fun main() {
    var opcion = 0

    //Se utilizará un "while" para que se pueda repetir hasta que el usuario decida salir de la calculadora
    while (opcion != 5) {
        println("\n==== Menú ====")
        println("1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Salir")
        print("Seleccione una opción: ")

        opcion = readln().toInt()

        if (opcion in 1..4) {
            print("Ingrese el primer número: ")
            val var1 = readln().toDouble()
            print("Ingrese el segundo número: ")
            val var2 = readln().toDouble()

            calcular(var1, var2, opcion)
        }

        else if (opcion == 5)
            //Se rompe el ciclo y asímismo el programa se detiene
            println("\nApagando calculadora")

        else
            //Se notificará que hubo un error por si el usuario escribió una opción errónea
            println("\nOpción no válida. Intente de nuevo.")
    }
}