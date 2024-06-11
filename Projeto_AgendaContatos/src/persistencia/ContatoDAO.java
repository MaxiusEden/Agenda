/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;


import modelos.Contato;
import modelos.Telefone;
import modelos.Endereco;
import modelos.Icrud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.ConexaoBD;

public class ContatoDAO implements Icrud {
    private Connection conexao = null;

    public ContatoDAO() throws Exception {
        conexao = ConexaoBD.getConexao();
    }

    @Override
    public void incluir(Contato objeto) throws Exception {
    try {
        String sql = "INSERT INTO contatos(nomeCompleto, ddi, ddd, numero, email, logradouro, numeroEndereco,"
                + " complemento, cep, cidade, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, objeto.getNomeCompleto());
        preparedStatement.setInt(2, objeto.getTelefone().getDdi());
        preparedStatement.setInt(3, objeto.getTelefone().getDdd());
        preparedStatement.setInt(4, objeto.getTelefone().getNumero());
        preparedStatement.setString(5, objeto.getEmail());
        preparedStatement.setString(6, objeto.getEndereco().getLogradouro());
        preparedStatement.setString(7, objeto.getEndereco().getNumero());
        preparedStatement.setString(8, objeto.getEndereco().getComplemento());
        preparedStatement.setInt(9, objeto.getEndereco().getCep());
        preparedStatement.setString(10, objeto.getEndereco().getCidade());
        preparedStatement.setString(11, objeto.getEndereco().getEstado());
        preparedStatement.executeUpdate();

    } catch (SQLException erro) {
        throw new Exception("Erro ao inserir contato no banco de dados: " + erro.getMessage());
    }
}

    @Override
    public void excluir(String nomeCompleto) throws Exception {
        try {
            String sql = "DELETE FROM contatos WHERE nomecompleto=?";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, nomeCompleto);
            preparedStatement.executeUpdate();
        } catch (SQLException erro) {
            throw new Exception("SQL Erro: " + erro.getMessage());
        }
    }

    @Override
    public void alterar(Contato contatoAntigo, Contato contatoNovo) throws Exception {
        try {
            String sql = "UPDATE contatos SET nomeCompleto=?, ddi=?, ddd=?, numero=?, email=?, logradouro=?,"
                    + " numeroEndereco=?, complemento=?, cep=?, cidade=?, estado=? WHERE nomecompleto=?";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, contatoNovo.getNomeCompleto());
            preparedStatement.setInt(2, contatoNovo.getTelefone().getDdi());
            preparedStatement.setInt(3, contatoNovo.getTelefone().getDdd());
            preparedStatement.setInt(4, contatoNovo.getTelefone().getNumero());
            preparedStatement.setString(5, contatoNovo.getEmail());
            preparedStatement.setString(6, contatoNovo.getEndereco().getLogradouro());
            preparedStatement.setString(7, contatoNovo.getEndereco().getNumero());
            preparedStatement.setString(8, contatoNovo.getEndereco().getComplemento());
            preparedStatement.setInt(9, contatoNovo.getEndereco().getCep());
            preparedStatement.setString(10, contatoNovo.getEndereco().getCidade());
            preparedStatement.setString(11, contatoNovo.getEndereco().getEstado());
            preparedStatement.setString(12, contatoAntigo.getNomeCompleto());
            preparedStatement.executeUpdate();

        } catch (SQLException erro) {
            throw new Exception("SQL Erro: " + erro.getMessage());
        }
    }

    @Override
public List<Contato> consultar(String nome) throws Exception {
    List<Contato> contatos = new ArrayList<>();
    try {
        String sql = "SELECT * FROM contatos WHERE nomecompleto LIKE ?";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, "%" + nome + "%");
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id");
            String nomeCompleto = rs.getString("nomecompleto");
            int ddi = rs.getInt("ddi");
            int ddd = rs.getInt("ddd");
            int numero = rs.getInt("numero");
            String email = rs.getString("email");
            String logradouro = rs.getString("logradouro");
            String numeroEndereco = rs.getString("numeroEndereco");
            String complemento = rs.getString("complemento");
            int cep = rs.getInt("cep");
            String cidade = rs.getString("cidade");
            String estado = rs.getString("estado");
            Telefone telefone = new Telefone(ddi, ddd, numero);
            Endereco endereco = new Endereco(logradouro, numeroEndereco, complemento, cep, cidade, estado);
            Contato contato = new Contato(id, nomeCompleto, telefone, email, endereco); 
            contatos.add(contato);
        }
    } catch (SQLException erro) {
        throw new Exception("SQL Erro: " + erro.getMessage());
    }
    return contatos;
}


    @Override
public List<Contato> listar() throws Exception {
    List<Contato> contatos = new ArrayList<>();
    try {
        String sql = "SELECT * FROM contatos";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id");
                String nome = rs.getString("nomeCompleto");
                int ddi = rs.getInt("ddi");
                int ddd = rs.getInt("ddd");
                int numero = rs.getInt("numero");
                String email = rs.getString("email");
                String logradouro = rs.getString("logradouro");
                String numeroEndereco = rs.getString("numeroEndereco");
                String complemento = rs.getString("complemento");
                int cep = rs.getInt("cep");
                String cidade = rs.getString("cidade");
                String estado = rs.getString("estado");
                Telefone telefone = new Telefone(ddi, ddd, numero);
                Endereco endereco = new Endereco(logradouro, numeroEndereco, complemento, cep, cidade, estado);
                Contato contato = new Contato(id, nome, telefone, email, endereco);
            contato.setId(id); 
            contatos.add(contato);
        }
    } catch (SQLException erro) {
        throw new Exception("SQL Erro: " + erro.getMessage());
    }
    return contatos;
}
}
