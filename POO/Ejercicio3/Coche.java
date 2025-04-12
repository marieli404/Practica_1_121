package POO.Ejercicio3;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    public Coche(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public void Acelerar(){
        this.velocidad = this.velocidad + 10;
        System.out.println("La velocidad es " + this.velocidad);

    }

    public void Frenar(){
        this.velocidad = this.velocidad - 5;
        System.out.println("La velocidad es " + this.velocidad);
    }

    public void mostrar(){
        System.out.println("El auto es " + this.marca);
        System.out.println("El modelo es " + this.modelo);
        System.out.println("Su velocidad es " + this.velocidad);
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche("Honda", "Civic", 200);
        Coche coche2 = new Coche("Toyota", "Corolla", 100);

        System.out.println("COCHES");

        coche1.mostrar();
        coche2.mostrar();

        System.out.println("------------------------------------");

        System.out.println("Coches Acelerados:");
        coche1.Acelerar();
        coche2.Acelerar();
        System.out.println("--------------------------------------");
        System.out.println("Coches Frenados:");
        coche1.Frenar();
        coche2.Frenar();
        System.out.println("--------------------------------------");
        System.out.println("Velocidades:");
        coche1.mostrar();
        coche2.mostrar();
    }
}
