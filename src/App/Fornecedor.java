package App;

public class Fornecedor {
    private int id;
    private String nome;
    private Usuario usuario;
    private Endereco endereco;
    private Lote lote;
    
    public Fornecedor() {
    	
    }
    
    public Fornecedor(int id, String nome, Usuario usuario, Endereco endereco, Lote lote) {
        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
        this.endereco = endereco;
        this.lote = lote;
    }
    
    public int getId() { 
    	return id;
    	}
    
    public void setId(int id) { 
    	this.id = id;
    	}
    
    public String getNome() { 
    	return nome;
    	}
    
    public void setNome(String nome) { 
    	this.nome = nome; 
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
    
    public Lote getLote() {
    	return lote;
    	}
    
    public void setLote(Lote lote) { 
    	this.lote = lote; 
    	}
}
