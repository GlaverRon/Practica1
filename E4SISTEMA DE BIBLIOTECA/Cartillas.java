
public class Cartillas
{
   private int cod;
   private String titulo;
   private String autor;
   private String tema;
   
   public Cartillas(int cod, String titulo, String autor, String tema)
   {
    this.cod = cod;
    this.titulo = titulo;
    this.autor = autor;
    this.tema = tema;
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
    public String getTema()
    {
     return this.tema;   
    }
    public void setTema(String tema)
    {
    this.tema=tema;
    }
     public void mostrarCartillas()
    {
     System.out.println("-------------CARTILLA-------------");
    System.out.println("Cod: "+ getCod());
    System.out.println("Titutlo: "+ getTitulo());
    System.out.println("Autor: "+ getAutor());
    System.out.println("Tema: "+ getTema());  
    System.out.println("----------------------------------");
    }
}







