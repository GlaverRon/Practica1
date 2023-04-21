public class Libros
{
   private int cod;
   private String titulo;
   private String autor;
   private int Npaginas;
   
   public Libros(int cod, String titulo, String autor, int Npaginas)
   {
    this.cod = cod;
    this.titulo = titulo;
    this.autor = autor;
    this.Npaginas = Npaginas;
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
    public int getNPaginas()
    {
    return this.Npaginas;
    }
    public void setNPaginas(int Npaginas)
    {
    this.Npaginas=Npaginas;
    }
    public void mostrarLibros()
    {
    System.out.println("-------------LIBRO----------------");
    System.out.println("Cod: "+ getCod());
    System.out.println("Titutlo: "+ getTitulo());
    System.out.println("Autor: "+ getAutor());
    System.out.println("Numero de paginas: "+ getNPaginas());  
    System.out.println("----------------------------------");
    }
}






