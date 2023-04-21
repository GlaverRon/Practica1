
public class Enciclopedias
{
private int cod;
   private String titulo;
   private String autor;
   private int volumen;
   private int Npaginas;
   
   public Enciclopedias(int cod, String titulo, String autor,int volumen, int Npaginas)
   {
    this.cod = cod;
    this.titulo = titulo;
    this.autor = autor;
    this.volumen = volumen;
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
    public int getVolumen()
    {
    return this.volumen;
    }
    public void setVolumen (int volumen)
    {
    this.volumen = volumen;
    }
    public int getNPaginas()
    {
    return this.Npaginas;
    }
    public void setNPaginas(int Npaginas)
    {
    this.Npaginas=Npaginas;
    }
    public void mostrarEnciclopedias()
    {
  System.out.println("-------------ENCICLOPEDIA-----------");
    System.out.println("Cod: "+ getCod());
    System.out.println("Titutlo: "+ getTitulo());
    System.out.println("Autor: "+ getAutor());
    System.out.println("Volumen: "+ getVolumen());  
    System.out.println("Numero de paginas: "+ getNPaginas()); 
    System.out.println("----------------------------------");
    }
}
