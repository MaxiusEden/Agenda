/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import modelos.Contato;
import modelos.Endereco;
import modelos.Icrud;
import modelos.Telefone;
import controle.ControleContato;
import java.awt.Desktop;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO implements Icrud {
    private File arquivo;
    ControleContato controle = new ControleContato(this);

    public ContatoDAO() {
        arquivo = new File("contatos.txt");
        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
            } catch (IOException e) {
                tratarExcecao(e);
            }
        }
    }

  @Override
public void adicionar(Contato contato) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true))) {
        String telefoneFormatado = "+" + contato.getTelefone().getDdi() + "(" + contato.getTelefone().getDdd() + ")" + contato.getTelefone().getNumero();
        bw.write(contato.getNome() + ";" + telefoneFormatado + ";" + contato.getEmail() + ";" + contato.getEndereco().toString()); // Ajuste aqui
        bw.newLine();
    } catch (IOException e) {
        tratarExcecao(e);
    }
}

@Override
public List<Contato> listar() {
    List<Contato> contatos = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
        String linha;
        while ((linha = br.readLine()) != null) {
            try {
                String[] partes = linha.split(";");
                if (partes.length > 1) {
                    String telefonePartes = partes[1].replaceAll("[^0-9]", ""); // Remove todos os caracteres não numéricos
                    int ddi = Integer.parseInt(telefonePartes.substring(0, 2));
                    int ddd = Integer.parseInt(telefonePartes.substring(2, 4));
                    String numero = telefonePartes.substring(4);
                    Telefone telefone = new Telefone(ddi, ddd, numero);

                    String[] enderecoPartes = partes[3].split(", ");
                    String logradouro = enderecoPartes[0];
                    int numeroEnd = Integer.parseInt(enderecoPartes[1]);
                    String complemento = enderecoPartes[2];
                    int cep = Integer.parseInt(enderecoPartes[3]);
                    String cidade = enderecoPartes[4];
                    String estado = enderecoPartes[5];

                    Endereco endereco = new Endereco(logradouro, numeroEnd, complemento, cep, cidade, estado);

                    contatos.add(new Contato(partes[0], telefone, partes[2], endereco));
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.err.println("Erro ao processar linha do arquivo: " + linha);
                e.printStackTrace();
            }
        }
    } catch (IOException e) {
        System.err.println("Erro ao ler o arquivo: " + arquivo.getPath());
        e.printStackTrace();
    }
    return contatos;
}

@Override
public void deletar(String nome) {
    List<Contato> contatos = listar();
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
        for (Contato contato : contatos) {
            if (!contato.getNome().equals(nome)) {
                bw.write(contato.toFormattedString());
                bw.newLine();
            }
        }
    } catch (IOException e) {
        tratarExcecao(e);
    }
}

@Override
public void alterar(Contato contatoAntigo, Contato contatoNovo) {
    List<Contato> contatos = listar();
    for (int i = 0; i < contatos.size(); i++) {
        Contato contato = contatos.get(i);
        if (contato.equals(contatoAntigo)) {
            contatos.set(i, contatoNovo);
            break;
        }
    }
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
        for (Contato contato : contatos) {
            bw.write(contato.toFormattedString());
            bw.newLine();
        }
    } catch (IOException e) {
        tratarExcecao(e);
    }
}


    @Override
public Contato consultar(String nome) {
    List<Contato> contatos = controle.listar();
    for (Contato contato : contatos) {
        if (contato.getNome().equals(nome)) {
            return contato;
        }
    }
    return null;
}

    @Override
    public void criarPdf(List<Contato> contatos) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("contatos.pdf"));
            document.open();
            for (Contato contato : contatos) {
                document.add(new Paragraph(contato.toString()));
            }
        } catch (DocumentException | IOException e) {
            tratarExcecao(e);
        } finally {
            document.close();
        }
    }

    @Override
    public void abrirPdf(String filePath) {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(new File(filePath));
            } else {
                throw new UnsupportedOperationException("Abertura de PDF não é suportada neste sistema.");
            }
        } catch (IOException | UnsupportedOperationException e) {
            tratarExcecao(e);
        }
    }
 public boolean verificarEmail(String email) {
        return email.contains("@");
    }
    private void tratarExcecao(Exception e) {
        e.printStackTrace(); // Apenas loga o erro no console
    }
}

