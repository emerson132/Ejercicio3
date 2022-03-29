class Comercial : Empleado {
    override var nombre: String = ""
    override var edad: Int = 0
    override var salario: Double = 0.0
    var comision: Double = 0.0
    constructor()

    constructor(nombre: String, edad: Int, salario: Double, comision: Double){
        this.nombre = nombre
        this.edad = edad
        this.salario = salario
        this.comision = comision
    }

    override fun plus() {
        if(edad > 30 && comision > 200){
            salario += plus
        }
    }
}