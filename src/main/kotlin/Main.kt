package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val nombreSistema: String = "GameZone"
    val capacidad: Int = 10
    var recaudacionTotal: Double = 800.0

    val codigoConsola: String = "CC12CD"
    val marca: String = "PlayStation"
    val modelo: String = "PlayStation5"
    val minutoUso: Int = 75
    //val tarifaHora :Double = 800.0

    println("Sistema: $nombreSistema")
    println("Capacidad: $capacidad")
    println("Recaudacion: $recaudacionTotal")
    println("Nueva recaudacion : $recaudacionTotal")


    fun calcularCostoBase(
        minutos: Int,
        tarifaHora: Double
    ): Double {
        return (minutos / 60.0) * tarifaHora
    }

    fun aplicarIva(monto: Double): Double {
        return monto * 1.19
    }

    val minutosUso: Int = 75
    val tarifaHora: Double = 800.0

    val costoBase = calcularCostoBase(minutosUso, tarifaHora)

    val totalConIva = aplicarIva(costoBase)

    println("Costo Base: $costoBase")
    println("Total Con Iva: $totalConIva")

    val tipoUsuario = "Socio"

    fun describirTipoUsuario(tipoUsuario: String): String {
        return when (tipoUsuario) {
            "infantil" -> "Usuario infantil"
            "socio" -> "Usuario socio"
            "educacional" -> "Usuario educacional"
            else -> "Tipo de usuario invalido"
        }
    }

    fun aplicarBeneficioUsuario(
        monto: Double,
        tipoUsuario: String
    ): Double {
        return when (tipoUsuario) {
            "socio" -> monto * 0.80
            "educacional" -> monto * 0.50
            "infantil" -> monto
            else -> monto
        }
    }

    val monto = 1000.0

    println(aplicarBeneficioUsuario(monto, "infantil"))
    println(aplicarBeneficioUsuario(monto, "socio"))
    println(aplicarBeneficioUsuario(monto, "educacional"))


    val Consola = Consola(
        codigo = "CC12CD",
        marca = "Sony",
        modelo = "PlayStation 5",
        tipoUsuario = "Socio"
    )

    println(Consola.codigo)
    println(Consola.marca)
    println(Consola.modelo)
    println(Consola.tipoUsuario)

    val clasica = ConsolaClasica(
        "CC12CD",
        "Sony",
        "PlayStation 5",
        "socio"
    )

    val moderna = ConsolaModerna(
        "CM22TO",
        "Nintendo",
        "Switch",
        "infantil"
    )

    val vr = ConsolaVR(
        "VR44RG",
        "Meta",
        "Quest 3",
        "educacional",
        true
    )

    println(vr.codigo)
    println(clasica.codigo)
    println(moderna.codigo)

    val consolas: List<Consola> = listOf(
        ConsolaClasica(
            "CC12CD",
            "Sony",
            "PlayStation 5",
            "socio"
        ),
        ConsolaModerna(
            "CM22TO",
            "Nintendo",
            "Switch",
            "infantil"
        ),
        ConsolaVR(
            "VR44RG",
            "Meta",
            "Quest 3",
            "educacional",
            true
        )
    )

    val puesto = Puesto(1)

    println(puesto.describirEstado(puesto))

    puesto.estado = EstadoPuesto.EnProceso(
        "registrando entrada"
    )

    println(puesto.describirEstado(puesto))

    puesto.estado = EstadoPuesto.EnReparacion(
        "mantenimiento preventivo"
    )

    val puestos: MutableList<Puesto> = mutableListOf()

    for (numero in 1..10) {
        puestos.add(Puesto(numero))
    }

    puestos.forEach { puesto ->
        println(
            "Puesto ${puesto.numero}: " +
                    puesto.describirEstado(puesto)
        )
    }

    val historial: MutableList<Consola> =
        mutableListOf()

    historial.add(
        ConsolaClasica(
            "CC12CD",
            "Sony",
            "PlayStation 5",
            "socio"
        )
    )

    historial.add(
        ConsolaModerna(
            "CM22TO",
            "Nintendo",
            "Switch",
            "infantil"
        )
    )

    for (consola in historial) {
        println(
            "${consola.codigo} - " +
                    "${consola.marca} ${consola.modelo}"
        )
    }


    var puestoLibre: Puesto? = null

    for (puesto in puestos) {

        if (puesto.estado is EstadoPuesto.Libre) {
            puestoLibre = puesto
            break
        }
    }
}