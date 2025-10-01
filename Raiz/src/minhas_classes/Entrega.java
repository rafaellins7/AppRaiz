package App;

public class Entrega {
	    private int Id_Entrega;
	    private Item_expedicao item_id;
	    private String data_entrega;
	    private Status status_id;
	    
	    public Entrega() {
	    }
	    
	    public Entrega(int Id_Entrega, Item_expedicao item_id, String data_entrega, Status status_id) {
	        this.Id_Entrega = Id_Entrega;
	        this.item_id = item_id;
	        this.data_entrega = data_entrega;
	        this.status_id = status_id;
	    }
	    
	    public int getId_Entrega() {
	        return this.Id_Entrega;
	    }
	    
	    public void setId_Entrega(int Id_Entrega) {
	        this.Id_Entrega = Id_Entrega;
	    }
	    
	    public Item_expedicao getItem_id() {
	        return this.item_id;
	    }
	    
	    public void setItem_id(Item_expedicao item_id) {
	        this.item_id = item_id;
	    }
	    
	    public String getData_entrega() {
	        return this.data_entrega;
	    }
	    
	    public void setData_entrega(String data_entrega) {
	        this.data_entrega = data_entrega;
	    }
	    
	    public Status getStatus_id() {
	        return this.status_id;
	    }
	    
	    public void setStatus_id(Status status_id) {
	        this.status_id = status_id;
	    }
	
}
