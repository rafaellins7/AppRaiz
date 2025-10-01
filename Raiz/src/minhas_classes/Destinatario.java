package App;

public class Destinatario {
	    private int id;
	    private Usuario usuario_id;
	    private Endereco endereco_id;
	    
	    public Destinatario() {
	    }
	    
	    public Destinatario(int id, Usuario usuario_id, Endereco endereco_id) {
	        this.id = id;
	        this.usuario_id = usuario_id;
	        this.endereco_id = endereco_id;
	    }
	    
	    public int getId() {
	        return this.id;
	    }
	    
	    public void setId(int id) {
	        this.id = id;
	    }
	    
	    public Usuario getUsuario_id() {
	        return this.usuario_id;
	    }
	    
	    public void setUsuario_id(Usuario usuario_id) {
	        this.usuario_id = usuario_id;
	    }
	    
	    public Endereco getEndereco_id() {
	        return this.endereco_id;
	    }
	    
	    public void setEndereco_id(Endereco endereco_id) {
	        this.endereco_id = endereco_id;
	    }
	
}
