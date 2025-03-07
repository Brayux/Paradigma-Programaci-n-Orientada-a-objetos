// Definición de la clase Cultivo
class Cultivo {
    // Atributos de la clase
    String nombre;
    String tipo;

    // Constructor para inicializar los atributos
    public Cultivo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Método para regar el cultivo
    public void regar() {
        System.out.println("Regando " + this.nombre);
    }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo Cultivo
        Cultivo maiz = new Cultivo("Maíz", "Cereal");

        // Ejecutar el método regar() del objeto maiz
        maiz.regar();
    }
}