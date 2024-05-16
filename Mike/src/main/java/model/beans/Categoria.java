
package model.beans;

public class Categoria {
    
    private int cdCategoria;
    private String nome;

    public Categoria(int cdCategoria, String nome) {
        this.cdCategoria = cdCategoria;
        this.nome = nome;
    }
    
    public int getCdCategoria() {
        return cdCategoria;
    }

    

    public void setCdCategoria(int cdCategoria) {
        this.cdCategoria = cdCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
