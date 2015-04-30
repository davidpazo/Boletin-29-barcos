package Boletin29;
/**
 *
 * @author DAVID
 */
public class Yates extends Barcos {

    private int potencia;
    private int numcam;

    public Yates() {
    }

    public Yates(String matricula, int eslora, int ndias, int potencia, int numcam) {
        super(matricula, eslora, ndias);
        this.numcam=numcam;
        this.potencia=potencia;
        
    }   

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumcam() {
        return numcam;
    }

    public void setNumcam(int numcam) {
        this.numcam = numcam;
    }
    
    
    public void calcularAlq(Barcos barco){
        super.getEslora();
        int modulo;
        modulo = (10 * barco.getEslora()+ potencia+numcam)*barco.getNdias();
    }

    @Override
    public void Barcos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
