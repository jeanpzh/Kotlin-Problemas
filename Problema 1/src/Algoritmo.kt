

class Algoritmo {
    var alumnosAsignaturas : MutableList<AlumnoAsignatura> = mutableListOf()
    constructor(alumnos : MutableList<AlumnoAsignatura>) {
        this.alumnosAsignaturas = alumnos
    }
    fun obtenerAlumnoPromedioMaximo(idCurso : Int) : MutableMap<Int, ArrayList<Alumno>>? {

        var alumnos = this.alumnosAsignaturas.filter{it.asignatura?.id == idCurso}

        if (alumnos.isEmpty()) return null

        var alumnosConMayorPromedio : MutableMap<Int, ArrayList<Alumno>> = mutableMapOf()
        var max : Int = 0

        for (alumno in alumnos) {
            if (alumno.nota > max) {
                alumnosConMayorPromedio.clear()
                max = alumno.nota
                alumnosConMayorPromedio[max] = arrayListOf(alumno.alumno)
            }
            else if (alumno.nota == max) {
                alumnosConMayorPromedio[max]?.add(alumno.alumno)
            }
        }
        return alumnosConMayorPromedio
    }
}