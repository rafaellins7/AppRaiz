package App;

public class Log {
	private Usuario usuario;
	private String tipoOperacao;
	private String descricao;
		    
	public Log() {
		}
		    
	public Log(Usuario usuario, String tipoOperacao, String descricao) {
		this.usuario = usuario;
		this.tipoOperacao = tipoOperacao;
		this.descricao = descricao;
		}
		    
	public Usuario getUsuario() {
		return this.usuario;
		}
		    
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
		}
		    
	public String getTipoOperacao() {
		return this.tipoOperacao;
		}
		    
	public void setTipoOperacao(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
		}
		    
	public String getDescricao() {
		return this.descricao;
		}
		    
	public void setDescricao(String descricao) {
		this.descricao = descricao;
		}

}
