package model.beans;
import java.util.Date;

public class Venda {
 
    private int cdVenda;
    private Date dtVenda = new Date();
    private Produto produto;
    private Cliente cliente;

    public Venda(int cdVenda, Produto produto, Cliente cliente) {
        this.cdVenda = cdVenda;
        this.produto = produto;
        this.cliente = cliente;
    }

    public int getCdVenda() {
        return cdVenda;
    }

    public void setCdVenda(int cdVenda) {
        this.cdVenda = cdVenda;
    }

    public Date getDtVenda() {
        return dtVenda;
    }

    public void setDtVenda(Date dtVenda) {
        this.dtVenda = dtVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
