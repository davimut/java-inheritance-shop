package org.lessons.java.inheritanceShop;

import java.util.Random;

public class Prodotto {

		  
		private int codice;
		private String nome;
		private String descrizione;
		private double prezzo;
		private double iva;

		// Costruttore
		public Prodotto(String nome, String descrizione, double prezzo, double iva) {
			this.codice = generateRandomCode();
			this.nome = nome;
			this.descrizione = descrizione;
			this.prezzo = prezzo;
			this.iva = iva;
		}
	     


		public Prodotto(int codice, String nome, String descrizione, double prezzo, double iva) {
		}

	
		private int generateRandomCode() {
			Random random = new Random();
			return 10000000 + random.nextInt(90000000);
		}
		public int getCodice() {
			return codice;
		}


		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}

		
		
		public String getDescrizione() {
			return descrizione;
		}
		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}
		
		

		
		public double getPrezzo() {
			return prezzo;
		}
		public void setPrezzo(double prezzo) {
			this.prezzo = prezzo;
		}

		
		public double getIva() {
			return iva;
		}
		public void setIva(double iva) {
			this.iva = iva;
		}


		
		public double getPrezzoIVA() {
			return prezzo * (1 + iva / 100);

		}

		
		public String getNomeEsteso() {
			return codice + "-" + nome;
		}
	}
	       


