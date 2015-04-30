package Boletin29;

/**
 *
 * @author dpazolopez
 */
public class Bcarga extends Barcos{
    
    int carga;

    public Bcarga(int carga) {
        this.carga = carga;
    }

    public Bcarga(int carga, String matricula, int eslora, int ndias) {
        super(matricula, eslora, ndias);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    

    @Override
    public void Barcos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
