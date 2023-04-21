import java.util.ArrayList;
public class Sistema_biblioteca
{
private ArrayList<Libros> listarLibros;
private ArrayList<Mapas> listarMapas;
private ArrayList<Cartillas> listarCartillas;
private ArrayList<Revistas> listarRevistas;
private ArrayList<Enciclopedias> listarEnciclopedias;
public Sistema_biblioteca()
 {
 listarLibros = new ArrayList<Libros>();
 listarMapas = new ArrayList<Mapas>();
 listarCartillas = new ArrayList<Cartillas>();
 listarRevistas = new ArrayList<Revistas>();
 listarEnciclopedias = new ArrayList<Enciclopedias>();
 }
 //LIBROS
 public void addlibross(Libros libros)
 {
   listarLibros.add(libros); 
 }
 //MAPAS
 public void addmapass(Mapas mapas)
 {
   listarMapas.add(mapas); 
 }
 // CARTILLAS
  public void addcartillas(Cartillas cartillas)
 {
   listarCartillas.add(cartillas); 
 }
 //REVISTAS
  public void addrevistas(Revistas revistas)
 {
   listarRevistas.add(revistas); 
 }
 //ENCICLOPEDIAS
  public void addenciclopedias(Enciclopedias enciclopedias)
 {
   listarEnciclopedias.add(enciclopedias); 
 }
 //LISTAR LIBROS
 public void listarLibros()
 {
  if (listarLibros.size()>0)  
  {
   for (Libros item : listarLibros){
    item.mostrarLibros();
   }
  }
   else {
    System.out.println("----------------------------------");
    System.out.println("No hay nigun libro");
    System.out.println("----------------------------------");
    } 
 }
 //LISTAR MAPAS
  public void listarMapas()
 {
  if (listarMapas.size()>0)  
  {
   for (Mapas item : listarMapas){
    item.mostrarMapas();
   }
  }
   else {
    System.out.println("----------------------------------");
    System.out.println("No hay mapas");
    System.out.println("----------------------------------");
    } 
 }
 //LISTAR CARTILLAS
 public void listarCartillas()
 {
  if (listarCartillas.size()>0)  
  {
   for (Cartillas item : listarCartillas){
    item.mostrarCartillas();
   }
  }
   else {
    System.out.println("----------------------------------");
    System.out.println("No hay Cartilla");
    System.out.println("----------------------------------");
    } 
 }
 //LISTAR REVISTAS
  public void listarRevistas()
 {
  if (listarRevistas.size()>0)  
  {
   for (Revistas item : listarRevistas){
    item.mostrarRevistas();
   }
  }
   else {
    System.out.println("----------------------------------");
    System.out.println("No hay revistas");
    System.out.println("----------------------------------");
    } 
 }
 //LISTAR REVISTAS
  public void listarEnciclopedias()
 {
  if (listarEnciclopedias.size()>0)  
  {
   for (Enciclopedias item : listarEnciclopedias){
    item.mostrarEnciclopedias();
   }
  }
   else {
    System.out.println("----------------------------------");
    System.out.println("No hay Enciclopedias");
    System.out.println("----------------------------------");
    } 
 }
}






