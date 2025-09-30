package App;

public class Pedidos {
	    private int id;
	    private Status status_id;
	    private Fornecedor fornecedor_id;
	    private Lote lote_id;
	    private Ordem_expedicao ordem_id;
	    private Item_expedicao item_id;
	    
	    public Pedidos() {
	    }
	    
	    public Pedidos(int id, Status status_id, Fornecedor fornecedor_id, Lote lote_id, 
	                   Ordem_expedicao ordem_id, Item_expedicao item_id) {
	        this.id = id;
	        this.status_id = status_id;
	        this.fornecedor_id = fornecedor_id;
	        this.lote_id = lote_id;
	        this.ordem_id = ordem_id;
	        this.item_id = item_id;
	    }
	    
	    public int getId() {
	        return this.id;
	    }
	    
	    public void setId(int id) {
	        this.id = id;
	    }
	    
	    public Status getStatus_id() {
	        return this.status_id;
	    }
	    
	    public void setStatus_id(Status status_id) {
	        this.status_id = status_id;
	    }
	    
	    public Fornecedor getFornecedor_id() {
	        return this.fornecedor_id;
	    }
	    
	    public void setFornecedor_id(Fornecedor fornecedor_id) {
	        this.fornecedor_id = fornecedor_id;
	    }
	    
	    public Lote getLote_id() {
	        return this.lote_id;
	    }
	    
	    public void setLote_id(Lote lote_id) {
	        this.lote_id = lote_id;
	    }
	    
	    public Ordem_expedicao getOrdem_id() {
	        return this.ordem_id;
	    }
	    
	    public void setOrdem_id(Ordem_expedicao ordem_id) {
	        this.ordem_id = ordem_id;
	    }
	    
	    public Item_expedicao getItem_id() {
	        return this.item_id;
	    }
	    
	    public void setItem_id(Item_expedicao item_id) {
	        this.item_id = item_id;
	    }
	
}
