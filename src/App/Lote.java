package App;

public class Lote {
    private int id;
    private Usuario usuario;
    private int quantidade;
    private String peso;
    private Especies especie;
    private Fornecedor fornecedor;
    
    public Lote() {
    }
    
    public Lote(int id, Usuario usuario, int quantidade, String peso, 
                Especies especie, Fornecedor fornecedor) {
        this.id = id;
        this.usuario = usuario;
        this.quantidade = quantidade;
        this.peso = peso;
        this.especie = especie;
        this.fornecedor = fornecedor;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getPeso() {
        return peso;
    }
    
    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    public Especies getEspecie() {
        return especie;
    }
    
    public void setEspecie(Especies especie) {
        this.especie = especie;
    }
    
    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
