

public class Mapas
{
 private int cod;
   private String titulo;
   private String autor;
   private double latitud; 
   private double longitud; 
   
   public Mapas (String titulo, String autor, double latitud, double longitud){
    this.cod = cod;
    this.titulo = titulo;
    this.autor= autor;
    this.latitud = latitud;
    this.longitud = longitud;
    }
    public int getCod()
     {
        return this.cod;
    }
    public void setCod(int cod)
    {
    this.cod=cod;
    }
    public String getTitulo()
    {
    return this.titulo;
    }
    public void  setTitulo(String titulo)
    {
     this.titulo=titulo;
    }
    public String getAutor()
    {
     return this.autor;   
    }
    public void setAutor(String autor)
    {
    this.autor=autor;
    }
    public double getLatitud()
    {
    return this.latitud;
    }
    public void setLatitud(double latitud)
    {
    this.latitud = latitud;
    }
     public double getLongitud()
    {
     return this.longitud;   
    }
     public void setLongitud(double longitud)
    {
    this.longitud = longitud;
    }
    
     public void mostrarMapas()
    {
    System.out.println("--------------MAPA----------------");
    System.out.println("Cod: "+ getCod());
    System.out.println("Titutlo: "+ getTitulo());
    System.out.println("Autor: "+ getAutor());
    System.out.println("Latitud: "+ getLatitud());  
    System.out.println("Longitud: "+ getLongitud());  
    System.out.println("----------------------------------");
    }
}
