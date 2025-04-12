// 7. Crea una clase Celular con espacio para 20 aplicaciones o 1024Mb de Espacio
// a)
// Crea un método para instalar una nueva aplicación
// b)
// Crea un método para utilizar una aplicación (las aplicaciones que pesan más de 100Mb utilizan un 2% de batería por cada 10 minutos uso, las que pesan más de 250Mb utilizan 5% por cada 10 minutos de uso, en otros casos utiliza un 1% cada 10 minutos de uso)
// c)
// Muestra el porcentaje de batería restante
// d)
// Cuando la batería se acabe al tratar de utilizar el celular este debe mostrar el mensaje de celular apagado

package POO.Ejercicio7.Codigo;

public class Celular {
    private String[] aplicaciones; 
    private int espacioDisponible, bateria, cantidadAplicaciones; 

    public Celular() 
    {
        this.aplicaciones = new String[20];  
        this.espacioDisponible = 1024;  
        this.bateria = 100;  
        this.cantidadAplicaciones = 0;  
    }

    public boolean instalarAplicacion(String nombre, int tamaño) 
    {
        if (cantidadAplicaciones < 20 && espacioDisponible >= tamaño) 
        {
            aplicaciones[cantidadAplicaciones] = nombre;
            cantidadAplicaciones++;
            espacioDisponible -= tamaño;  
            System.out.println("Aplicacion " + nombre + " instalada con exito.");
            return true;
        } 
        else {
            System.out.println("Espacio insuficiente");
            return false;
        }
    }

    public void usarAplicacion(int minutosUso, int tamañoAplicacion) 
    {
        if (bateria <= 0) 
        {
            System.out.println("Celular apagado. :( ");
            return;
        }
        double porcentajeBateria = 0;
        if (tamañoAplicacion > 250) 
        {
            porcentajeBateria = 5;  
        } 
        else
            if (tamañoAplicacion > 100) 
            {
            porcentajeBateria = 2;  
            } 
            else {
            porcentajeBateria = 1;  
            }
        int bloquesDe10Minutos = minutosUso / 10;
        double consumoTotal = porcentajeBateria * bloquesDe10Minutos;

        bateria -= consumoTotal;
        if (bateria < 0) 
        {
            bateria = 0; 
        }
        System.out.println("Has usado la aplicacion durante " + minutosUso + " minutos.");
    }

    public void mostrarBateria() {
        System.out.println("Bateria restante: " + bateria + "%");
    }
    
    public static void main(String[] args) {
     
        Celular celular1 = new Celular();
        
        System.out.println("INSTALACION DE APLICACIONES");
        celular1.instalarAplicacion("Facebook", 100); 
        celular1.instalarAplicacion("Tiktok", 200);
        celular1.instalarAplicacion("Messenger", 300); 
        
        System.out.println("USO DE APLICACIONES Y BATERIA");
        celular1.usarAplicacion(120, 100); 
        celular1.mostrarBateria();  

        celular1.usarAplicacion(300, 200); 
        celular1.mostrarBateria();  

        celular1.usarAplicacion(60, 300); 
        celular1.mostrarBateria();  

        celular1.usarAplicacion(10, 100);

        }
}