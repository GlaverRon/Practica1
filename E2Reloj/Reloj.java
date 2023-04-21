public class Reloj
{
    private int hora = 0;
    private int minuto = 0;
    private int segundo = 0;
    private boolean sal = true;
    
    public Reloj()
    {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.sal = sal;
    }
    
    public int getHora(){
        return this.hora;
    }
    
    public void setHora(int hora){
        this.hora = hora;
    }
    
    public int getMinuto(){
        return this.minuto;
    }
    
    public void setMinuto(int minuto){
        this.minuto = minuto;
    }
    
    public int getSegundo(){
        return this.segundo;
    }
    
    public void setSegundo(int segundo){
        this.segundo = segundo;
    }
    
    //public int getSal(){
    //    return this.sal;
    //}
    
    public void setSal(boolean sal){
        this.sal = sal;
    }
    
    public void inicioReloj()
    {
        while(this.sal){
            if(this.hora<10){
                System.out.print ("0");
            }
            System.out.print (this.hora+":");
            
            //if(this.minuto<10){
                //System.out.print ("0");
            //}
            //System.out.print(this.minuto+":");
            
            if(segundo<10){
                System.out.print ("0");
            }
            //Completamos si queremos ver los segundos
            System.out.println (this.segundo);
            
            segundo++;
            
            
            if(this.segundo == 60){
                this.segundo = 0;
                //this.minuto++;
                //if(minuto == 60){
                    //this.minuto = 0;
                    this.hora++;
                    if(this.hora == 24){
                        this.hora = 0;
                        this.sal = false;
                    }
                //}
            }
            
            try{
                Thread.sleep(60000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
