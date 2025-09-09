//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*Diseñar un algoritmo que permita calcular la suma de los primeros N términos de la siguiente serie:
    *   1 - 1/√3 + 1/√5 - 1/√7 +…
    * */
    var n = readLine()!!.toInt()
    var suma : Double = 0.0
    for (i  in 1..n) {
        val signo = if (i % 2 == 0) -1 else 1
        suma += signo * Math.sqrt((2 * i + 1).toDouble())
    }
    print(suma)
}