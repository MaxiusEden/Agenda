/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos;

import java.util.List;

public interface Icrud {
    void adicionar(Contato contato);
    List<Contato> listar();
    void deletar(String nome);
    void alterar(Contato contatoAlterado, Contato contatoNovo);
    Contato consultar(String nome);
    void criarPdf(List<Contato> contatos);
    void abrirPdf(String filePath);
}
