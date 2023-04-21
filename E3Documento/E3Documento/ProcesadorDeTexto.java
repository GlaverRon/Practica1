import java.util.Scanner;
import java.io.File;

public class ProcesadorDeTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear un nuevo documento.");
            System.out.println("2. Editar un documento existente.");
            System.out.println("3. Guardar un documento.");
            System.out.println("4. Mostrar un documento.");
            System.out.println("5. Borrar un documento.");
            System.out.println("6. Salir del programa.");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    sc.nextLine(); // Para consumir el salto de línea que queda en el buffer después de sc.nextInt()
                    System.out.println("Escriba el nombre del nuevo documento: ");
                    String nombreNuevoDocumento = sc.nextLine();
                    Documento nuevoDocumento = new Documento(nombreNuevoDocumento);
                    System.out.println("Documento creado correctamente.");
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("Escriba el nombre del documento que desea editar: ");
                    String nombreDocumentoAEditar = sc.nextLine();
                    File archivoAEditar = new File(nombreDocumentoAEditar);
                    if (!archivoAEditar.exists()) {
                        System.out.println("El documento no existe.");
                        break;
                    }
                    Documento documentoAEditar = new Documento(nombreDocumentoAEditar);
                    documentoAEditar.editar();
                    System.out.println("Documento editado correctamente.");
                    break;

                case 3:
                    sc.nextLine();
                    System.out.println("Escriba el nombre del documento que desea guardar: ");
                    String nombreDocumentoAGuardar = sc.nextLine();
                    File archivoAGuardar = new File(nombreDocumentoAGuardar);
                    if (!archivoAGuardar.exists()) {
                        System.out.println("El documento no existe.");
                        break;
                    }
                    Documento documentoAGuardar = new Documento(nombreDocumentoAGuardar);
                    documentoAGuardar.guardar();
                    break;

                case 4:
                    sc.nextLine();
                    System.out.println("Escriba el nombre del documento que desea mostrar: ");
                    String nombreDocumentoAMostrar = sc.nextLine();
                    File archivoAMostrar = new File(nombreDocumentoAMostrar);
                    if (!archivoAMostrar.exists()) {
                        System.out.println("El documento no existe.");
                        break;
                    }
                    Documento documentoAMostrar = new Documento(nombreDocumentoAMostrar);
                    documentoAMostrar.mostrar();
                    break;

                case 5:
                    sc.nextLine();
                    System.out.println("Escriba el nombre del documento que desea borrar: ");
                    String nombreDocumentoABorrar = sc.nextLine();
                    File archivoABorrar = new File(nombreDocumentoABorrar);
                    if (!archivoABorrar.exists()) {
                        System.out.println("El documento no existe.");
                        break;
                    }
                    Documento documentoABorrar = new Documento(nombreDocumentoABorrar);
                    documentoABorrar.borrar();
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
