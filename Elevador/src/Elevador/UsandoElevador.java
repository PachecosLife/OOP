package Elevador;

public class UsandoElevador {

	public static void main(String[] args) {
		
			Elevador el = new Elevador(0, 10, 0, 7, 0);
			el.entra();
			el.subir();
			el.entra();
			el.entra();
			el.subir();
			System.out.println(el.toString());

			
	}

}
