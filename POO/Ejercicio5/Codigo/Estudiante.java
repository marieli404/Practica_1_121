// 5. Crea una clase Estudiante con nombre, nota_1, nota_2
// a)
// Agrega un método para calcular el promedio
// b)
// Agrega un método para verificar si aprobó (promedio >=6)
// c)
// Crea tres estudiantes, muestra sus promedios y si aprobaron

package POO.Ejercicio5.Codigo;

public class Estudiante {
    private String nombre;
    private int nota1, nota2;

    public Estudiante(String nombre, int nota1, int nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public int Promedio()
    {
        int promedio=(this.nota1+this.nota2)/2;
        return promedio;
    }
    
    public void VerificarAprobacion()
    {
        if(this.Promedio()>=6)
        {
            System.out.println("El estudiante " + this.nombre + " aprobo");
        }
        else
            System.out.println("El estudiante " + this.nombre + " reprobo");
    }
    
    public void mostrar()
    {
        System.out.println("Nombre: "+nombre);
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
    }
    
    public static void main(String[] args) {
        
        Estudiante e1=new Estudiante("Sheila", 10, 8);        
        Estudiante e2=new Estudiante("Diego", 5, 3);
        Estudiante e3=new Estudiante("Beida", 10, 4);
        
        
        
        System.out.println("-----------ESTUDIANTES--------");
        e1.mostrar();
        System.out.println("El promedio de " + e1.nombre + " es: " + e1.Promedio());
        e2.mostrar();
        System.out.println("El promedio de " + e2.nombre + " es: " + e2.Promedio());
        e3.mostrar();
        System.out.println("El promedio de " + e3.nombre + " es: " + e3.Promedio());

        
    
        System.out.println("---------Aprobados/Reprobados----------");
        e1.VerificarAprobacion();
        e2.VerificarAprobacion();
        e3.VerificarAprobacion();
    }
}
