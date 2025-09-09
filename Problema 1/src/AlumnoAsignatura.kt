class AlumnoAsignatura {
    var alumno : Alumno
    var asignatura : Asignatura
    var nota : Int = 0 // Es, de hecho es flotante. Pero por temas de testing se hara con int para randomizar notas
    constructor(alumno : Alumno, asignatura : Asignatura, nota : Int) {
        this.alumno = alumno
        this.asignatura = asignatura
        this.nota = nota
    }
}