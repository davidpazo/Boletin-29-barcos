package Boletin29;
/**
 *
 * @author DAVID
 */
public class Veleros extends Barcos {

    private int mastiles;

    public Veleros(int mastiles) {
        this.mastiles = mastiles;
    }

    public Veleros() {
    }

    public Veleros(int mastiles, String matricula, int eslora, int ndias) {
        super(matricula, eslora, ndias);
        this.mastiles = mastiles;
    }  

    public int getMastiles(int mastiles) {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    
    public void calcularAlq(Barcos barco){
        super.getEslora();
        int modulo;
        modulo = 10 * barco.getEslora()+ mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }
    

    @Override
    public void Barcos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
