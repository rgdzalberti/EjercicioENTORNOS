//Debajo de este main está el ejercicio 3,4 comentado para tener ambos ejercicios en un solo main.

var edad: Int = 30

fun imprimirVelas(edad: Int){
    repeat(edad) {print("¡️")}
}

fun imprimirCapaSup(edad: Int){
    repeat(edad) {print("=")}
}

fun imprimirCapasInf(edad: Int, nCapas: Int){
    repeat(nCapas) {repeat(edad) {print("@")}; println("")}}

fun imprimirMensaje(mensaje: String)
{
    repeat(edad/2 - 3){print("•")};print("®$mensaje®");repeat(edad/2 - 3){print("•")}
}


fun main() {

    imprimirVelas(edad)
    println("")
    imprimirCapaSup(edad)
    println("")
    imprimirCapasInf(edad,5)
    imprimirMensaje("MUCHAS FELICIDADES")

}



/*
//Ejercicio 3 y 4

var edad: Int = 0

fun imprimirVelas(edad: Int){
    repeat(edad) {print("¡️")}
}

fun imprimirCapaSup(edad: Int){
    repeat(edad) {print("=")}
}

fun imprimirCapasInf(edad: Int, nCapas: Int){
    repeat(nCapas) {repeat(edad) {print("@")}; println("")}}

fun imprimirMensaje(mensaje: String)
{
    repeat(edad/2 - 3){print("•")};print("®$mensaje®");repeat(edad/2 - 3){print("•")}
}


fun main() {

    var capas: Int = 0
    var mensaje: String = ""

    print("Introduce la edad: ")
    edad = readLine()?.toInt()!!
    print("Introduce las capas: ")
    capas = readLine()?.toInt()!!
    print("Introduce el mensaje a mostrar:  ")
    mensaje = readLine()!!

    imprimirVelas(edad)
    println("")
    imprimirCapaSup(edad)
    println("")
    imprimirCapasInf(edad,capas)
    imprimirMensaje("$mensaje")

}


 */