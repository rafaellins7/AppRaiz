package App;

import java.time.LocalDate;

public class Estoque {
    private int id;
    private Lote lote;
    private Armazem armazem;
    private int quantidadeDisponivel;
    private Especies especie;
    private LocalDate dataUltimaAtualizacao;

    public Estoque() {
    }

    public Estoque(int id, Lote lote, Armazem armazem, int quantidadeDisponivel,
                   Especies especie, LocalDate dataUltimaAtualizacao) {
        this.id = id;
        this.lote = lote;
        this.armazem = armazem;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.especie = especie;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Armazem getArmazem() {
        return armazem;
    }

    public void setArmazem(Armazem armazem) {
        this.armazem = armazem;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public Especies getEspecie() {
        return especie;
    }

    public void setEspecie(Especies especie) {
        this.especie = especie;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }
}
