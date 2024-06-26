package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import util.Validador;

public class CadastroCliente extends javax.swing.JFrame {
private List<JTextField> camposDeEntrada;
   
    public CadastroCliente() {
        initComponents();
        apenasNumeros(fieldNumero);     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGap = new javax.swing.JPanel();
        panelCliente = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        labelRG = new javax.swing.JLabel();
        labelNascimento = new javax.swing.JLabel();
        labelContato = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        cbEstadoCivil = new javax.swing.JComboBox<>();
        cbSexo = new javax.swing.JComboBox<>();
        labelRG2 = new javax.swing.JLabel();
        fieldNascimento = new javax.swing.JFormattedTextField();
        fieldCPF = new javax.swing.JFormattedTextField();
        fieldContato = new javax.swing.JFormattedTextField();
        panelEndereco = new javax.swing.JPanel();
        labelNome1 = new javax.swing.JLabel();
        fieldRua = new javax.swing.JTextField();
        labelCEP = new javax.swing.JLabel();
        labelRG1 = new javax.swing.JLabel();
        fieldBairro = new javax.swing.JTextField();
        labelNascimento1 = new javax.swing.JLabel();
        fieldNumero = new javax.swing.JTextField();
        labelContato1 = new javax.swing.JLabel();
        fieldCidade = new javax.swing.JTextField();
        labelEmail1 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        labelContato2 = new javax.swing.JLabel();
        fieldComplemento = new javax.swing.JTextField();
        fieldCEP = new javax.swing.JFormattedTextField();
        btnAdicionar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        panelGap.setBackground(new java.awt.Color(204, 204, 204));
        panelGap.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelGap.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panelGapLayout = new javax.swing.GroupLayout(panelGap);
        panelGap.setLayout(panelGapLayout);
        panelGapLayout.setHorizontalGroup(
            panelGapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGapLayout.setVerticalGroup(
            panelGapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados pessoais"));

        labelNome.setText("Nome");

        labelCPF.setText("CPF");

        labelRG.setText("Sexo");

        labelNascimento.setText("Data de nascimento");

        labelContato.setText("Telefone p/ contato");

        labelEmail.setText("Email de contato");

        fieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEmailActionPerformed(evt);
            }
        });

        cbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Viúvo(a)", "União estável" }));

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outros" }));

        labelRG2.setText("Estado civíl");

        try {
            fieldNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            fieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            fieldContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNome)
                                    .addComponent(labelCPF))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(fieldCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addComponent(labelRG)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(fieldNome)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addComponent(labelNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addComponent(fieldNascimento)
                                .addGap(6, 6, 6)))
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addComponent(labelContato)
                                .addGap(81, 81, 81))
                            .addComponent(fieldContato)))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addComponent(labelRG2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbEstadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCPF)
                    .addComponent(labelRG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNascimento)
                    .addComponent(labelContato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(labelRG2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        labelNome1.setText("Rua");

        labelCEP.setText("CEP");

        labelRG1.setText("Bairro");

        labelNascimento1.setText("Número");

        labelContato1.setText("Cidade");

        labelEmail1.setText("UF");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));

        labelContato2.setText("Complemento");

        try {
            fieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout panelEnderecoLayout = new javax.swing.GroupLayout(panelEndereco);
        panelEndereco.setLayout(panelEnderecoLayout);
        panelEnderecoLayout.setHorizontalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnderecoLayout.createSequentialGroup()
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelEnderecoLayout.createSequentialGroup()
                                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNome1)
                                    .addComponent(labelCEP))
                                .addGap(170, 170, 170))
                            .addGroup(panelEnderecoLayout.createSequentialGroup()
                                .addComponent(fieldCEP)
                                .addGap(6, 6, 6)))
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRG1)
                            .addComponent(fieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(fieldRua)
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, 185, Short.MAX_VALUE)
                                .addComponent(fieldNumero, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelNascimento1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(labelEmail1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelContato1)
                                .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelContato2)
                                .addComponent(fieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelEnderecoLayout.setVerticalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addComponent(labelContato2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addComponent(labelNome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCEP)
                            .addComponent(labelRG1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNascimento1)
                            .addComponent(labelContato1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelEmail1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEmailActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
            fieldNome.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY));
            fieldCPF.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY));
            fieldNascimento.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY));
            fieldContato.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY));
            fieldEmail.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY));
            fieldRua.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY));
            fieldBairro.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY));
            fieldCidade.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY));
            fieldCEP.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY));
            fieldNumero.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY));
            fieldComplemento.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY));
        
        try {
            Validador valida = new Validador();
            
            fieldNome       = (JTextField) valida.validaTextField(fieldNome);
            fieldCPF        = (JFormattedTextField) valida.validaTextField(fieldCPF);
            fieldNascimento  = (JFormattedTextField) valida.validaTextField(fieldNascimento);
            fieldContato    = (JFormattedTextField) valida.validaTextField(fieldContato);
            fieldEmail      = (JTextField) valida.validaTextField(fieldEmail);
            fieldRua      = (JTextField) valida.validaTextField(fieldRua);
            fieldCEP      = (JFormattedTextField) valida.validaTextField(fieldCEP);
            fieldBairro      = (JTextField) valida.validaTextField(fieldBairro);
            fieldNumero      = (JTextField) valida.validaTextField(fieldNumero);
            fieldCidade      = (JTextField) valida.validaTextField(fieldCidade);
            fieldComplemento = (JTextField) valida.validaTextField(fieldComplemento);
            
            JOptionPane.showMessageDialog(fieldComplemento, "Cadastro Realizado com Sucesso!");
            this.dispose();
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelCliente, "Verifique se todos os campos estão preenchidos","ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
         inicializarListaCamposDeEntrada();
        obterCamposDeEntradaDoContainer(panelEndereco);
        obterCamposDeEntradaDoContainer(panelCliente);
        limparCamposDeTexto();
    }//GEN-LAST:event_btnLimparActionPerformed
    
    
    private void apenasNumeros(JTextField input){
        
           input.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent evt) {
                    String value = input.getText();
                    int l = value.length();
                if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
                    input.setEditable(true);
                } else {
                    input.setEditable(false);
                }
        } 
           });
        
    }
    private void inicializarListaCamposDeEntrada() {
        camposDeEntrada = new ArrayList<>();
    }
    
    private void obterCamposDeEntradaDoContainer(Container container) {
        Component[] componentes = container.getComponents();
        for (Component componente : componentes) {
            if (componente instanceof JTextField) {
                camposDeEntrada.add((JTextField) componente);
            } else if (componente instanceof Container) {
                obterCamposDeEntradaDoContainer((Container) componente);
            }
        }
    }
    
    private void limparCamposDeTexto() {
        for (JTextField campo : camposDeEntrada) {
            campo.setText(""); // Limpa o texto do campo
        }
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new CadastroCliente().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbEstadoCivil;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JTextField fieldBairro;
    private javax.swing.JFormattedTextField fieldCEP;
    private javax.swing.JFormattedTextField fieldCPF;
    private javax.swing.JTextField fieldCidade;
    private javax.swing.JTextField fieldComplemento;
    private javax.swing.JFormattedTextField fieldContato;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JFormattedTextField fieldNascimento;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldNumero;
    private javax.swing.JTextField fieldRua;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelContato;
    private javax.swing.JLabel labelContato1;
    private javax.swing.JLabel labelContato2;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEmail1;
    private javax.swing.JLabel labelNascimento;
    private javax.swing.JLabel labelNascimento1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNome1;
    private javax.swing.JLabel labelRG;
    private javax.swing.JLabel labelRG1;
    private javax.swing.JLabel labelRG2;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelEndereco;
    private javax.swing.JPanel panelGap;
    // End of variables declaration//GEN-END:variables
}
