//Problema 2: Programa para calcular el área y perímetro de figuras con clase abstracta y herencia
//Autor: Urday Jerí, Joel Robert
//Fecha creación: 5 de abril de 2026
//Fecha última modificación: 5 de abril de 2026

//Clase abstracta que sirve como molde para las figuras
abstract class Shape {
    var area:Double = 0.0
    var perimetro:Double = 0.0

    //Funciones que cada figura debe usar para sus propios cálculos
    abstract fun calcularArea()
    abstract fun calcularPerimetro()

    fun resultado() {
        println("Área: $area \nPerímetro: $perimetro")
    }
}

class Cuadrado(var lado:Double):Shape() {
    override fun calcularArea() {area = lado * lado}
    override fun calcularPerimetro() {perimetro = 4 * lado}
}

class Circulo(var radio:Double):Shape() {
    override fun calcularArea() {area = 3.1416 * radio * radio}
    override fun calcularPerimetro() {perimetro = 2 * 3.1416 * radio}
}

class Rectangulo(var base:Double, var altura:Double):Shape() {
    override fun calcularArea() {area = base * altura}
    override fun calcularPerimetro() {perimetro = 2 * (base + altura)}
}

fun main() {
    while (true) {
        println("\nCálculo del área y perímetro de:")
        println("1. Cuadrado\n2. Círculo\n3. Rectángulo\n4. Salir")
        print("Seleccione una opción: ")

        val opcion = readln().toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                val lado = leer("Ingrese el lado del cuadrado: ")
                val cuadrado = Cuadrado(lado)
                cuadrado.calcularArea()
                cuadrado.calcularPerimetro()
                cuadrado.resultado()
            }
            2 -> {
                val radio = leer("Ingrese el radio del círculo: ")
                val circulo = Circulo(radio)
                circulo.calcularArea()
                circulo.calcularPerimetro()
                circulo.resultado()
            }
            3 -> {
                val b = leer("Ingrese la base del rectángulo: ")
                val a = leer("Ingrese la altura del rectángulo: ")
                val rect = Rectangulo(b, a)
                rect.calcularArea()
                rect.calcularPerimetro()
                rect.resultado()
            }
            4 -> {
                println("\nApagando calculadora")
                break
            }
            else -> println("Opción no válida")
        }
    }
}

//Para verificar la entrada, asegurando que los valores de las figuras sean correctos
fun leer(mensaje:String):Double {
    while (true) {
        print(mensaje)
        val valor = readln().toDoubleOrNull()
        if (valor != null && valor > 0) return valor
        println("Error, ingrese un número positivo")
    }
}
