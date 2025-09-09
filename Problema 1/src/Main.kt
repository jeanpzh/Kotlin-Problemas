import kotlin.math.*
fun main() {
    println("=== PRÁCTICA 01 JEAN PIERRE MOTTA [22200030] Y CHRISTIAN GUERRERO [22200211] ===\n")
    println("=== PREGUNTA 1: MEJOR ALUMNO Y SUSPENDIDOS ===\n")

    // Creamos alumnos
    val alumno1 = Alumno("Jack", "Zabaleta", 15.0, 18.0, 16.0)
    val alumno2 = Alumno("Christian", "Guerrero", 17.0, 20.0, 13.0)
    val alumno3 = Alumno("Laura", "Torres", 17.0, 19.0, 18.0)
    val alumno4 = Alumno("Miguel", "Hernandez", 10.0, 11.0, 9.0)
    val alumno5 = Alumno("Ana", "Gomez", 16.0, 17.0, 15.0)
    val alumno6 = Alumno("Sofía", "Martínez", 13.0, 12.0, 14.0)
    val alumno7 = Alumno("Diego", "Castro", 8.0, 9.0, 7.0)
    val alumno8 = Alumno("Valeria", "Ramirez", 19.0, 20.0, 18.0)
    val alumno9 = Alumno("Luis", "Fernández", 11.0, 10.0, 12.0)
    val alumno10 = Alumno("Carla", "Lopez", 14.0, 15.0, 13.0)
    val alumno11 = Alumno("Pablo", "Mendez", 9.0, 8.0, 10.0)
    val alumno12 = Alumno("Elena", "Vargas", 17.0, 16.0, 18.0)
    val alumno13 = Alumno("Andrés", "Silva", 12.0, 13.0, 11.0)
    val alumno14 = Alumno("Isabel", "Reyes", 15.0, 14.0, 16.0)
    val alumno15 = Alumno("Fernando", "Ortega", 10.0, 9.0, 11.0)
    val alumno16 = Alumno("Paula", "Santos", 18.0, 19.0, 17.0)
    val alumno17 = Alumno("Ricardo", "Morales", 13.0, 12.0, 14.0)
    val alumno18 = Alumno("Camila", "Rios", 16.0, 15.0, 17.0)
    val alumno19 = Alumno("Javier", "Domínguez", 11.0, 10.0, 12.0)
    val alumno20 = Alumno("María", "Cruz", 19.0, 18.0, 20.0)

    var mejorNombre = ""
    var mejorApellido = ""
    var mejorPromedio = 0.0
    var suspendidos = 0
    var empates = ""  // Para manejar empates
    var numeroEmpates = 0

    // Función para procesar cada alumno
    fun procesarAlumno(alumno: Alumno) {
        val promedio = alumno.calcularPromedio()

        println(
            "${alumno.getNombreCompleto()}: Notas(${alumno.nota1}, ${alumno.nota2}, ${alumno.nota3}) -> Promedio: %.2f".format(
                promedio
            )
        )

        // Verificar si está suspendido
        if (!alumno.estaAprobado()) {
            suspendidos++
        }

        // Verificar si es el mejor promedio o hay empates
        when {
            promedio > mejorPromedio -> {
                mejorPromedio = promedio
                mejorNombre = alumno.nombre
                mejorApellido = alumno.apellido
                empates = ""
                numeroEmpates = 0
            }

            promedio == mejorPromedio && mejorPromedio > 0.0 -> {
                if (numeroEmpates == 0) {
                    empates = "$mejorNombre $mejorApellido"
                    numeroEmpates = 1
                }
                empates += ", ${alumno.nombre} ${alumno.apellido}"
                numeroEmpates++
            }
        }
    }

    procesarAlumno(alumno1)
    procesarAlumno(alumno2)
    procesarAlumno(alumno3)
    procesarAlumno(alumno4)
    procesarAlumno(alumno5)
    procesarAlumno(alumno6)
    procesarAlumno(alumno7)
    procesarAlumno(alumno8)
    procesarAlumno(alumno9)
    procesarAlumno(alumno10)
    procesarAlumno(alumno11)
    procesarAlumno(alumno12)
    procesarAlumno(alumno13)
    procesarAlumno(alumno14)
    procesarAlumno(alumno15)
    procesarAlumno(alumno16)
    procesarAlumno(alumno17)
    procesarAlumno(alumno18)
    procesarAlumno(alumno19)
    procesarAlumno(alumno20)

    println("\n----------RESULTADOS: ------------")

    if (numeroEmpates > 0) {
        println("Se encontro un empate técnico")
        println("Alumnos empatados con el mejor promedio (%.2f): $empates".format(mejorPromedio))
        println("Número de alumnos empatados: ${numeroEmpates + 1}")
    } else {
        println("Mejor alumno: $mejorNombre $mejorApellido")
        println("Promedio más alto: %.2f".format(mejorPromedio))
    }

    println("Número de suspendidos (promedio < 12): $suspendidos")
    println("Número de aprobados: ${20 - suspendidos}")
}

    // Clase Alumno
    class Alumno(val nombre: String, val apellido: String) {
        var nota1: Double = 0.0
        var nota2: Double = 0.0
        var nota3: Double = 0.0

        // Constructor secundario
        constructor(nombre: String, apellido: String, n1: Double, n2: Double, n3: Double) : this(nombre, apellido) {
            this.nota1 = n1
            this.nota2 = n2
            this.nota3 = n3
        }

        fun calcularPromedio(): Double {
            return (nota1 + nota2 + nota3) / 3
        }

        fun estaAprobado(): Boolean {
            return calcularPromedio() >= 12.0
        }

        fun getNombreCompleto(): String {
            return "$nombre $apellido"
        }

        fun mostrarInfo(): String {
            return "${getNombreCompleto()} - Notas: [$nota1, $nota2, $nota3] - Promedio: %.2f - ${if(estaAprobado()) "APROBADO" else "SUSPENDIDO"}".format(calcularPromedio())
        }
    }

