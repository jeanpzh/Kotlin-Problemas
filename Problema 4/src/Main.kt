fun main() {
    val distancia: Double = 500.0
    val velocidadA: Double = 90.0
    val velocidadB: Double = 70.0

    // Función para calcular tiempo en horas
    fun calcularTiempoHoras(distancia: Double, velocidadA: Double, velocidadB: Double): Double {
        return distancia / (velocidadA + velocidadB)
    }

    val tiempoHoras = calcularTiempoHoras(distancia, velocidadA, velocidadB)
    val horas = tiempoHoras.toInt()
    val minutos = ((tiempoHoras - horas) * 60).toInt()

    println("El tiempo será de $horas horas y $minutos minutos")
}
