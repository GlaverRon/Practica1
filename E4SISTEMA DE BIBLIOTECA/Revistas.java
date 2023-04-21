
public class Revistas
{
  private int cod;
   private String titulo;
   private String autor;
   private int NumeroArticulo;
   
   public Revistas(int cod, String titulo, String autor, int NumeroArticulo)
   {
    this.cod = cod;
    this.titulo = titulo;
    this.autor = autor;
    this.NumeroArticulo = NumeroArticulo;
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
    public int getNumArticulo()
    {
    return this.NumeroArticulo;
    }
    public void setNumArticulo( int NumeroArticulo)
    {
    this.NumeroArticulo =NumeroArticulo;
    }
     public void mostrarRevistas()
    {
     System.out.println("-------------REVISTA-------------");
    System.out.println("Cod: "+ getCod());
    System.out.println("Titutlo: "+ getTitulo());
    System.out.println("Autor: "+ getAutor());
    System.out.println("Numero de articulo: "+ getNumArticulo());  
    System.out.println("----------------------------------");
    }
}
