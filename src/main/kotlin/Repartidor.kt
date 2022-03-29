
class Repartidor : Empleado {
    override var nombre: String = ""
    override var edad: Int = 0
    override var salario: Double = 0.0
    var zona: String = ""
    constructor()

    constructor(nombre: String, edad: Int, salario: Double, zona: String){
        this.nombre = nombre
        this.edad = edad
        this.salario = salario
        this.zona = zona
    }

    override fun plus() {
        if(edad < 25 && zona == "zona 3"){
            salario += plus
        }
    }
}