/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author filip
 */
public class Telefone {
    private int ddi = 0;
    private int ddd = 0;
    private String numero = "";  

    public Telefone(int ddi, int ddd, String numero){
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
    }

    public int getDdi() {
        return ddi;
    }

    public void setDdi(int ddi) {
        this.ddi = ddi;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefone{ +" + ddi + "(" + ddd +") "+ numero + '}';
    }

    public String toFormattedString() {
    return String.format("%02d%02d%s", ddi, ddd, numero);
}
    public String formatarNumero() {
    return "(" + ddd + ") " + numero.substring(0, 5) + "-" + numero.substring(5);
}
}



