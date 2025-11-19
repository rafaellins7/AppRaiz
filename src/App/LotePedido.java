package App;

public class LotePedido {
    private Lote lote;
    private Pedidos pedido;

    public LotePedido() {
    }

    public LotePedido(Lote lote, Pedidos pedido) {
        this.lote = lote;
        this.pedido = pedido;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Pedidos getPedido() {
        return pedido;
    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }
}

