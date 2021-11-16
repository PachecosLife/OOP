
public class ContaBancPrincipal {
	
	
	public static void main(String[] args) {
		
		ContaBanc p1 = new ContaBanc();
		p1.setNumConta(11111);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
		p1.depositar(250);
		p1.estadoAtual();
		
		ContaBanc p2 = new ContaBanc();
		p2.setNumConta(22222);
		p2.setDono("Creusa");
		p2.abrirConta("CP");
		p2.depositar(550);
		p2.sacar(130);
		p2.estadoAtual();
		
		
		
	}

}
