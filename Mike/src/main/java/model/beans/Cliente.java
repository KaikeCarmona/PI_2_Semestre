
package model.beans;

import java.util.Date;

public class Cliente {
    
    private int cdCliente;
    private String cpf;
    private String numero;
    private String nome;
    private Date dtNascimento = new Date() ;

    public Cliente(int cdCliente, String cpf, String numero, String nome) {
        this.cdCliente = cdCliente;
        this.cpf = cpf;
        this.numero = numero;
        this.nome = nome;
    }

    public int getCdCliente() {
        return cdCliente;
    }

    public void setCdCliente(int cdCliente) {
        this.cdCliente = cdCliente;
    }

    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    
    
    public boolean validaUsuario(Cliente cliente){
        
        
        return true;
    }
    
    
}
