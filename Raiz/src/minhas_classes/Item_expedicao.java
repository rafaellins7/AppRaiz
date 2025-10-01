package App;

public class Item_expedicao {
    private int id;
    private Ordem_expedicao ordem_id;
    private String quantidade;
    
    public Item_expedicao() {
    }
    
    public Item_expedicao(int id, Ordem_expedicao ordem_id, String quantidade) {
        this.id = id;
        this.ordem_id = ordem_id;
        this.quantidade = quantidade;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public Ordem_expedicao getOrdem_id() {
        return this.ordem_id;
    }
    
    public void setOrdem_id(Ordem_expedicao ordem_id) {
        this.ordem_id = ordem_id;
    }
    
    public String getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
}