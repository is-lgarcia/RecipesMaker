import kotlin.system.exitProcess

fun main(args: Array<String>) {
    showMenu()

}

fun showMenu() {
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

        when (response) {
            1 -> makeRecipe()
            2 -> viewRecipe()
            3 -> println("Ok Adios.... :C")
            else -> println("Opción no válida")
        }
        println("")
    } while (response != 3)
    exitProcess(DEFAULT_BUFFER_SIZE)
}

fun makeRecipe(){
    val optionsRecipe = """
        
        
        
        *************************************
                    Hacer Receta
        *************************************
        Selecciona por categoría el 
        ingrediente que buscas: 
        
            1. Agua
            2. Leche
            3. Carne
            4. Verduras
            5. Frutas
            6. Cereal
            7. Huevos
            8. Aceites
            
        *************************************
    """.trimIndent()
    println(optionsRecipe)
    print("Escoge una opción: ")
    var response: Int? = readLine()?.toInt()
    println("")
    when(response){
        1 -> println("Escogiste Agua")
        2 -> println("Escogiste Leche")
        3 -> println("Escogiste Carnes")
        4 -> println("Escogiste Verduras")
        5 -> println("Escogiste Frutas")
        6 -> println("Escogiste Cereal")
        7 -> println("Escogiste HUevos")
        8 -> println("Escogiste Aceites")
        else -> println("Opcion no válida")
    }
    showMenu()
}

fun viewRecipe(){
    val title = """
        
        
        
        **************************************
                  Ver Mis Recetas
        **************************************
        
        De momento no tienes recetas
    """.trimIndent()
    println(title)
    showMenu()
}