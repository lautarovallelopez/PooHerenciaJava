package Clases;
/*
* Crear el código para la clase base Empleado. Esta clase contiene:
• Un atributo privado nombre de tipo String que heredan el resto de clases.
• Un constructor por defecto.
• Un constructor con parámetros que inicializa el nombre con el String que recibe.
• Método set y get para el atributo nombre.
• Un método toString() que devuelve el String: "Empleado " + nombre.
* */
public class Empleado {
    private String nombre;
    public Empleado(){}
    public Empleado(String nombre){
        this.setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String toString() {
        return "Empleado " + this.getNombre();
    }
}
