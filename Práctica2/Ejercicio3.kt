//Problema 3: Sistema de gestión de biblioteca con interfaces, herencia y colecciones
//Autor: Urday Jerí, Joel Robert
//Fecha creación: 5 de abril de 2026
//Fecha última modificación: 5 de abril de 2026

//Clase base abstracta
abstract class Material(val titulo:String, val autor:String, val anio:Int) {
    abstract fun mostrarDetalles()
}

//Subclase para Libros
class Libro(titulo:String, autor:String, anio:Int, val genero:String, val paginas:Int):Material(titulo, autor, anio) {
    override fun mostrarDetalles() {
        println("Libro: $titulo, autor: $autor, género: $genero, páginas: $paginas, año: $anio")
    }
}

//Subclase para Revistas
class Revista(titulo:String, autor:String, anio:Int, val issn:String, val volumen:Int, val numero:Int, val editorial:String):Material(titulo, autor, anio) {
    override fun mostrarDetalles() {
        println("Revista: $titulo, ISSN: $issn, vol: $volumen Nro: $numero, editorial: $editorial, año: $anio")
    }
}

//Clase de datos para el usuario
data class Usuario(val nombre:String, val apellido:String, val edad:Int)

//Interfaz que define las operaciones permitidas
interface IBiblioteca {
    fun registrarMaterial(material:Material)
    fun registrarUsuario(usuario:Usuario)
    fun prestamo(usuario:Usuario, material:Material)
    fun devolucion(usuario:Usuario, material:Material)
    fun mostrarDisponibles()
    fun mostrarReservados(usuario:Usuario)
}

//Clase principal que organiza la lógica
class Biblioteca:IBiblioteca {
    val materialesDisponibles = mutableListOf<Material>()
    val prestamos = mutableMapOf<Usuario, MutableList<Material>>()

    override fun registrarMaterial(material:Material) {
        materialesDisponibles.add(material)
    }

    override fun registrarUsuario(usuario:Usuario) {
        if (!prestamos.containsKey(usuario)) {
            prestamos[usuario] = mutableListOf()
        }
    }

    override fun prestamo(usuario:Usuario, material:Material) {
        if (materialesDisponibles.contains(material)) {
            materialesDisponibles.remove(material)
            prestamos[usuario]?.add(material)
            println("Préstamo realizado '${material.titulo}'")
        } else {
            println("El libro '${material.titulo}' no está disponible.")
        }
    }

    override fun devolucion(usuario:Usuario, material:Material) {
        if (prestamos[usuario]?.contains(material) == true) {
            prestamos[usuario]?.remove(material)
            materialesDisponibles.add(material)
            println("Devolución realizada '${material.titulo}'")
        } else {
            println("Error, el usuario no tiene este material")
        }
    }

    override fun mostrarDisponibles() {
        println("\nMateriales disponibles:")
        if (materialesDisponibles.isEmpty()) println("No hay materiales en estantería")
        materialesDisponibles.forEach { it.mostrarDetalles() }
    }

    override fun mostrarReservados(usuario:Usuario) {
        println("\nMateriales de ${usuario.nombre} ${usuario.apellido}:")
        val lista = prestamos[usuario]
        if (lista.isNullOrEmpty()) {
            println("No tiene materiales en préstamo")
        } else {
            lista.forEach { it.mostrarDetalles() }
        }
    }
}

fun main() {
    val biblioteca = Biblioteca()

    //1. Crear materiales (Instancias de las subclases)
    val libro1 = Libro("La tía Julia y el escribidor", "Mario Vargas Llosa", 1977, "Novela", 448)
    val revista1 = Revista("Time", "Time USA, LLC", 2026, "0040-781X", 207, 10, "Time Publishing")

    //2. Registrar materiales y usuarios
    biblioteca.registrarMaterial(libro1)
    biblioteca.registrarMaterial(revista1)

    val usuarioJoel = Usuario("Joel", "Urday", 24) //Ejemplo de usuario
    biblioteca.registrarUsuario(usuarioJoel)

    //3. Ejecutar operaciones
    biblioteca.mostrarDisponibles()

    println("\nPréstamos:")
    biblioteca.prestamo(usuarioJoel, libro1)

    biblioteca.mostrarDisponibles()
    biblioteca.mostrarReservados(usuarioJoel)

    println("\nDevolución:")
    biblioteca.devolucion(usuarioJoel, libro1)
    biblioteca.mostrarDisponibles()
}
