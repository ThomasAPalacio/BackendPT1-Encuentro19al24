package Ejercicio_extra2;

public class NifEntidad {
    
    private long DNI;
    private String letra[]={"T","R","W","A","G","M","Y","F","P",
        "D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    public NifEntidad() {
    }

    public NifEntidad(long DNI) {
        this.DNI = DNI;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String[] getLetra() {
        return letra;
    }

    public void setLetra(String[] letra) {
        this.letra = letra;
    }
    
    public String elegirLetra(int num){
       
       return letra[num];
        
    }
    
}
