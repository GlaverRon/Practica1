import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Documento {
    private String contenido;
    private String nombre;

    public Documento(String nombre) {
        this.nombre = nombre;
        contenido = "";
    }

    public void editar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el contenido del documento: ");
        contenido = sc.nextLine();
    }

    public void guardar() {
        try {
            File archivo = new File(nombre);
            FileWriter escritor = new FileWriter(archivo);
            escritor.write(contenido);
            escritor.close();
            System.out.println("Documento guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el documento.");
        }
    }

    public void mostrar() {
        System.out.println(contenido);
    }

    public void borrar() {
        File archivo = new File(nombre);
        if (archivo.delete()) {
            System.out.println("Documento borrado correctamente.");
        } else {
            System.out.println("Error al borrar el documento.");
        }
    }
}
