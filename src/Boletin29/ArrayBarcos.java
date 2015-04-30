package Boletin29;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dpazolopez
 */
public class ArrayBarcos {

    ArrayList<Barcos> listaB;

    /*private String matricula;
    private int eslora;
    public int ndias;
    private int potencia;
    private int numcamarotes;
    private int potenciaCV;
    private int mastiles;*/
    public ArrayBarcos() {
    }

    
    public ArrayBarcos(ArrayList<Barcos> listaB, String matricula, int eslora, int ndias, int potencia, int numcamarotes, int potenciaCV, int mastiles) {

    }

    public void añadirVelero(ArrayList<Barcos> listaB) {
        listaB.add(new Veleros(this.pedirMastil(), this.pedirMatricula(), this.pedirEslora(), this.pedirDia()));
    }

    public void añadirDeportivo(ArrayList<Barcos> listaB) {
        listaB.add(new Deportivos(this.pedirMatricula(), this.pedirEslora(), this.pedirDia(),this.pedirPotencia()));
    }

    public void añadirYate(ArrayList<Barcos> listaB) {
        listaB.add(new Yates(this.pedirMatricula(),this.pedirEslora(),this.pedirDia(),this.pedirPotencia(),this.pedirCamarote()));
    }
    public void añadirCarguero(ArrayList<Barcos> listaB){
        listaB.add(new Yates(this.pedirMatricula(),this.pedirEslora(),this.pedirDia(),this.pedirPotencia(),this.pedirCamarote()));

    }

    public void amosar(Barcos b) {
        if (b instanceof Yates) {
            JOptionPane.showMessageDialog(null, "Barco Yate: \nMatricula: " + b.getMatricula()+"\nEslora: "+b.getEslora()+"\nNumero dias: "+b.getNdias()+"\nPotencia: "+((Yates)b).getPotencia()+"\nCamarotes: "+((Yates)b).getNumcam());
        }
        if (b instanceof Deportivos) {
            JOptionPane.showMessageDialog(null, "Barco Deportivo: \nMatricula: " + b.getMatricula()+"\nEslora: "+b.getEslora()+"\nNumero dias: "+b.getNdias()+"\nPotencia: "+((Deportivos)b).getPotenciaCV());
        }
        if (b instanceof Veleros) {
            JOptionPane.showMessageDialog(null, "Barco Velero: \nMatricula: " + b.getMatricula()+"\nEslora: "+b.getEslora()+"\nNumero dias: "+b.getNdias()+((Veleros)b).getMastiles());
        if (b instanceof Bcarga) {
            JOptionPane.showMessageDialog(null,"Barco de carga: \nMatricula: "+ b.getMatricula()+"\nEslora: "+b.getEslora()+"nNumero dias: "+b.getNdias()+((Bcarga)b).getCarga());
        }
        }
    }

    public void borrar(ArrayList<Barcos> listaB) {
        listaB.remove(this);
    }

    public ArrayBarcos(ArrayList<Barcos> listaB) {
        this.listaB = listaB;

    }

    public ArrayList<Barcos> getlista() {
        return listaB;
    }

    public ArrayList<Barcos> getListaB() {
        return listaB;
    }

    public void setListaB(ArrayList<Barcos> listaB) {
        this.listaB = listaB;
    }

    public int pedirDia() {
        int ndias = 0;
        do {
            ndias = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de dias:"));
            if (ndias <= 0) {
                JOptionPane.showMessageDialog(null, "Novalido");
            }
        } while (ndias <= 0);
        return ndias;
    }

    public int pedirEslora() {
        int eslora = 0;
        do {
            eslora = Integer.parseInt(JOptionPane.showInputDialog("Introducir eslora:"));
            if (eslora <= 0) {
                JOptionPane.showInputDialog("eslora no valida");
            }
        } while (eslora <= 0);
        return eslora;
    }

    public String pedirMatricula() {
        String matricula;

        matricula = (JOptionPane.showInputDialog("Introducir matricula: "));

        return matricula;
    }

    public int pedirPotencia() {
        int potencia = 0;
        do {
            potencia = Integer.parseInt(JOptionPane.showInputDialog("Introducir potencia: "));
            if (potencia <= 0) {
                JOptionPane.showInputDialog("Potencia no valida");
            }
        } while (potencia <= 0);
        return potencia;
    }

    public int pedirMastil() {
        int mastiles = 0;
        do {
            mastiles = Integer.parseInt(JOptionPane.showInputDialog("Introducir potencia: "));
            if (mastiles <= 0) {
                JOptionPane.showInputDialog("mastiles no validos");
            }
        } while (mastiles <= 0);
        return mastiles;
    }

    public int pedirCamarote() {
        int numcam = 0;
        do {
            numcam = Integer.parseInt(JOptionPane.showInputDialog("Introducir numero de camarotes: "));
            if (numcam <= 0) {
                JOptionPane.showInputDialog("Camarotes no validos");
            }
        } while (numcam <= 0);
        return numcam;
    }
    
    }

