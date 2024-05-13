package org.lessons.java.iheritanceShop;


public class Cuffie extends Prodotto {
    private String colore;
    private boolean wireless;

    public Cuffie(String nome, String descrizione, double prezzo, double iva, String colore, boolean wireless) {
        super(nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
    @Override
    public String toString() {
        String wirelessString = wireless ? "Wireless" : "Cablate";
        return " Codice: " + getCodice() + ", Cuffie: " + getNome()  + ", Descrizione: " + getDescrizione() + ", Prezzo: " + getPrezzo() + ", IVA: " + getIva() +
               ", Colore: " + colore + ", Tipo: " + wirelessString;
    }
}