//Problema 1: Uso de la clase Producto() con validación para asegurar precios y descuentos correctos
//Autor: Urday Jerí, Joel Robert
//Fecha creación: 5 de abril de 2026
//Fecha última modificación: 5 de abril de 2026

class Producto() {
    //Se valida que no se ingresen valores negativos
    var precio:Double = 0.0
        set(value) {
            if (value >= 0) field = value
        }

    //Se valida que el porcentaje esté entre 0 y 100
    var descuento:Double = 0.0
        set(value) {
            if (value in 0.0..100.0) field = value
        }

    //Se calcula el precio aplicando el descuento
    fun calcular() = precio - (precio * (descuento / 100))
}

fun main() {
    val articulo = Producto()

    //While para asegurar que el usuario ingrese un número válido
    while (true) {
        print("Ingrese el precio del producto: ")
        val input = readln().toDoubleOrNull()

        if (input != null && input >= 0) {
            articulo.precio = input
            break
        } else {
            println("Error, el precio debe ser positivo. Intente de nuevo")
        }
    }

    //While para asegurar que el descuento sea un número válido
    while (true) {
        print("Ingrese el descuento (entre 0-100): ")
        val input = readln().toDoubleOrNull()

        if (input != null && input in 0.0..100.0) {
            articulo.descuento = input
            break
        } else {
            println("Error, el descuento debe estar entre 0 y 100. Intente de nuevo")
        }
    }

    println("Precio base: S/ ${articulo.precio}")
    println("Descuento aplicado: ${articulo.descuento}%")
    println("Total a pagar: S/ ${articulo.calcular()}")
}
