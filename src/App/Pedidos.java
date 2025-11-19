package App;

public class Pedidos {
    private int id;
    private Status status;
    private Fornecedor fornecedor;
    private Lote lote;
    private ItemPedido item;

    public Pedidos() {
    }

  public Pedidos(int id, Status status, Fornecedor fornecedor, Lote lote, ItemPedido item) {
        this.id = id;
        this.status = status;
        this.fornecedor = fornecedor;
        this.lote = lote;
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public ItemPedido getItem() {
        return item;
    }

    public void setItem(ItemPedido item) {
        this.item = item;
    }
}
