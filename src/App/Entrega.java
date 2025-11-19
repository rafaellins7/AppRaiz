package App;

import java.time.LocalDate;

public class Entrega {
    private int id;
    private ItemPedido item;
    private LocalDate dataEntrega;
    private Status status;

    public Entrega() {
    }

    public Entrega(int id, ItemPedido item, LocalDate dataEntrega, Status status) {
        this.id = id;
        this.item = item;
        this.dataEntrega = dataEntrega;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ItemPedido getItem() {
        return item;
    }

    public void setItem(ItemPedido item) {
        this.item = item;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
