
	public class Lutador {
		
		//ATRIBUTOS 
		private String nome; 
		private String nacionalidade;
		private	int idade;
		private double altura;
		private double peso;
		private String categoria;
		private int vitorias;
		private int derrotas; 
		
		
		//MÉTODOS 
		public void apresentar () {
			System.out.println("Nome: " + this.getNome());
			System.out.println("Nacionalidade: " + this.getNacionalidade());
			System.out.println("Idade: " + this.getIdade() + " anos");
			System.out.println("Altura: " + this.getAltura() + "m");
			System.out.println("PESO: " + this.getPeso() + " Kg");
			System.out.println("CATEGORIA: " + this.getCategoria());
			System.out.println(this.getVitorias() + " - " + this.getDerrotas());
			System.out.println("============================================");
			
		}
		public void status () {
			System.out.println("Nome: " + this.getNome());
			System.out.println("Nacionalidade: " + this.getNacionalidade());
			System.out.println(this.getVitorias() + " - " + this.getDerrotas());
			
			
		}
		
		public void ganharLuta () {
			this.setVitorias(getVitorias() + 1);
			
		}
		
		public void perderLuta () {
			this.setDerrotas(this.getDerrotas() - 1);
		}
		
		//MÉTODO CONSTRUTOR
		public Lutador(String no, String na, int id, double al, double pe, int vi, int de ) {
			this.setNome(no);
			this.setNacionalidade(na);
			this.setIdade(id);
			this.setAltura(al);
			this.setPeso(pe);
			this.setVitorias(vi);
			this.setDerrotas(de);
		}
		
				
		
		
		
		//SETTERS & GETTERS//
		public String getNome() {
			return nome;
		}
		public void setNome(String no) {
			this.nome = no;
		}
		public String getNacionalidade() {
			return nacionalidade;
		}
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double pe) {
			this.peso = pe;
			this.setCategoria(categoria);
		}
		public String getCategoria() {
			return categoria;
		}
		
		// Definindo Categorias e o peso de cada uma delas //
		public void setCategoria(String categoria) {
			if (this.peso < 52.2) {
				System.out.println("NÃO PODE LUTAR");
			}else if (this.peso <= 70.3) {
				this.categoria = "PESO LEVE";
			}else if (this.peso <= 83.9) {
				this.categoria = "PESO MÉDIO";
			}else if (this.peso <= 120.2) {
				this.categoria = "PESO PESADO";
			}else {
				System.out.println("INVÁLIDO");
			}
		}
			
			
		
		public int getVitorias() {
			return vitorias;
		}
		public void setVitorias(int vitorias) {
			this.vitorias = vitorias;
		}
		public int getDerrotas() {
			return derrotas;
		}
		public void setDerrotas(int derrotas) {
			this.derrotas = derrotas;
		}
		
		
}
	
	

	