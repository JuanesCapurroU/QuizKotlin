fun main() {
    val productos =  mutableListOf<Producto>()
    var opcion =0;


    do {

        println("""
            Bienvenido al menu del Mercado
            1. Registrar Producto
            2. Vender Producto
            3. Reponer Stock
            4. Aplicar Descuento
            5. MOstrar Informacion
            6. Aumentar Precio
            7. Calcular Valor Total
            8. Eliminar Productos
            9. Salir
        """.trimIndent())
        opcion = readln().toInt();
        when (opcion){
            1->{
                println("REGISTRAR PRODUCTO")
                println("Codigo: ")
                val codigo = readln()
                println("Nombre: ")
                val nombre = readln()
                println("Precio: ")
                val precio = readln().toDouble()
                println("Cantidad: ")
                val cantidad = readln().toInt()

                val producto = Producto(codigo,nombre,precio,cantidad)
                productos.add(producto)
                println("Producto Registrado con Exito.")
            }
            2->{
                println("VENDER PRODUCTO")
                if (productos.isEmpty()){
                    println("No hay productos..")
                }else{
                    println("Codigo del producto: ")
                    var codigoProducto = readln()
                    val productoSeleccionado= productos.find { it.codigo==codigoProducto }
                    if (productoSeleccionado !=null){
                        println("Ingrese cuandos productos va a vender: ")
                        var productosVender= readln().toInt()
                        productoSeleccionado.venderProducto(productosVender)
                        println("Producto vendido correctamente...")
                    }
                }
            }
            3->{
                println("REPONER STOCK")
                if (productos.isEmpty()){
                    println("No hay productos..")
                }else{
                    println("Codigo del producto: ")
                    var codigoProducto = readln()
                    val productoSeleccionado= productos.find { it.codigo==codigoProducto }
                    if (productoSeleccionado !=null){
                        println("Ingrese cuandos productos va a añadir al Stock: ")
                        var productosStock= readln().toInt()
                        productoSeleccionado.reponerStock(productosStock)
                        println("Stock renovado correctamente... ")
                    }
                }
            }
            4->{
                println("APLICATIVO DE DESCUENTO")
                if (productos.isEmpty()){
                    println("No hay productos..")
                }else{
                    println("Codigo del producto para aplicar descuento: ")
                    var codigoProducto = readln()
                    val productoSeleccionado= productos.find { it.codigo==codigoProducto }
                    if (productoSeleccionado !=null){
                        productoSeleccionado.aplicarDescuento()
                        println("Producto aplicado descuento, nuevo precio: ${productoSeleccionado.precio}")
                    }
                }

            }
            5->{
                println("MOSTRAR INFORMACION")
                if (productos.isEmpty()){
                    println("No hay productos..")
                }else{
                    println("Codigo del producto al saber la info: ")
                    var codigoProducto = readln()
                    val productoSeleccionado= productos.find { it.codigo==codigoProducto }
                    if (productoSeleccionado !=null){
                        productoSeleccionado.mostrarInfo()
                    }
                }
            }
            6->{
                println("AUMENTAR PRECIO")
                if (productos.isEmpty()){
                    println("No hay productos..")
                }else{
                    println("Codigo del producto: ")
                    var codigoProducto = readln()
                    val productoSeleccionado= productos.find { it.codigo==codigoProducto }
                    if (productoSeleccionado !=null){
                        println("PRECIO ANTIGUO: ${productoSeleccionado.precio}")
                        productoSeleccionado.aumentarPrecio()
                        println("PRECIO NUEVO CON EL 6%: ${productoSeleccionado.precio}")
                    }
                }
            }
            7->{
                println("CALCULAR PRECIO TOTAL DE UN PRODUCTO POR STOCK")
                if (productos.isEmpty()){
                    println("No hay productos..")
                }else{
                    println("Codigo del producto: ")
                    var codigoProducto = readln()
                    val productoSeleccionado= productos.find { it.codigo==codigoProducto }
                    if (productoSeleccionado !=null){
                        productoSeleccionado.calcularValorTotalInventario()
                    }
                }
            }
            8->{
                println("ELIMINAR PRODUCTO")
                if (productos.isEmpty()){
                    println("No hay productos..")
                }else{
                    println("Codigo del producto: ")
                    var codigoProducto = readln()
                    val productoSeleccionado= productos.find { it.codigo==codigoProducto }
                    if (productoSeleccionado !=null){
                        println("Producto: ${productoSeleccionado.nombre} eliminado exitosamente...")
                        productos.remove(productoSeleccionado)
                    }
                }
            }
        }

    }while (opcion!=9)
}