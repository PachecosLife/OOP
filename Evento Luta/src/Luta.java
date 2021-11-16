import java.util.Random;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Luta {
		
	
		//ATRIBUTOS//
		private Lutador desafiado;
		private Lutador desafiante;
		private int rounds;
		private boolean aprovada;
		
		//M�TODOS CONSTRUTOR//
		public void marcarLuta (Lutador desafiado, Lutador desafiante) {
			if (desafiado.getCategoria().equals(desafiante.getCategoria()) && (desafiado != desafiante)) {
				this.aprovada = true;
				this.desafiado = desafiado;
				this.desafiante = desafiante;
			}else {
				System.out.println("evento N�O AUTORIZADO");
				this.aprovada = false;
				this.desafiado = null;
				this.desafiante = null;
			}
		}
		
		
		//M�TODOS ESPECIAIS
		public void lutar () {
			if (this.aprovada = true) {
				System.out.println("== DESAFIADO ==");
				this.desafiado.apresentar();
				System.out.println("== DESAFIANTE ==");
				this.desafiante.apresentar();
				
				Random aleatorio = new Random();
				int vencedor = aleatorio.nextInt(3);
				switch (vencedor) {
					case 0:
							System.out.println("VENCEDOR = " + this.desafiado.getNome());
							this.desafiado.ganharLuta();
							this.desafiante.perderLuta();
						break;
					case 1:
							System.out.println("VENCEDOR = " + this.desafiante.getNome());
							this.desafiado.perderLuta();
							this.desafiante.ganharLuta();
						break;
				}
				
		}else {
			System.out.println("evento N�O AUTORIZADO");
		}  
		
	}
		
		
		
		
		//M�TODOS SETTERS & GETTERS
		public Lutador getDesafiado() {
			return desafiado;
		}

		public void setDesafiado(Lutador desafiado) {
			this.desafiado = desafiado;
		}

		public Lutador getDesafiante() {
			return desafiante;
		}

		public void setDesafiante(Lutador desafiante) {
			this.desafiante = desafiante;
		}

		public int getRounds() {
			return rounds;
		}

		public void setRounds(int rounds) {
			this.rounds = rounds;
		}

		public boolean isAprovada() {
			return aprovada;
		}

		public void setAprovada(boolean aprovada) {
			this.aprovada = aprovada;
		}
		
		
}
