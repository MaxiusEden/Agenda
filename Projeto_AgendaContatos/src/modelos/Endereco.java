/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author filip
 */
public class Endereco {
  private String logradouro = "";
  private int numero = 0;
  private String complemento = "";
  private int cep = 0;
  private String cidade = "";
  private String estado = "";
  
  public Endereco(String logradouro, int numero, String complemento, int cep, String cidade, String estado){
    this.logradouro = logradouro;
    this.numero = numero;
    this.complemento = complemento;
    this.cep = cep;
    this.cidade = cidade;
    this.estado = estado;
  }

  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public int getCep() {
    return cep;
  }

  public void setCep(int cep) {
    this.cep = cep;
  }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

  @Override
public String toString() {
    return "Endereco{" +
            "logradouro=" + logradouro +
            ", numero=" + numero +
            ", complemento=" + complemento +
            ", cep=" + cep +
            ", cidade=" + cidade +
            ", estado=" + estado +
            '}';
}
}
