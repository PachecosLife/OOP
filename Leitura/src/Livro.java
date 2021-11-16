
	public class Livro implements Publicacao {
		
		//ATRIBUTOS
		private String titulo;
		private String autor;
		private int totPag;
		private int pagAtual;
		private boolean aberto;
		private Aluno leitor;
		
	
		//MÉTODO CONSTRUTOR
		public Livro(String titulo, String autor, int totPag, Aluno leitor) {
			super();
			this.titulo = titulo;
			this.autor = autor;
			this.totPag = totPag;
			this.pagAtual = 0;
			this.aberto = false;
			this.leitor = leitor;
		}


		
		//TO STRING
		@Override
		public String detalhes() {
			return "Livro [ Titulo = " + titulo + "\n, Autor = " + autor + "\n, Total Paginas = " + totPag + "\n, Pagina Atual = " + pagAtual
					+ "\n, Aberto = " + aberto + "\n, Leitor = " + leitor.getNome();
		}


		
		//MÉTODOS SETTER & GETTERS
		public String getAutor() {
			return autor;
		}


		public void setAutor(String autor) {
			this.autor = autor;
		}


		public int getTotPag() {
			return totPag;
		}


		public void setTotPag(int totPag) {
			this.totPag = totPag;
		}


		public boolean isAberto() {
			return aberto;
		}


		public void setAberto(boolean aberto) {
			this.aberto = aberto;
		}


		public Aluno getLeitor() {
			return leitor;
		}


		public void setLeitor(Aluno leitor) {
			this.leitor = leitor;
		}




		//MÉTODOS ESPECIAIS
		@Override
		public void abrir() {
			this.aberto = true;
		}





		@Override
		public void fechar() {
			this.aberto = false;
		}





		@Override
		public void folhear() {
			
		}





		@Override
		public void avancarPag() {
			this.pagAtual++;
		}





		@Override
		public void voltarPag() {
			this.pagAtual--;
		}





		
		

		
}
