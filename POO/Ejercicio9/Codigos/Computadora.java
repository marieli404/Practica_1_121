// 9. Realiza la abstracción de una Computadora
// a)
// Muestra los componentes principales de la computadora
// b)
// Muestra el estado de la computadora (encendido o apagado)
// c)
// Crea una instancia y simula encender y apagar la computadora.

package POO.Ejercicio9.Codigos;

public class Computadora {
    private String cpu, ram, discoDuro;
    private String sistemaOperativo;
    private boolean encendida;

    public Computadora(String cpu, String ram, String discoDuro, String sistemaOperativo) 
    {
        this.cpu = cpu;
        this.ram = ram;
        this.discoDuro = discoDuro;
        this.sistemaOperativo = sistemaOperativo;
        this.encendida = false;  
    }
    

    public void encender() 
    {
        if (!encendida) 
        {
            encendida = true;
            System.out.println("La computadora ha sido encendida.");
        } 
        else
            System.out.println("La computadora ya esta encendida.");
    }

    public void apagar() 
    {
        if (encendida) 
        {
            encendida = false;
            System.out.println("La computadora ha sido apagada.");
        } 
        else
            System.out.println("La computadora ya está apagada.");
    }

    public void mostrarEstado() 
    {
        if (encendida) 
        {
            System.out.println("La computadora esta encendida.");
        } 
        else
            System.out.println("La computadora esta apagada.");
    }

    public void mostrarComponentes() {
        System.out.println("Componentes de la computadora:");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Disco Duro: " + discoDuro);
        System.out.println("Sistema Operativo: " + sistemaOperativo);
    }
    
    public static void main(String[] args) {
        
        Computadora comp1= new Computadora("Intel i7", "16GB", "1TB", "Windows 10");

        System.out.println("------------COMPONENTES DE LA COMPUTADORA----------");
        comp1.mostrarComponentes();

        System.out.println("------------ESTADO DE LA COMPUTADORA---------------");
        comp1.mostrarEstado();

        System.out.println("------------ENCENDER DE LA COMPUTADORA-----------");
        comp1.encender();
        comp1.mostrarEstado();  

        System.out.println("------------APAGAR DE LA COMPUTADORA--------------");
        comp1.apagar();
        comp1.mostrarEstado();  
    }
}