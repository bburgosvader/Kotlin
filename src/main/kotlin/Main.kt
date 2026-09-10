package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val nombreSistema : String = "GameZone"
    val capacidad : Int = 10
    var recaudacionTotal: Double = 800.0

    val codigoConsola: String = "CC12CD"
    val marca: String  = "PlayStation"
    val modelo : String ="PlayStation5"
    val minutoUso : Int = 75
    //val tarifaHora :Double = 800.0

    println("Sistema: $nombreSistema")
    println("Capacidad: $capacidad")
    println("Recaudacion: $recaudacionTotal")
    println("Nueva recaudacion : $recaudacionTotal")


    fun calcularCostoBase(
        minutos: Int,
        tarifaHora: Double
    ):Double{
        return (minutos / 60.0) * tarifaHora
    }

    fun aplicarIva(monto:Double): Double {
        return monto * 1.19
    }

    val minutosUso : Int = 75
    val tarifaHora : Double = 800.0

    val costoBase = calcularCostoBase(minutosUso, tarifaHora)

    val totalConIva = aplicarIva(costoBase)

    println("Costo Base: $costoBase")
    println("Total Con Iva: $totalConIva")

}