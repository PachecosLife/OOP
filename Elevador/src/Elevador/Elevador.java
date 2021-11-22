package Elevador;

	public class Elevador {
		
		private int terreo = 0;
		private int totAndar = 10;
		private int andarAtual = 0;
		private int capacidade = 7;
		private int presentes = 0;
	
		public Elevador(int terreo, int totAndar, int andarAtual, int capacidade, int presentes) {
			super();
			this.terreo = terreo;
			this.totAndar = totAndar;
			this.andarAtual = 0;
			this.capacidade = capacidade;
			this.presentes = 0;
		}

		public void entra () {
			if (presentes < 7) {
			this.presentes += 1; 
			
			}else {
				System.out.println("ELEVADOR LOTADO");
			}
		}

		public void sai () {
			if (presentes >= 1) {
				this.presentes -= 1;
			}else {
				System.out.println("N�O H� NINGUEM NO ELEVADOR");
			}
		}
		
		public void subir () {
			if (andarAtual < totAndar) {
				this.andarAtual += 1;
			}else {
				System.out.println("IMPOSS�VEL SUBIR.");
			}
		}
		
		public void descer () {
			if (andarAtual == terreo) {
				System.out.println("IMPOSS�VEL DESCER");
			}else {
				this.andarAtual -= 1;
			}
		}

		public int getTerreo() {
			return terreo;
		}

		public void setTerreo(int terreo) {
			this.terreo = terreo;
		}

		public int getTotAndar() {
			return totAndar;
		}

		public void setTotAndar(int totAndar) {
			this.totAndar = totAndar;
		}

		public int getAndarAtual() {
			return andarAtual;
		}

		public void setAndarAtual(int andarAtual) {
			this.andarAtual = andarAtual;
		}

		public int getCapacidade() {
			return capacidade;
		}

		public void setCapacidade(int capacidade) {
			this.capacidade = capacidade;
		}

		public int getPresentes() {
			return presentes;
		}

		public void setPresentes(int presentes) {
			this.presentes = presentes;
		}

		@Override
		public String toString() {
			return ", Terreo = " + terreo + "\n, Total Andares = " + totAndar + "\n, Andar Atual = " + andarAtual
					+ "\n, Capacidade = " + capacidade + "\n, Presentes = " + presentes;
		}
		
		
		
		
		
}
	