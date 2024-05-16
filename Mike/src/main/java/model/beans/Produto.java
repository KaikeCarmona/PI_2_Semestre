
package model.beans;

public class Produto {
    
    private int cdProduto;
    private String nome;
    private String fornecedor;
    private int qtdProduto;
    private double preco;
    
    public Produto(int cdProduto, String nome, String fornecedor, int qtdProduto, double preco) {
        this.cdProduto = cdProduto;
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.qtdProduto = qtdProduto;
        this.preco = preco;
    }
    

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
  
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

   

    public int getCdProduto() {
        return cdProduto;
    }

    public void setCdProduto(int cdProduto) {
        this.cdProduto = cdProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }
    
}
