import java.util.Set;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ContaBanc {
		
		//ATRIBUTOS
		public int numConta;
		protected String tipo; 
		private String dono;
		private double saldo;
		private boolean status;
		
		
		//MÉTODOS ESPECIAIS
		public void estadoAtual () {
			System.out.println("================================");
			System.out.println("CONTA: " + this.getNumConta());
			System.out.println("DONO: " + this.getDono() );
			System.out.println("TIPO: " + this.getTipo());
			System.out.println("SALDO: " + this.getSaldo());
			System.out.println("STATUS: " + this.getStatus());
		}
		
		
		public void abrirConta (String t) {
			this.setTipo(t);
			this.setStatus(true);
			if (t == "CC") {
				this.setSaldo(50);
			} else if (t == "CP") {
				this.setSaldo(150);
			}
			System.out.println("SEJA BEM-VINDO(A), SUA CONTA ESTÁ ABERTA");
		}
		
		public void fecharConta () {
			if (this.getSaldo()> 0) {
				System.out.println("ERRO NO FECHAMENTO DA CONTA, SALDO DISPONÍVEL");
			}else if (this.getSaldo() < 0) {
				System.out.println("ERRO NO FECHAMENTO DA CONTA, SALDO DEVEDOR");
			}else {
				this.setStatus(false);
				System.out.println("CONTA ENCERRADA !");
			}
 		
		}
		
		public void depositar (double v) {
			if (this.getStatus() ) {
				/*this.saldo = this.saldo + v;*/
				this.setSaldo(this.getSaldo() + v);
				System.out.println("DEPOSITO REALIZADO COM SUCESSO");
			}else {
				System.out.println("NÃO FOI POSSÍVEL REALIZAR O DEPÓSITO");
			}
				
		}
		
		
		public void sacar (double v) {
			if (this.getStatus()) {
				if (this.getSaldo() >= v) {
					this.setSaldo(this.getSaldo() - v);
					System.out.println("SAQUE REALIZADO NA CONTA " + this.getDono());
				}else {
					System.out.println("SALDO INSUFICIENTE");
				}
			}else {
				System.out.println("CONTA FECHADA, NÃO FOI POSSÍVEL SACAR");
			}
		}
		
		public void pagarMensal () {
			int v = 0;
			if (this.getTipo() == "CC" ) {
				v = 12;
			} else if (this.getTipo() == "CP" ) {
				v = 20;
			}
			if (this.getStatus()) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("MENSALIDADE PAGA COM SUCESSO");
			}else {
				System.out.println("IMPOSSÍVEL PAGAR, CONTA FECHADA");
			}
		}
		
		public void ContaBanc () {
			this.saldo = 0;
			this.status = false;
		}
		
		
		
		//MÉTODOS SETTERS & GETTERS		
		public int getNumConta() {
			return numConta;
		}
		public void setNumConta(int numConta) {
			this.numConta = numConta;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getDono() {
			return dono;
		}
		public void setDono(String dono) {
			this.dono = dono;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public boolean getStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		
		
}
