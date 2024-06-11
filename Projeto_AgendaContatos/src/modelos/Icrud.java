/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.util.List;
/**
 *
 * @author filip
 */
public interface Icrud {
    void incluir(Contato objeto) throws Exception;
    void excluir(String nomeCompleto) throws Exception;
    void alterar(Contato objetoAntigo, Contato objetoNovo) throws Exception;
    List<Contato> listar() throws Exception;
    List<Contato> consultar(String nome) throws Exception;
    
}

