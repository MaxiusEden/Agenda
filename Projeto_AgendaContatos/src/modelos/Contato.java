/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;


public class Contato {
    private String nome = "";
    private Telefone telefone;
    private String email = "";
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato(String nome, Telefone telefone, String email, Endereco endereco) {
        this.nome = nome.toUpperCase();
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return nome + ";" + telefone.toString() + ";" + email;
    }
    public String toFormattedString() {
    String telefoneFormatado = "+" + telefone.getDdi() + telefone.formatarNumero();
    return nome + ";" + telefoneFormatado + ";" + email + ";" + endereco.toString();
}
}
