
	public class CarroPrincipal {

		//RESULTADO FINAL
		public static void main(String[] args) {
					
			//CRIANDO 1° CARRO COM MÉTODO CONSTRUTOR + CHAMANDO STATUS PARA MOSTRAR INFORMAÇÕES
		
			Carro c1 = new Carro("Siena", 2011, "Vermelho", 120.590, false);
			c1.status();
					
					
			//Criando Objeto Carro2//
			Carro c2 = new Carro("Gol", 2015, "Branco", 120.320, true);
			c2.status();
					
					
		}
				
}
