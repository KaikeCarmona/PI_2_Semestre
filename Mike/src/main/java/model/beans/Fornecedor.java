
package model.beans;
public class Fornecedor {
    
    private int cdForncedor;
    private String cnpj;
    private String nome;
    
    public Fornecedor(int cdForncedor, String cnpj, String nome) {
        this.cdForncedor = cdForncedor;
        this.cnpj = cnpj;
        this.nome = nome;
    }
    
    public int getCdForncedor() {
        return cdForncedor;
    }

    public void setCdForncedor(int cdForncedor) {
        this.cdForncedor = cdForncedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
