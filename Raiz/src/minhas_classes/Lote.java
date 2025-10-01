package App;

public class Lote {
	    private int Id;
	    private Usuario usuario_id;
	    private int quantidade;
	    private String peso;
	    private Especies especie_id;
	    private Fornecedor fornecedor_id;
	    
	    public Lote() {
	    }
	    
	    public Lote(int Id, Usuario usuarior_id, int quantidade, String peso, 
	                Especies especie_id, Fornecedor fornecedor_id) {
	        this.Id = Id;
	        this.usuario_id = usuarior_id;
	        this.quantidade = quantidade;
	        this.peso = peso;
	        this.especie_id = especie_id;
	        this.fornecedor_id = fornecedor_id;
	    }
	    
	    public int getId() {
	        return this.Id;
	    }
	    
	    public void setId(int Id) {
	        this.Id = Id;
	    }
	    
	    public Usuario getUsuarior_id() {
	        return this.usuario_id;
	    }
	    
	    public void setUsuarior_id(Usuario usuarior_id) {
	        this.usuario_id = usuarior_id;
	    }
	    
	    public int getQuantidade() {
	        return this.quantidade;
	    }
	    
	    public void setQuantidade(int quantidade) {
	        this.quantidade = quantidade;
	    }
	    
	    public String getPeso() {
	        return this.peso;
	    }
	    
	    public void setPeso(String peso) {
	        this.peso = peso;
	    }
	    
	    public Especies getEspecie_id() {
	        return this.especie_id;
	    }
	    
	    public void setEspecie_id(Especies especie_id) {
	        this.especie_id = especie_id;
	    }
	    
	    public Fornecedor getFornecedor_id() {
	        return this.fornecedor_id;
	    }
	    
	    public void setFornecedor_id(Fornecedor fornecedor_id) {
	        this.fornecedor_id = fornecedor_id;
	    }
	
}
