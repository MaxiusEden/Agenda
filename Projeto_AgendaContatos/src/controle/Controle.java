/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.List;
import modelos.Contato;
import modelos.Icrud;
import serviçospdf.MetodosPdf;

public class Controle implements Icrud {
    private Icrud contatoDAO;

    public Controle(Icrud contatoDAO) {
        this.contatoDAO = contatoDAO;
    }

    @Override
    public void incluir(Contato objeto) throws Exception {
        String erro = verificar(objeto);
        if (!erro.isEmpty()) {
            throw new IllegalArgumentException(erro);
        }
        try {
            contatoDAO.incluir(objeto);
        } catch (Exception e) {
            throw new Exception("Erro ao incluir contato: " + e.getMessage(), e);
        }
    }

    @Override
    public void excluir(String nomeCompleto) throws Exception {
        if (nomeCompleto == null || nomeCompleto.trim().isEmpty()) {
            throw new IllegalArgumentException("Insira o nome do contato a ser excluído.");
        }
        try {
            contatoDAO.excluir(nomeCompleto);
        } catch (Exception e) {
            throw new Exception("Erro ao excluir contato: " + e.getMessage(), e);
        }
    }

    @Override
    public void alterar(Contato contatoAntigo, Contato contatoNovo) throws Exception {
        String erro = verificar(contatoNovo);
        if (!erro.isEmpty()) {
            throw new IllegalArgumentException(erro);
        }
        try {
            contatoDAO.alterar(contatoAntigo, contatoNovo);
        } catch (Exception e) {
            throw new Exception("Erro ao alterar contato: " + e.getMessage(), e);
        }
    }

    @Override
    public List<Contato> listar() throws Exception {
        try {
            return contatoDAO.listar();
        } catch (Exception e) {
            throw new Exception("Erro ao listar contatos: " + e.getMessage(), e);
        }
    }

    @Override
    public List<Contato> consultar(String nome) throws Exception {
        try {
            return contatoDAO.consultar(nome);
        } catch (Exception e) {
            throw new Exception("Erro ao consultar contato: " + e.getMessage(), e);
        }
    }

    public void gerarPdf(List<Contato> contatos) {
        try {
            String filePath = "Tabela.PDF";
            new MetodosPdf().gerarPdf(contatos, filePath);
        } catch (Exception e) {
            System.out.println("Erro ao gerar PDF: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void abrirPdf(String filePath) {
        try {
            new MetodosPdf().abrirPdf(filePath);
        } catch (Exception e) {
            System.out.println("Erro ao abrir PDF: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private String verificar(Contato objeto) {
    StringBuilder erro = new StringBuilder();
    
    if (objeto.getNomeCompleto().isEmpty()) {
        erro.append("Campo nome é obrigatório.\n");
    }   
    if (!objeto.getNomeCompleto().matches("^[\\p{L} .'-]+$")) {
        erro.append("Nome deve conter apenas letras.\n");
    }    
    if (objeto.getEmail().isEmpty()) {
        erro.append("Campo email é obrigatório.\n");
    }
    if (!objeto.getEmail().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
        erro.append("Email inválido.\n");
    }    
    if (Integer.toString(objeto.getTelefone().getDdi()).isEmpty()) {
        erro.append("Campo DDI é obrigatório.\n");
    }
    if (Integer.toString(objeto.getTelefone().getDdd()).isEmpty()) {
        erro.append("Campo DDD é obrigatório.\n");
    }
    if (Integer.toString(objeto.getTelefone().getNumero()).isEmpty()) {
        erro.append("Campo telefone é obrigatório.\n");
    }    
    if (objeto.getEndereco().getLogradouro().isEmpty()) {
        erro.append("Campo logradouro é obrigatório.\n");
    }
    if (objeto.getEndereco().getNumero().isEmpty()) {
        erro.append("Campo número é obrigatório.\n");
    }
    if (Integer.toString(objeto.getEndereco().getCep()).isEmpty()) {
        erro.append("Campo CEP é obrigatório.\n");
    }
    if (objeto.getEndereco().getCidade().isEmpty()) {
        erro.append("Campo cidade é obrigatório.\n");
    }
    if (objeto.getEndereco().getEstado().isEmpty()) {
        erro.append("Campo estado é obrigatório.\n");
    }
    
    String ddi = Integer.toString(objeto.getTelefone().getDdi());
    if (!ddi.matches("[0-9]+")) {
        erro.append("DDI deve conter apenas números.\n");
    }
    String ddd = Integer.toString(objeto.getTelefone().getDdd());
    if (!ddd.matches("[0-9]+")) {
        erro.append("DDD deve conter apenas números.\n");
    }
    String numero = Integer.toString(objeto.getTelefone().getNumero());
    if (!numero.matches("[0-9]+")) {
        erro.append("Número de telefone deve conter apenas números.\n");
    }   
    return erro.toString();
}
}
