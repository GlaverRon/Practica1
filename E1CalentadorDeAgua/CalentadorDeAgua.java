
public class CalentadorDeAgua
{
    private int min_temp;
    private int max_temp;
    private int temp;
    private int increment;
    private int val = 0;
    public CalentadorDeAgua(int min_temp, int max_temp, int increment, int ini)
    {
        this.min_temp = min_temp;
        this.max_temp = max_temp;
        this.temp = ini;
        this.increment = increment;
        this.val = val;
    }

    public int getMin_temp()
    {
        return this.min_temp; 
    }
    
    public void setMin_temp(int min_temp){
        this.min_temp = min_temp;
    }
    
    public int getMax_temp()
    {
        return this.max_temp; 
    }
    
    public void setMax_temp(int max_temp){
        this.max_temp = max_temp;
    }
    
    public int getIncrement()
    {
        return this.increment; 
    }
    
    public void setIncrement(int increment){
        this.increment = increment;
    }
    
    public int getVal()
    {
        return this.val; 
    }
    
    public void setVal(int val){
        this.val = val;
    }
    
    
      public void calentar(){
        if ((this.temp + this.increment) < this.max_temp){
          this.val = this.temp += this.increment;
          System.out.println("La temperatura es: "+this.val+"°C");
        }else{
          System.out.println("ALERTA: se ha alcanzado la temperatura máxima: "+this.max_temp+"°C");
          System.out.println("La temperatura es: "+(this.temp += this.increment)+"°C");
    }
  }
  
  public void enfriar(){
    if ((this.temp - this.increment) > this.min_temp){
      this.val = this.temp -= this.increment;
      System.out.println("La temperatura es: "+this.val+"°C");
    }else{
      System.out.println("ALERTA: se ha alcanzado la temperatura mínima: "+this.min_temp+"°C");
      System.out.println("La temperatura es: "+(this.temp -= this.increment)+"°C");
    }
  }
}
