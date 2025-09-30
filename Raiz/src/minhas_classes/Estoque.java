package App;

public class Estoque {
	    private int id;
	    private Lote lote_id;
	    private Armazem armazem_id;
	    private int quantidade_disponivel;
	    private Especies especie_id;
	    private String data_ultima_atualizacao;
	    
	    public Estoque() {
	    }
	    
	    public Estoque(int id, Lote lote_id, Armazem armazem_id, int quantidade_disponivel, 
	                   Especies especie_id, String data_ultima_atualizacao) {
	        this.id = id;
	        this.lote_id = lote_id;
	        this.armazem_id = armazem_id;
	        this.quantidade_disponivel = quantidade_disponivel;
	        this.especie_id = especie_id;
	        this.data_ultima_atualizacao = data_ultima_atualizacao;
	    }
	    
	    public int getId() {
	        return this.id;
	    }
	    
	    public void setId(int id) {
	        this.id = id;
	    }
	    
	    public Lote getLote_id() {
	        return this.lote_id;
	    }
	    
	    public void setLote_id(Lote lote_id) {
	        this.lote_id = lote_id;
	    }
	    
	    public Armazem getArmazem_id() {
	        return this.armazem_id;
	    }
	    
	    public void setArmazem_id(Armazem armazem_id) {
	        this.armazem_id = armazem_id;
	    }
	    
	    public int getQuantidade_disponivel() {
	        return this.quantidade_disponivel;
	    }
	    
	    public void setQuantidade_disponivel(int quantidade_disponivel) {
	        this.quantidade_disponivel = quantidade_disponivel;
	    }
	    
	    public Especies getEspecie_id() {
	        return this.especie_id;
	    }
	    
	    public void setEspecie_id(Especies especie_id) {
	        this.especie_id = especie_id;
	    }
	    
	    public String getData_ultima_atualizacao() {
	        return this.data_ultima_atualizacao;
	    }
	    
	    public void setData_ultima_atualizacao(String data_ultima_atualizacao) {
	        this.data_ultima_atualizacao = data_ultima_atualizacao;
	    }

}
