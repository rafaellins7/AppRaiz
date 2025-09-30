package App;

public class Ordem_expedicao {
	    private int id;
	    private String data_criacao;
	    private Status status_id;
	    private Usuario usuario_id;
	    
	    public Ordem_expedicao() {
	    }
	    
	    public Ordem_expedicao(int id, String data_criacao, Status status_id, Usuario usuario_id) {
	        this.id = id;
	        this.data_criacao = data_criacao;
	        this.status_id = status_id;
	        this.usuario_id = usuario_id;
	    }
	    
	    public int getId() {
	        return this.id;
	    }
	    
	    public void setId(int id) {
	        this.id = id;
	    }
	    
	    public String getData_criacao() {
	        return this.data_criacao;
	    }
	    
	    public void setData_criacao(String data_criacao) {
	        this.data_criacao = data_criacao;
	    }
	    
	    public Status getStatus_id() {
	        return this.status_id;
	    }
	    
	    public void setStatus_id(Status status_id) {
	        this.status_id = status_id;
	    }
	    
	    public Usuario getUsuario_id() {
	        return this.usuario_id;
	    }
	    
	    public void setUsuario_id(Usuario usuario_id) {
	        this.usuario_id = usuario_id;
	    }
	
}
