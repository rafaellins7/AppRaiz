package App;

public class ItemPedido {
    private int id;
    private String quantidade;

    public ItemPedido() {
    }

    public ItemPedido(int id, String quantidade) {
        this.id = id;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
}
