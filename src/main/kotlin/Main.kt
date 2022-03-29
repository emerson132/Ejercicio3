fun main(args: Array<String>) {

    var comercial1 = Comercial("Billy",21,1250.0,150.50)
    var comercial2 = Comercial("Antonio",31,1250.0,250.50)
    var comercial3 = Comercial("Alberto",35,1250.0,100.50)

    var repartidor1 = Repartidor("Emerson",24,600.0,"zona 3")
    var repartidor2 = Repartidor("Gabriel",26,600.0,"zona 2")
    var repartidor3 = Repartidor("Jesuscristo",29,600.0,"zona 3")


    comercial1.plus()
    comercial2.plus()
    comercial3.plus()

    repartidor1.plus()
    repartidor2.plus()
    repartidor3.plus()
    
    println(comercial1.salario)
    println(comercial2.salario)
    println(comercial3.salario)

    println(repartidor1.salario)
    println(repartidor2.salario)
    println(repartidor3.salario)
}