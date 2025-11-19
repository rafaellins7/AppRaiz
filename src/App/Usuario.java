package App;

import java.time.LocalDate;

public class Usuario {
	private int id;
	private String nome;
	private String login;
	private String senha;
	private String telefone;
	private String cpf;
	private String cnpj;
	private Endereco endereco;
	private Perfil_usuario perfil;
	private LocalDate dataCadastro;
	private boolean ativo;
		    
	public Usuario() {
		}
		    
	public Usuario(int id, String nome, String login, String senha, String telefone, 
		            String cpf, String cnpj, Endereco endereco, Perfil_usuario perfil, 
		            LocalDate dataCadastro, boolean ativo) {
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.telefone = telefone;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.perfil = perfil;
		this.dataCadastro = dataCadastro;
		this.ativo = ativo;
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
		    
	public String getLogin() {
		return this.login;
		}
		    
	public void setLogin(String login) {
		this.login = login;
		 }
		    
	public String getSenha() {
		 return this.senha;
		}
		    
	public void setSenha(String senha) {
		 this.senha = senha;
		}
		    
	public String getTelefone() {
		 return this.telefone;
		}
		    
	public void setTelefone(String telefone) {
		this.telefone = telefone;
		}
		    
	public String getCpf() {
		return this.cpf;
		}
		    
	public void setCpf(String cpf) {
		this.cpf = cpf;
		}
		    
	public String getCnpj() {
		return this.cnpj;
		}
		    
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
		}
		    
	public Endereco getEndereco() {
		return this.endereco;
		}
		    
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
		}
		    
	public Perfil_usuario getPerfil() {
		return this.perfil;
		}
		    
	public void setPerfil(Perfil_usuario perfil) {
		this.perfil = perfil;
		}
		    
	public LocalDate getDataCadastro() {
		return this.dataCadastro;
		}
		    
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
		}
		    
	public boolean getAtivo() {
		return this.ativo;
		}
		    
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
		}
	
}
