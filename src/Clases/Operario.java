package Clases;
/*
* Vamos a crear es la clase Operario que hereda de forma directa de la clase Empleado. Recuerde que
en Java la herencia se expresa mediante la palabra extends. Ejemplo: Operario extends Empleado
indica que la clase Operario deriva o hereda de la clase Empleado. La clase Operario hereda de
Empleado el atributo nombre, los métodos get y set y el método toString(). El constructor de la clase
recibe el nombre del empleado y lo pasa al constructor de la clase base mediante la instrucción
super(nombre). En esta clase se modifica (override) el método toString() heredado de la clase base
para que muestre un mensaje como pide el ejercicio
* */
public class Operario extends Empleado{
    public Operario(String nombre) {
        super(nombre);
    }
    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
}
