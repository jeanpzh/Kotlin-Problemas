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
    println(solucion.sumaNConsecutivos())

}