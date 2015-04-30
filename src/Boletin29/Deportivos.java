package Boletin29;

import java.util.ArrayList;

/**
 *
 * @author DAVID
 */
public class Deportivos extends Barcos {

    private int potenciaCV;

    public Deportivos() {
    }

    public Deportivos(String matricula, int eslora, int ndias, int potenciaCV) {
        super(matricula, eslora, ndias);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    public void calcularAlq(Barcos barco){
        super.getEslora();
        int modulo;
        modulo = 10 * barco.getEslora()+ potenciaCV;
    }
    

    @Override
    public void Barcos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    

}
