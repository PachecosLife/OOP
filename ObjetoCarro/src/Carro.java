
	public class Carro {
		//Atributos = O que eu tenho//
		public String modelo;
		public int ano;
		public String cor;
		public double km;
		public boolean novo;
		
		//Métodos = O que eu faço//
		
		//Método "STATUS" para imprimir no Console as informações
		public void status () {  
			System.out.println("MODELO: " + this.getModelo());
			System.out.println("ANO: " + this.getAno());
			System.out.println("COR: " + this.getCor());
			System.out.println("QUILOMETRAGEM: " + this.getKm());
			System.out.println("É NOVO? " + this.getNovo());
			System.out.println("-----------------------------------");
		}
		
		//Método Construtor//
		public Carro(String modelo, int ano, String cor, double km, boolean novo) {
			super();
			this.modelo = modelo;
			this.ano = ano;
			this.cor = cor;
			this.km = km;
			this.novo = novo;
		}

		//Método Setters & Getters
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
