package App;

public class Municipio {
    private int id;
    private String nome;
    private Endereco endereco;
    private String cnpj; 
    
    public Municipio() {
    	
    }
    
    public Municipio(int id, String nome, Endereco endereco, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
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
    
    public Endereco getEndereco() {
    	return endereco;
    	}
    
    public void setEndereco(Endereco endereco) { 
    		this.endereco = endereco;
    	}
    
    public String getCnpj() { 
    	return cnpj;
    	}
    
    public void setCnpj(String cnpj) { 
    	this.cnpj = cnpj; 
    	}
}
