package model

interface IIngredientesAction {
        fun mostrarLista()
        fun agregarIngredienteDeseado(valor: Int)
        fun mostrarListaDeseados(ingrediente: Int)

}