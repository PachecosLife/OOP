package Elevador;

	public class UsandoElevador {

		public static void main(String[] args) {
		
			
			//CRIANDO OBJETO COM MÉTODO CONSTRUTOR 
			Elevador el = new Elevador(0, 10, 0, 7, 0);
			
			//TESTES FUNCIONANDO PERFEITAMENTE
			el.entra();
			el.subir();
			el.entra();
			el.entra();
			el.subir();
			System.out.println(el.toString());

			
	}

}
