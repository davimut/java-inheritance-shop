package org.lessons.java.iheritanceShop;



public class Smartphone extends Prodotto {
    private String imei;
    private int memoria;
    
    public Smartphone(String nome, String descrizione, double prezzo, double iva, String imei, int memoria) {
        super(nome, descrizione, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

  //  override metodo tiString customizzato smartphone cossiche se si stampa si riceve una stringa ansiche la stampa della cella di memoria
    @Override
    public String toString() {
        return  " Codice: " + getCodice() + ", Smartphone: " + getNome() + ", Descrizione: " + getDescrizione() + ", Prezzo: " + getPrezzo() + ", IVA: " + getIva() + 
               ", IMEI: " + "IMEI"+ imei + ", Memoria: " + memoria;
    }
}