package App;

public class Fornecedor {
    private int id;
    private String nome;
    private Usuario usuario_id;
    private Endereco endereco_id;
    private Lote lote_id;
    
    public Fornecedor() {
    }
    
    public Fornecedor(int id, String nome, Usuario usuario_id, Endereco endereco_id, Lote lote_id) {
        this.id = id;
        this.nome = nome;
        this.usuario_id = usuario_id;
        this.endereco_id = endereco_id;
        this.lote_id = lote_id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Usuario getUsuario_id() {
        return this.usuario_id;
    }
    
    public void setUsuario_id(Usuario usuario_id) {
        this.usuario_id = usuario_id;
    }
    
    public Endereco getEndereco_id() {
        return this.endereco_id;
    }
    
    public void setEndereco_id(Endereco endereco_id) {
        this.endereco_id = endereco_id;
    }
    
    public Lote getLote_id() {
        return this.lote_id;
    }
    
    public void setLote_id(Lote lote_id) {
        this.lote_id = lote_id;
    }
}