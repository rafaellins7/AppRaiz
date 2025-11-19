package App;

public class Destinatario {
    private int id;
    private Usuario usuario;
    private Endereco endereco;
    
    public Destinatario() {
    	
    }
    
    public Destinatario(int id, Usuario usuario, Endereco endereco) {
        this.id = id;
        this.usuario = usuario;
        this.endereco = endereco;
    }
    
    public int getId() { 
    	return id; 
    	}
    
    public void setId(int id) { 
    	this.id = id;
    	}
    
    public Usuario getUsuario() {
    	return usuario;
    	}
    
    public void setUsuario(Usuario usuario) {
    	this.usuario = usuario;
    	}
    
    public Endereco getEndereco() {
    	return endereco;
    	}
    
    public void setEndereco(Endereco endereco) {
    	this.endereco = endereco;
    	}
}
