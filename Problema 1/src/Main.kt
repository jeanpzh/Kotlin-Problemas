fun main() {
    // Creamos alumnos
    val alumno1 = Alumno("Jack", "Zav")
    val alumno2 = Alumno("Christian", "Cpp")
    val alumno3 = Alumno("Laura", "Torres")
    val alumno4 = Alumno("Miguel", "Hernández")
    val alumno5 = Alumno("Ana", "Gómez")
    val alumno6 = Alumno("Sofía", "Martínez")
    val alumno7 = Alumno("Diego", "Castro")
    val alumno8 = Alumno("Valeria", "Ramírez")
    val alumno9 = Alumno("Luis", "Fernández")
    val alumno10 = Alumno("Carla", "López")
    val alumno11 = Alumno("Pablo", "Méndez")
    val alumno12 = Alumno("Elena", "Vargas")
    val alumno13 = Alumno("Andrés", "Silva")
    val alumno14 = Alumno("Isabel", "Reyes")
    val alumno15 = Alumno("Fernando", "Ortega")
    val alumno16 = Alumno("Paula", "Santos")
    val alumno17 = Alumno("Ricardo", "Morales")
    val alumno18 = Alumno("Camila", "Ríos")
    val alumno19 = Alumno("Javier", "Domínguez")
    val alumno20 = Alumno("María", "Cruz")

    val alumnos = listOf(
        alumno1, alumno2, alumno3, alumno4, alumno5,
        alumno6, alumno7, alumno8, alumno9, alumno10,
        alumno11, alumno12, alumno13, alumno14, alumno15,
        alumno16, alumno17, alumno18, alumno19, alumno20
    )

    val asignatura1 = Asignatura("Calculo II", id = 1)
    val asignatura2 = Asignatura("Sistemas Moviles", id = 2)
    val asignatura3 = Asignatura("LyC", id = 3)

    val alumnosAsignatura = ArrayList<AlumnoAsignatura>()


    for (alumno in alumnos) {
        alumnosAsignatura.add(AlumnoAsignatura(alumno, asignatura2, (1..20).random()))
    }
    alumnosAsignatura.forEach { alumnoAsignatura ->
        println("${alumnoAsignatura?.alumno?.nombre} : nota ${alumnoAsignatura?.nota}")

    }

    val solucion = Algoritmo(alumnosAsignatura)
    val alumnosAsignaturasMaximoPromedio = solucion.obtenerAlumnoPromedioMaximo(2)

    if (alumnosAsignaturasMaximoPromedio == null) println("No hay alumnos en este curso")

    val valores = alumnosAsignaturasMaximoPromedio?.entries?.first()

    println(valores) // key y values
    println("Con nota ${valores?.key} los siguientes estudiantes obtuvieron mayor promedio: ")
    valores?.value?.forEach { alumno ->
        println("${alumno.nombre}" + " " + "${alumno.apellido}")
    }
}