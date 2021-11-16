
	public class Carro {
		//Atributos = O que eu tenho//
		public String modelo;
		public int ano;
		public String cor;
		public double km;
		public boolean novo;
		
		//M�todos = O que eu fa�o//
		
		//M�todo "STATUS" para imprimir no Console as informa��es
		public void status () {  
			System.out.println("MODELO: " + this.getModelo());
			System.out.println("ANO: " + this.getAno());
			System.out.println("COR: " + this.getCor());
			System.out.println("QUILOMETRAGEM: " + this.getKm());
			System.out.println("� NOVO? " + this.getNovo());
			System.out.println("-----------------------------------");
		}
		
		//M�todo Construtor//
		public Carro(String modelo, int ano, String cor, double km, boolean novo) {
			super();
			this.modelo = modelo;
			this.ano = ano;
			this.cor = cor;
			this.km = km;
			this.novo = novo;
		}

		//M�todo Setters & Getters
		public String getModelo() {
			return modelo;
		}


		public void setModelo(String modelo) {
			this.modelo = modelo;
		}


		public int getAno() {
			return ano;
		}


		public void setAno(int ano) {
			this.ano = ano;
		}


		public String getCor() {
			return cor;
		}


		public void setCor(String cor) {
			this.cor = cor;
		}


		public double getKm() {
			return km;
		}


		public void setKm(double km) {
			this.km = km;
		}


		public boolean getNovo() {
			return novo;
		}


		public void setNovo(boolean novo) {
			this.novo = novo;
		}
		

}
