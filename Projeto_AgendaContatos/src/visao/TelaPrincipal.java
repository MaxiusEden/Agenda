/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controle.Controle;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Contato;
import modelos.Endereco;
import modelos.Telefone;
import persistencia.ContatoDAO;


/**
 *
 * @author filip
 */
public class TelaPrincipal extends javax.swing.JFrame {
private Controle controle;
private Contato contatoSelecionado;

    /**
     * Creates new form TelaPrincipal
     * @throws java.lang.Exception     
     */
    public TelaPrincipal() throws Exception {
        initComponents();
        controle = new Controle(new ContatoDAO());   
        atualizarTabela();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1_Lista = new javax.swing.JList<>();
        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jFormattedTextField_Telefone = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_NomeCompleto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Logradouro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Numero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Complemento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jFormattedTextField_CEP = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_Cidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField_Estado = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Tabela = new javax.swing.JTable();
        jButton_Adicionar = new javax.swing.JButton();
        jButton_Alterar = new javax.swing.JButton();
        jButton_Excluir = new javax.swing.JButton();
        jButton_Listar = new javax.swing.JButton();
        jLabel_Logo = new javax.swing.JLabel();
        jButton_PDF = new javax.swing.JButton();
        jButton_Sobre = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jPopupMenu1.setFocusable(false);

        jScrollPane2.setViewportView(jList1_Lista);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agenda de Contatos");

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("AGENDA DE CONTATOS");

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2.setForeground(new java.awt.Color(0, 102, 0));

        try {
            jFormattedTextField_Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+## (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField_Telefone.setText("+55   ()      -    ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome Completo:");

        jTextField_NomeCompleto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_NomeCompletoKeyReleased(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 102, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-mail:");

        jLabel4.setBackground(new java.awt.Color(0, 102, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone:");

        jLabel6.setBackground(new java.awt.Color(0, 102, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Logradouro:");

        jLabel7.setBackground(new java.awt.Color(0, 102, 51));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CEP:");

        jLabel8.setBackground(new java.awt.Color(0, 102, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Complemento:");

        jLabel9.setBackground(new java.awt.Color(0, 102, 51));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("N°:");

        try {
            jFormattedTextField_CEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel10.setBackground(new java.awt.Color(0, 102, 51));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cidade:");

        jLabel11.setBackground(new java.awt.Color(0, 102, 51));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Estado:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField_Logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField_Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextField_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField_NomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextField_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jFormattedTextField_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_NomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_Logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextField_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTable_Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Telefone", "Email", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Tabela.getTableHeader().setReorderingAllowed(false);
        jTable_Tabela.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTable_TabelaMouseMoved(evt);
            }
        });
        jTable_Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Tabela);
        if (jTable_Tabela.getColumnModel().getColumnCount() > 0) {
            jTable_Tabela.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        jButton_Adicionar.setBackground(new java.awt.Color(0, 102, 51));
        jButton_Adicionar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton_Adicionar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jButton_Adicionar.setText("ADICIONAR");
        jButton_Adicionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AdicionarActionPerformed(evt);
            }
        });

        jButton_Alterar.setBackground(new java.awt.Color(0, 102, 51));
        jButton_Alterar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton_Alterar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jButton_Alterar.setText("ALTERAR");
        jButton_Alterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AlterarActionPerformed(evt);
            }
        });

        jButton_Excluir.setBackground(new java.awt.Color(0, 102, 51));
        jButton_Excluir.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton_Excluir.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir1.png"))); // NOI18N
        jButton_Excluir.setText("EXCLUIR");
        jButton_Excluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExcluirActionPerformed(evt);
            }
        });

        jButton_Listar.setBackground(new java.awt.Color(0, 102, 51));
        jButton_Listar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton_Listar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Listar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listar.png"))); // NOI18N
        jButton_Listar.setText("LISTAR");
        jButton_Listar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ListarActionPerformed(evt);
            }
        });

        jLabel_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.jpg"))); // NOI18N
        jLabel_Logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton_PDF.setBackground(new java.awt.Color(0, 102, 51));
        jButton_PDF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_PDF.setForeground(new java.awt.Color(255, 255, 255));
        jButton_PDF.setText("PDF");
        jButton_PDF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PDFActionPerformed(evt);
            }
        });

        jButton_Sobre.setBackground(new java.awt.Color(0, 102, 51));
        jButton_Sobre.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton_Sobre.setText("Sobre");
        jButton_Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SobreActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Agenda De Contatos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(382, 382, 382)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Sobre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jButton_Adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_PDF, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_Sobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                .addComponent(jLabel5)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_PDF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 107, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void gerarPDF() {
        try {
            List<Contato> contatos = controle.listar();
            controle.gerarPdf(contatos);
            JOptionPane.showMessageDialog(this, "PDF criado com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao gerar PDF: " + ex.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void abrirPdf() {
        try {
            String filePath = "Tabela.PDF";
            controle.abrirPdf(filePath);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao abrir PDF: " + ex.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarTabela() {
    try {
        List<Contato> contatos = controle.listar();
        DefaultTableModel model = (DefaultTableModel) jTable_Tabela.getModel();
        model.setRowCount(0);

        for (Contato contato : contatos) {
            String telefoneStr = "+" + contato.getTelefone().getDdi() + "(" 
                    + contato.getTelefone().getDdd() + ")" + contato.getTelefone().getNumero();
            String cepStr = String.format("%05d-%03d", contato.getEndereco().getCep() / 1000,
                    contato.getEndereco().getCep() % 1000);
            String enderecoStr = contato.getEndereco().getLogradouro() 
                    + ", " + contato.getEndereco().getNumero() + ", " + contato.getEndereco().getComplemento() 
                    + ", " + cepStr + ", " + contato.getEndereco().getCidade() + ", " 
                    + contato.getEndereco().getEstado();

            Object[] dados = new Object[]{
                contato.getId(),
                contato.getNomeCompleto(),
                telefoneStr,
                contato.getEmail(),
                enderecoStr
            };
            model.addRow(dados);
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erro ao atualizar tabela: " + ex.getMessage(),
                "Erro", JOptionPane.ERROR_MESSAGE);
    }
}

private void atualizarTabela(List<Contato> resultados) {
    DefaultTableModel model = (DefaultTableModel) jTable_Tabela.getModel();
    model.setRowCount(0); // Limpa a tabela

    for (Contato contato : resultados) {
        String telefoneStr = "+" + contato.getTelefone().getDdi() + "(" + contato.getTelefone().getDdd() +
                ")" + contato.getTelefone().getNumero();
        String cepStr = String.format("%05d-%03d", contato.getEndereco().getCep() / 1000,
                contato.getEndereco().getCep() % 1000);
        String enderecoStr = contato.getEndereco().getLogradouro() + ", " +
                contato.getEndereco().getNumero() + ", " + contato.getEndereco().getComplemento() + ", " + cepStr +
                ", " + contato.getEndereco().getCidade() + ", " + contato.getEndereco().getEstado();

        Object[] dados = new Object[]{
            contato.getId(),
            contato.getNomeCompleto(),
            telefoneStr,
            contato.getEmail(),
            enderecoStr
        };
        model.addRow(dados);
    }
}

    private void jButton_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirActionPerformed
        try {
        int linhaSelecionada = jTable_Tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int confirmacao = JOptionPane.showConfirmDialog(this,
                    "Tem certeza de que deseja excluir este contato?",
                    "Confirmação de Exclusão",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);

            if (confirmacao == JOptionPane.YES_OPTION) {
                String nome = jTable_Tabela.getValueAt(linhaSelecionada, 1).toString();
                controle.excluir(nome);
                atualizarTabela();
                limparCampos();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum contato selecionado para exclusão.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Erro de Validação", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao excluir contato: " + e.getMessage(),
                "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton_ExcluirActionPerformed

    private void jButton_PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PDFActionPerformed

    try {
            gerarPDF();
            abrirPdf();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao gerar PDF: " + ex.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_PDFActionPerformed

    private void jTable_TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TabelaMouseClicked
   int linhaSelecionada = jTable_Tabela.getSelectedRow();
    if (linhaSelecionada >= 0) {
        Contato contatoSelecionado = getContatoFromSelectedRow(linhaSelecionada);
        if (contatoSelecionado != null) {
            String nome = contatoSelecionado.getNomeCompleto();
            String telefone = "+" + contatoSelecionado.getTelefone().getDdi() +
                    "(" + contatoSelecionado.getTelefone().getDdd() + ")" +
                    contatoSelecionado.getTelefone().getNumero();
            String email = contatoSelecionado.getEmail();
            String logradouro = contatoSelecionado.getEndereco().getLogradouro();
            String numero = String.valueOf(contatoSelecionado.getEndereco().getNumero());
            String complemento = contatoSelecionado.getEndereco().getComplemento();
            String cep = String.format("%05d-%03d",
                    contatoSelecionado.getEndereco().getCep() / 1000,
                    contatoSelecionado.getEndereco().getCep() % 1000);
            String cidade = contatoSelecionado.getEndereco().getCidade();
            String estado = contatoSelecionado.getEndereco().getEstado();
                        
            jTextField_NomeCompleto.setText(nome);
            jFormattedTextField_Telefone.setText(telefone);
            jTextField_Email.setText(email);
            jTextField_Logradouro.setText(logradouro);
            jTextField_Numero.setText(numero);
            jTextField_Complemento.setText(complemento);
            jFormattedTextField_CEP.setText(cep);
            jTextField_Cidade.setText(cidade);
            jTextField_Estado.setText(estado);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao buscar contato.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_jTable_TabelaMouseClicked
private Contato getContatoFromSelectedRow(int row) {
    DefaultTableModel model = (DefaultTableModel) jTable_Tabela.getModel();
    String nome = model.getValueAt(row, 1).toString();
    try {
        List<Contato> contatos = controle.consultar(nome); 
        if (contatos != null && !contatos.isEmpty()) {
            return contatos.get(0);
        } else {
            return null;
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao buscar contato: " + e.getMessage(),
                "Erro", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}

    private void jButton_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AdicionarActionPerformed
       try {
        String nome = jTextField_NomeCompleto.getText().trim();
        String telefone = jFormattedTextField_Telefone.getText().trim().replaceAll("[^0-9]", "");
        String email = jTextField_Email.getText().trim();
        String logradouro = jTextField_Logradouro.getText().trim();
        String numeroStr = jTextField_Numero.getText().trim().replaceAll("[^0-9]", "");
        String complemento = jTextField_Complemento.getText().trim();
        String cepStr = jFormattedTextField_CEP.getText().trim().replaceAll("[^0-9]", "");
        String cidade = jTextField_Cidade.getText().trim();
        String estado = jTextField_Estado.getText().trim();

        if (numeroStr.isEmpty() || cepStr.isEmpty() || telefone.isEmpty() || telefone.length() < 10) {
            throw new NumberFormatException("Preencha todos os campos corretamente.");
        }
if (numeroStr.isEmpty()){
    numeroStr = "S/N";
}
        Endereco end = new Endereco(logradouro, numeroStr,
                complemento, Integer.parseInt(cepStr), cidade, estado);
        Telefone tel = new Telefone(
                Integer.parseInt(telefone.substring(0, 2)),
                Integer.parseInt(telefone.substring(2, 4)),
                Integer.parseInt(telefone.substring(4))
        );
        Contato contato = new Contato(0, nome, tel, email, end);

        controle.incluir(contato);
        atualizarTabela();
        limparCampos();
        JOptionPane.showMessageDialog(this, "Contato incluído com sucesso!", "Sucesso",
                JOptionPane.INFORMATION_MESSAGE);
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Erro de Validação", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao processar a inclusão: " + e.getMessage(),
                "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton_AdicionarActionPerformed
private void limparCampos() {
        jTextField_NomeCompleto.setText("");
        jFormattedTextField_Telefone.setText("");
        jTextField_Email.setText("");
        jTextField_Logradouro.setText("");
        jTextField_Numero.setText("");
        jFormattedTextField_CEP.setText("");
        jTextField_Complemento.setText("");
        jTextField_Cidade.setText("");
        jTextField_Estado.setText("");
    }
    private void jButton_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ListarActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_jButton_ListarActionPerformed

    private void jButton_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AlterarActionPerformed
    int linhaSelecionada = jTable_Tabela.getSelectedRow();
    if (linhaSelecionada >= 0) {
        Contato contatoSelecionado = getContatoFromSelectedRow(linhaSelecionada);

        String novoNome = jTextField_NomeCompleto.getText().trim();
        String novoTelefone = jFormattedTextField_Telefone.getText().trim().replaceAll("[^0-9]", "");
        String novoEmail = jTextField_Email.getText().trim();
        String novoLogradouro = jTextField_Logradouro.getText().trim();
        String novoNumeroStr = jTextField_Numero.getText().trim().replaceAll("[^0-9]", "");
        String novoComplemento = jTextField_Complemento.getText().trim();
        String novoCepStr = jFormattedTextField_CEP.getText().trim().replaceAll("[^0-9]", "");
        String novaCidade = jTextField_Cidade.getText().trim();
        String novoEstado = jTextField_Estado.getText().trim();

        if (novoNome.isEmpty() || novoTelefone.isEmpty() || novoTelefone.length() < 10) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos corretamente.",
                    "Erro de Validação", JOptionPane.ERROR_MESSAGE);
            return;
        }
if (novoNumeroStr.isEmpty()){
    novoNumeroStr = "S/N";
}
        Endereco novoEndereco = new Endereco(novoLogradouro, novoNumeroStr,
                novoComplemento, Integer.parseInt(novoCepStr), novaCidade, novoEstado);
        Telefone novoTelefoneObj = new Telefone(Integer.parseInt(novoTelefone.substring(0, 2)),
                Integer.parseInt(novoTelefone.substring(2, 4)), Integer.parseInt(novoTelefone.substring(4)));
        Contato novoContato = new Contato(contatoSelecionado.getId(), novoNome, novoTelefoneObj,
                novoEmail, novoEndereco); 

        try {
            Controle controle = new Controle(new ContatoDAO());

            if (!novoNome.equals(contatoSelecionado.getNomeCompleto())) {
                List<Contato> contatoExistente = controle.consultar(novoNome);
                if (!contatoExistente.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Já existe um contato com este nome.",
                            "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            controle.alterar(contatoSelecionado, novoContato);

            jButton_ListarActionPerformed(evt);

            limparCampos();

            JOptionPane.showMessageDialog(this, "Contato alterado com sucesso!", "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao processar a alteração: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Selecione um contato para editar.", "Erro", JOptionPane.ERROR_MESSAGE);
    }


    }//GEN-LAST:event_jButton_AlterarActionPerformed

    private void jTextField_NomeCompletoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NomeCompletoKeyReleased
            String textoDigitado = jTextField_NomeCompleto.getText();
    String textoMaiusculo = textoDigitado.toUpperCase();
    jTextField_NomeCompleto.setText(textoMaiusculo);

    String termo = textoMaiusculo.trim();
    try {
        List<Contato> resultados = controle.consultar(termo);
        if (resultados != null) {
            atualizarTabela(resultados);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao consultar: " + e.getMessage(),
                "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jTextField_NomeCompletoKeyReleased

    private void jButton_SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SobreActionPerformed
        TelaSobre obj = new TelaSobre();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton_SobreActionPerformed

    private void jTable_TabelaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TabelaMouseMoved
       Point p = evt.getPoint();
        int row = jTable_Tabela.rowAtPoint(p);
        int col = jTable_Tabela.columnAtPoint(p);
        if (row >= 0 && col >= 0) {
            Object value = jTable_Tabela.getValueAt(row, col);
            if (value != null) {
                String tooltipText = value.toString();
                Rectangle cellRect = jTable_Tabela.getCellRect(row, col, true);
                if (jTable_Tabela.getColumnModel().getColumn(col).getWidth() < jTable_Tabela.getFontMetrics(jTable_Tabela.getFont()).stringWidth(tooltipText)) {
                    jTable_Tabela.setToolTipText(tooltipText);
                } else {
                    jTable_Tabela.setToolTipText(null);
                }
            } else {
                jTable_Tabela.setToolTipText(null);
            }
        } else {
            jTable_Tabela.setToolTipText(null);
        }
    }//GEN-LAST:event_jTable_TabelaMouseMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaPrincipal().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Adicionar;
    private javax.swing.JButton jButton_Alterar;
    private javax.swing.JButton jButton_Excluir;
    private javax.swing.JButton jButton_Listar;
    private javax.swing.JButton jButton_PDF;
    private javax.swing.JButton jButton_Sobre;
    private javax.swing.JFormattedTextField jFormattedTextField_CEP;
    private javax.swing.JFormattedTextField jFormattedTextField_Telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JList<String> jList1_Lista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Tabela;
    private javax.swing.JTextField jTextField_Cidade;
    private javax.swing.JTextField jTextField_Complemento;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Estado;
    private javax.swing.JTextField jTextField_Logradouro;
    private javax.swing.JTextField jTextField_NomeCompleto;
    private javax.swing.JTextField jTextField_Numero;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
