import model.*
import kotlin.system.exitProcess

val listRecipes: MutableList<Recipe> = ArrayList()

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
            1 -> {
                makeRecipe()
                showMenu()
            }
            2 -> viewRecipe()
            3 -> println("Nos vemos pronto...")
            else -> println("Opción no válida")
        }
        println("")
    } while (response != 3)
    exitProcess(DEFAULT_BUFFER_SIZE)
}

fun makeRecipe() {
    val list: MutableList<Ingredientes> = ArrayList()
    println("Ingrese el nombre de la receta")
    val nameRecipe: String? = readLine()
    var flag: Boolean = true
    while (flag) {
        val namesingredients = """
            _________________________________________________
            La siguiente lista son los posibles ingredientes que podra tener su receta: 
                1.Agua
                2.Leche
                3.Carne
                4.Verduras
                5.Frutas
                6.Cereal
                7.Huevos
                8.Aceite
        """.trimIndent()
        println(namesingredients)
        println("Ingrese el numero correspondiente al tipo de ingrediente que desea ingresar a la receta: ")
        val nameIngredient: String? = readLine()
        when(nameIngredient?.toInt()){
            1->{
                val listWater: MutableList<Agua> = ArrayList()
                listWater.add( Agua("Agua de manantial", 0,true))
                listWater.add( Agua("Agua de grifo", 0,false))
                var agua :Agua? = null
                println("Ingrese el tipo de agua que desea:")
                for((index,water) in listWater.withIndex())
                    println("${index + 1}. ${water.nombre} ")
                val typeSelected = readLine()
                println("Ingrese la cantidad que desea agregar: ")
                val cant : Int?= readLine()?.toInt()
                when(typeSelected?.capitalize()){
                    "1"->{ if(cant != null) listWater[0].cantidad = cant
                        agua = listWater[0]}
                    "2"-> { if(cant != null) listWater[1].cantidad = cant
                        agua = listWater[1]}
                    else -> {println("No se ha logrado ingresar ese ingrediente, por favor vuelva a intentarlo")
                        makeRecipe()}
                }
                if (agua != null) {
                    list.add(agua)
                }
            }
            2->{
                val listMilk: MutableList<Leche> = ArrayList()
                listMilk.add(Leche("Leche de vaca", 0, "Vaca") )
                listMilk.add(Leche("Leche de cabra", 0, "Cabra") )
                listMilk.add(Leche("Leche de oveja", 0, "Oveja") )
                listMilk.add(Leche("Leche de Camello", 0, "Camello") )
                var leche : Leche? = null
                println("Ingrese el tipo de leche que desea:")
                for((index,milk) in listMilk.withIndex())
                    println("${index + 1}. ${milk.nombre} ")
                val typeSelected = readLine()
                println("Ingrese la cantidad que desea agregar: ")
                val cant : Int?= readLine()?.toInt()
                when(typeSelected){
                    "1"-> { if(cant != null) listMilk[0].cantidad = cant
                        leche = listMilk[0]}
                    "2"->{ if(cant != null) listMilk[1].cantidad = cant
                        leche = listMilk[1]}
                    "3"-> { if(cant != null) listMilk[2].cantidad = cant
                        leche = listMilk[2]}
                    "4"-> { if(cant != null) listMilk[3].cantidad = cant
                        leche = listMilk[3]}
                    else -> {println("No se ha logrado ingresar ese ingrediente, por favor vuelva a intentarlo")
                        makeRecipe()}
                }
                if(leche != null)
                    list.add(leche)
            }
            3->{ val listCarnes: MutableList<Carnes> = ArrayList()
                listCarnes.add(Carnes("Carne de res", 0, "Res"))
                listCarnes.add(Carnes("Carne de cerdo", 0, "Cerdo"))
                listCarnes.add(Carnes("Pollo", 0, "Pollos"))
                listCarnes.add(Carnes("Pescados", 0, "Peces"))
                var carne : Carnes? = null
                println("Ingrese el tipo de carne que desea:")
                for((index,value) in listCarnes.withIndex())
                    println("${index + 1}. ${value.nombre} ")
                val typeSelected = readLine()
                println("Ingrese la cantidad que desea agregar: ")
                val cant : Int?= readLine()?.toInt()
                when(typeSelected){
                    "1"->  { if(cant != null) listCarnes[0].cantidad = cant
                        carne = listCarnes[0]}
                    "2"->  { if(cant != null) listCarnes[1].cantidad = cant
                        carne = listCarnes[1]}
                    "3"->  { if(cant != null) listCarnes[2].cantidad = cant
                        carne = listCarnes[2]}
                    "4"->  { if(cant != null) listCarnes[2].cantidad = cant
                        carne = listCarnes[2]}
                    else -> {println("No se ha logrado ingresar ese ingrediente, por favor vuelva a intentarlo")
                        makeRecipe()}
                }
                if(carne != null)
                    list.add(carne)}
            4->{ val listVegetables: MutableList<Verduras> = ArrayList()
                listVegetables.add(Verduras("Lechuga", 0, "Verde"))
                listVegetables.add(Verduras("Tomate", 0, "Rojo"))
                listVegetables.add(Verduras("Zanahoria", 0, "Anaranjado"))
                listVegetables.add(Verduras("Brocoli", 0, "Verde"))
                listVegetables.add(Verduras("Apio", 0, "Verde"))
                var verdura : Verduras? = null
                println("Ingrese la verdura  que desea:")
                for((index,value) in listVegetables.withIndex())
                    println("${index + 1}. ${value.nombre} ")
                val typeSelected = readLine()
                println("Ingrese la cantidad que desea agregar: ")
                val cant : Int?= readLine()?.toInt()
                when(typeSelected){
                    "1"->  { if(cant != null) listVegetables[0].cantidad = cant
                        verdura = listVegetables[0]}
                    "2"->  { if(cant != null) listVegetables[1].cantidad = cant
                        verdura = listVegetables[1]}
                    "3"->{ if(cant != null) listVegetables[2].cantidad = cant
                        verdura = listVegetables[2]}
                    "4"->  { if(cant != null) listVegetables[3].cantidad = cant
                        verdura = listVegetables[3]}
                    "5"-> { if(cant != null) listVegetables[4].cantidad = cant
                        verdura = listVegetables[4]}
                    else -> {println("No se ha logrado ingresar ese ingrediente, por favor vuelva a intentarlo")
                        makeRecipe()}
                }
                if(verdura != null)
                    list.add(verdura)}
            5->{  val listFruits: MutableList<Fruta> = ArrayList()
                listFruits.add(Fruta("Manzana", 0, true))
                listFruits.add(Fruta("Limon", 0, false))
                listFruits.add(Fruta("Naranja", 0, false))
                listFruits.add(Fruta("Banano", 0, true) )
                listFruits.add(Fruta("Mango", 0, true) )

                var fruta : Fruta? = null
                println("Ingrese la fruta  que desea:")
                for((index,value) in listFruits.withIndex())
                    println("${index + 1}. ${value.nombre} ")
                val typeSelected = readLine()
                println("Ingrese la cantidad que desea agregar: ")
                val cant : Int?= readLine()?.toInt()
                when(typeSelected){
                    "1"-> { if(cant != null) listFruits[0].cantidad = cant
                        fruta = listFruits[0] }
                    "2"->  { if(cant != null) listFruits[1].cantidad = cant
                        fruta = listFruits[1] }
                    "3"->  { if(cant != null) listFruits[2].cantidad = cant
                        fruta = listFruits[2] }
                    "4"-> { if(cant != null) listFruits[3].cantidad = cant
                        fruta = listFruits[3] }
                    "5"->  { if(cant != null) listFruits[4].cantidad = cant
                        fruta = listFruits[4] }
                    else -> {println("No se ha logrado ingresar ese ingrediente, por favor vuelva a intentarlo")
                        makeRecipe()}
                }
                if(fruta != null)
                    list.add(fruta)}
            6->{  val listCereals: MutableList<Cereal> = ArrayList()
                listCereals.add(Cereal("Cereal de trigo", 0, "Trigo") )
                listCereals.add(Cereal("Cereal de avena", 0, "Avena") )
                listCereals.add(Cereal("Cereal de maiz", 0, "Maiz") )
                var cereal : Cereal? = null
                println("Ingrese el tipo de cereal  que desea:")
                for((index,value) in listCereals.withIndex())
                    println("${index + 1}. ${value.nombre} ")
                val typeSelected = readLine()
                println("Ingrese la cantidad que desea agregar: ")
                val cant : Int?= readLine()?.toInt()
                when(typeSelected){
                    "1"-> { if(cant != null) listCereals[0].cantidad = cant
                        cereal = listCereals[0] }
                    "2"-> { if(cant != null) listCereals[1].cantidad = cant
                        cereal = listCereals[1] }
                    "3"->{ if(cant != null) listCereals[2].cantidad = cant
                        cereal = listCereals[2] }

                    else -> {println("No se ha logrado ingresar ese ingrediente, por favor vuelva a intentarlo")
                        makeRecipe()}
                }
                if(cereal != null)
                    list.add(cereal)}

            7->{ val listEggs: MutableList<Huevos> = ArrayList()
                listEggs.add( Huevos("Huevos de gallina", 0, "Gallina") )
                listEggs.add( Huevos("Huevos de avestruz", 0, "Aveztrus") )
                listEggs.add( Huevos("Huevos de codorniz", 0, "Codorniz") )
                var huevo : Huevos? = null
                println("Ingrese el tipo de huevo  que desea:")
                for((index,value) in listEggs.withIndex())
                    println("${index + 1}. ${value.nombre} ")
                val typeSelected = readLine()
                println("Ingrese la cantidad que desea agregar: ")
                val cant : Int?= readLine()?.toInt()
                when(typeSelected){
                    "1"->{ if(cant != null) listEggs[0].cantidad = cant
                        huevo = listEggs[0]}
                    "2"-> { if(cant != null) listEggs[1].cantidad = cant
                        huevo = listEggs[1]}
                    "3"-> { if(cant != null) listEggs[2].cantidad = cant
                        huevo = listEggs[2]}

                    else -> {println("No se ha logrado ingresar ese ingrediente, por favor vuelva a intentarlo")
                        makeRecipe()}
                }
                if(huevo != null)
                    list.add(huevo)}
            8->{ val listOils: MutableList<Aceites> = ArrayList()
                listOils.add(Aceites("Aceite de girasol", 0, "Girasol"))
                listOils.add(Aceites("Aceite de olivo", 0, "Olivo"))
                listOils.add(Aceites("Aceite de coco", 0, "Coco"))
                var aceite : Aceites? = null
                println("Ingrese el tipo de aceite  que desea:")
                for((index,value) in listOils.withIndex())
                    println("${index + 1}. ${value.nombre} ")
                val typeSelected = readLine()
                println("Ingrese la cantidad que desea agregar: ")
                val cant : Int?= readLine()?.toInt()
                when(typeSelected){
                    "1"->  { if(cant != null) listOils[0].cantidad = cant
                        aceite = listOils[0]}
                    "2"->  { if(cant != null) listOils[1].cantidad = cant
                        aceite = listOils[1]}
                    "3"->  { if(cant != null) listOils[2].cantidad = cant
                        aceite = listOils[2]}

                    else -> {println("No se ha logrado ingresar ese ingrediente, por favor vuelva a intentarlo")
                        makeRecipe()}
                }
                if(aceite != null)
                    list.add(aceite)}

            else -> println("Ha ingresado un dato incorrecto, por favor vuelva a intentarlo")

        }
        println("Desea agregar otro ingrediente?(Si/No)")
        val askNextIngredient: String? = readLine()
        flag = askNextIngredient?.capitalize().equals("Si")
    }
    listRecipes.add(Recipe(nameRecipe, list))
}

fun viewRecipe() {
    val title = """
        
        
        
        **************************************
                  Ver Mis Recetas
        **************************************

    """.trimIndent()
    println(title)
    val showRecipe = {
        for ((index, recipe) in listRecipes.withIndex()) {
            println("Esta viendo la receta  ${index + 1}  ${recipe.nombreReceta}")
        }
    }

    showRecipe()
    println("Ingrese el numero de la receta que desea ver los ingredientes: ")
    val numberSelected = readLine()
    if (numberSelected != null) {
        val recipeSelected = listRecipes[numberSelected.toInt() - 1]
        println("La receta esta compuesta por los siguientes ingredientes")
        for ((index,ingredient) in recipeSelected.Ingredientes.withIndex())
            println("${index + 1}. ${ingredient.nombre} y  en una cantidad de ${ingredient.cantidad}")
    }

    showMenu()
}