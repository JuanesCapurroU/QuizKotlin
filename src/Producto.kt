class Producto(var codigo:String, var nombre:String, var precio:Double, var cantidad:Int) {

    override fun toString(): String {
        return "Producto(codigo='$codigo', nombre='$nombre', precio=$precio, cantidad=$cantidad)"
    }

    open fun venderProducto(cantidadP:Int){
        cantidad-=cantidadP
    }
    open fun reponerStock(StockT:Int){
        cantidad +=StockT
    }
    open fun aplicarDescuento(){
        precio = (precio-((precio*0.02)))
    }
    open fun mostrarInfo(){
        println("""
            Informacion del Producto:
            Codigo: ${codigo}
            Nombre: ${nombre}
            Precio: ${precio}
            Cantidad: ${cantidad}
        """.trimIndent())
    }
    open fun aumentarPrecio(){

        precio= precio+(precio*0.06)

    }
    open fun calcularValorTotalInventario(){
        var calculo= cantidad*precio
        println("El valor total del inventario es:$ ${calculo}")
    }
}