
	public class Principal {
		
		public static void main(String[] args) {
			
			Aluno [] p = new Aluno [2];
			Livro [] l = new Livro [2];
			
			p[0] = new Aluno ("Fellipe", 24, "M");
			p[1] = new Aluno ("Maria", 22, "F");
			
			l[0] = new Livro("JAVA", "Guanabara", 30, p[0]);
			l[1] = new Livro("POO", "Guanabara", 32, p[1]);
			
		
			System.out.println(l[0].detalhes());
			System.out.println("------------------");
			System.out.println(l[1].detalhes());
			
			
		}

}
