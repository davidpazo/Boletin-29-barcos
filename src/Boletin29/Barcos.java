package Boletin29;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DAVID
 */
public abstract class Barcos {

    private String matricula;
    private int eslora;
    public int ndias;

    public Barcos() {
    }

    public Barcos(String matricula, int eslora, int ndias) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.ndias = ndias;
    }
   
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getNdias() {
        return ndias;
    }

    public void setNdias(int ndias) {
        this.ndias = ndias;
    }
    
    public void calcularAlq(){
        int modulo;
        modulo = 10 * eslora;
    }
    public abstract void Barcos();
    
    
    
    
    
    

}

