class Solucion {
    var n : Int = 0

    constructor(n : Int) {
        this.n = n
    }
    fun sumaNConsecutivos() : Int {
        return (this.n* (this.n + 1))/2
    }
}


fun main() {
    // Realizar un algoritmo en que me permita hallar la suma de los n números consecutivos.
    val solucion = Solucion(5)
    println("\n=== PREGUNTA 2: Suma de los primeros N términos ===\n")
    println("La suma de los 5 primeros numeros consecutivos es: " + solucion.sumaNConsecutivos())

}