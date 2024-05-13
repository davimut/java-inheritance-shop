package org.lessons.java.inheritanceShop;


public class Televisori extends Prodotto {
    private double dimensioni;
    private boolean smart;

    public Televisori(String nome, String descrizione, double prezzo, double iva, double dimensioni, boolean smart) {
        super(nome, descrizione, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    public double getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(double dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
    
    @Override
    public String toString() {
        String smartStatus = smart ? "Smart" : "Non smart";
        return " Codice: " + getCodice() + ", Televisore: " + getNome() + ", Descrizione: " + getDescrizione() + ", Prezzo: " + getPrezzo() + ", IVA: " + getIva() + 
               ", Dimensioni: " + dimensioni + " pollici, " + smartStatus;
    }
    
}