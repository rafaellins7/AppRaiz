package App;

public class Especies {
	    private int id;
	    private String nomeCientifico;
	    private String nomePopular;
	    private String categoria;
	    private String safra;
	    
	    public Especies() {
	    }
	    
	    public Especies(int id, String nomeCientifico, String nomePopular, String categoria, String safra) {
	        this.id = id;
	        this.nomeCientifico = nomeCientifico;
	        this.nomePopular = nomePopular;
	        this.categoria = categoria;
	        this.safra = safra;
	    }
	    
	    public int getId() {
	        return this.id;
	    }
	    
	    public void setId(int id) {
	        this.id = id;
	    }
	    
	    public String getNomeCientifico() {
	        return this.nomeCientifico;
	    }
	    
	    public void setNomeCientifico(String nomeCientifico) {
	        this.nomeCientifico = nomeCientifico;
	    }
	    
	    public String getNomePopular() {
	        return this.nomePopular;
	    }
	    
	    public void setNomePopular(String nomePopular) {
	        this.nomePopular = nomePopular;
	    }
	    
	    public String getCategoria() {
	        return this.categoria;
	    }
	    
	    public void setCategoria(String categoria) {
	        this.categoria = categoria;
	    }
	    
	    public String getSafra() {
	        return this.safra;
	    }
	    
	    public void setSafra(String safra) {
	        this.safra = safra;
	    }

}
