package Codigo;
// 1. Crea una clase Persona con nombre, edad y ciudad
// a)
// Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
// b)
// Crea tres personas y muestra su saludo
// c)
// Agrega un método para verificar si es mayor de edad

public class Persona {
    private String nombre;
    private int edad;
    private String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String mostrarSaludo() {
        return String.format("HOLA MI NOMBRE ES %s Y VIVO EN LA CIUDAD DE %s", this.nombre, this.ciudad);
    }

    public String VerificarMayorEdad() {
        if (this.edad >= 18) {
            return this.nombre + " es mayor de edad";
        } else {
            return this.nombre + " no es mayor de edad";
        }
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Maria", 26, "Cochabamba");
        Persona persona2 = new Persona("Jose", 15, "La Paz");
        Persona persona3 = new Persona("Silvia", 19, "Lima");

        System.out.println(persona1.mostrarSaludo());
        System.out.println(persona2.mostrarSaludo());
        System.out.println(persona3.mostrarSaludo());

        System.out.println(persona1.VerificarMayorEdad());
        System.out.println(persona2.VerificarMayorEdad());
        System.out.println(persona3.VerificarMayorEdad());
    }
}
