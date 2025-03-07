# Paradigma-Programación-Orientada-a-objetos
A continuación encontraras un archivo punto java (llamado repositorio) con el codigo ejemplo de un proyecto para gestionar un cultivo, descargalo y ejecutalo!!!
Pdt: Explicación detallada del codigo la puedes encontrar en el pdf en la seccion 3 (parte práctica)
```java
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
```
