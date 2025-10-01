package App;

public class Municipio {
		private int id;
		private String nome;
		private Endereco endereco_id;
		private int cnpj;
		
		public Municipio() {
		}
		
		public Municipio(int id, String nome, Endereco endereco_id, int cnpj) {
			this.id = id;
			this.nome = nome;
			this.endereco_id = endereco_id;
			this.cnpj = cnpj;
		}
		
		public int getId() {
			return this.id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getNome() {
			return this.nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public Endereco getEndereco_id() {
			return this.endereco_id;
		}
		
		public void setEndereco_id(Endereco endereco_id) {
			this.endereco_id = endereco_id;
		}
		
		public int getCnpj() {
			return this.cnpj;
		}
		
		public void setCnpj(int cnpj) {
			this.cnpj = cnpj;
		}


}
