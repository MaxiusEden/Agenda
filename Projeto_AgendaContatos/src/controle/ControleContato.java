/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import modelos.Contato;
import modelos.Icrud;
import persistencia.ContatoDAO;

import java.util.List;

public class ControleContato implements Icrud {
    private ContatoDAO contatoDAO;

    public ControleContato(ContatoDAO contatoDAO) {
        this.contatoDAO = contatoDAO;
    }

    @Override
    public void adicionar(Contato contato) {
        try {
            contatoDAO.adicionar(contato);
        } catch (Exception e) {
            tratarExcecao("Erro ao adicionar contato", e);
        }
    }

    @Override
    public List<Contato> listar() {
        try {
            return contatoDAO.listar();
        } catch (Exception e) {
            tratarExcecao("Erro ao listar contatos", e);
            return null;
        }
    }

    @Override
    public void deletar(String nome) {
        try {
            contatoDAO.deletar(nome);
        } catch (Exception e) {
            tratarExcecao("Erro ao deletar contato", e);
        }
    }

    @Override
    public void alterar(Contato contatoAlterado, Contato novo) {
    try {
        contatoDAO.alterar(contatoAlterado, novo);
    } catch (Exception e) {
        tratarExcecao("Erro ao alterar contato", e);
    }
}

    @Override
    public Contato consultar(String nome) {
        try {
            return contatoDAO.consultar(nome);
        } catch (Exception e) {
            tratarExcecao("Erro ao consultar contato", e);
            return null;
        }
    }

    @Override
    public void criarPdf(List<Contato> contatos) {
        try {
            contatoDAO.criarPdf(contatos);
        } catch (Exception e) {
            tratarExcecao("Erro ao criar PDF", e);
        }
    }

    @Override
    public void abrirPdf(String filePath) {
        try {
            contatoDAO.abrirPdf(filePath);
        } catch (Exception e) {
            tratarExcecao("Erro ao abrir PDF", e);
        }
    }

    public boolean verificarEmail(String email) {
        return contatoDAO.verificarEmail(email);
    }

    private void tratarExcecao(String mensagem, Exception e) {
        // Aqui podemos registrar o erro em um log ou lidar de outras formas
        System.err.println(mensagem + ": " + e.getMessage());
        e.printStackTrace();
    }

 
    
}


