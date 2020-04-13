fun main(args: Array<String>) {
      val showMenu: String = """
          *********************************
            Selecciona la opción deseada
          *********************************
          1. Hacer receta
          2. Ver mis recetas
          3. Salir
          *********************************
      """.trimIndent()

    do {
        println(showMenu)
        print("Ingrese una opción: ")
        var response: Int? = readLine()?.toInt()

        when(response){
            1 -> println("Ok Hagamos una receta.... :D")
            2 -> println("Ok veamos las recetas.... :D")
            3 -> println("Ok Adios.... :C")
            else -> println("Opción no válida")
        }
        println("")
    }while (response != 3)

}