package view;

import view.panels.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JPanel;

public class TelaPrincipal extends javax.swing.JFrame {
        
        
    //private JPanel painelPrincipal = null;
    private JPanel pnlCardLayout = null;
    private TelaVendas pnlVendas = null;
    private TelaProdutos pnlProdutos = null;
    private TelaClientes pnlClientes = null;
    private TelaRelatorio pnlRelatorios = null;

    
    public TelaPrincipal() {
        initComponents();
        initialize();
        mouseEmcimaPainel(btnClientes);
        configurarBotaoMouseExited(btnClientes);
        mouseEmcimaPainel(btnRelatorios);
        configurarBotaoMouseExited(btnRelatorios);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVendas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnProdutos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnRelatorios = new javax.swing.JPanel();
        lblRelatorio = new javax.swing.JLabel();
        painelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Futura-Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mike_logo.png"))); // NOI18N

        btnVendas.setBackground(new java.awt.Color(255, 255, 255));
        btnVendas.setForeground(new java.awt.Color(255, 255, 255));
        btnVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVendasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVendasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVendasMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Futura-Light", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vendas");

        javax.swing.GroupLayout btnVendasLayout = new javax.swing.GroupLayout(btnVendas);
        btnVendas.setLayout(btnVendasLayout);
        btnVendasLayout.setHorizontalGroup(
            btnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnVendasLayout.setVerticalGroup(
            btnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVendasLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnProdutos.setBackground(new java.awt.Color(255, 255, 255));
        btnProdutos.setForeground(new java.awt.Color(255, 255, 255));
        btnProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProdutosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProdutosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProdutosMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Futura-Light", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Produtos");

        javax.swing.GroupLayout btnProdutosLayout = new javax.swing.GroupLayout(btnProdutos);
        btnProdutos.setLayout(btnProdutosLayout);
        btnProdutosLayout.setHorizontalGroup(
            btnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnProdutosLayout.setVerticalGroup(
            btnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProdutosLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Futura-Light", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Clientes");

        javax.swing.GroupLayout btnClientesLayout = new javax.swing.GroupLayout(btnClientes);
        btnClientes.setLayout(btnClientesLayout);
        btnClientesLayout.setHorizontalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnClientesLayout.setVerticalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClientesLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnRelatorios.setBackground(new java.awt.Color(255, 255, 255));
        btnRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRelatoriosMouseClicked(evt);
            }
        });

        lblRelatorio.setFont(new java.awt.Font("Futura-Light", 0, 18)); // NOI18N
        lblRelatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRelatorio.setText("Relatorios");

        javax.swing.GroupLayout btnRelatoriosLayout = new javax.swing.GroupLayout(btnRelatorios);
        btnRelatorios.setLayout(btnRelatoriosLayout);
        btnRelatoriosLayout.setHorizontalGroup(
            btnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnRelatoriosLayout.setVerticalGroup(
            btnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRelatorios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelPrincipal.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendasMouseClicked
       ((CardLayout)painelPrincipal.getLayout()).show(painelPrincipal, "venda");
    }//GEN-LAST:event_btnVendasMouseClicked

    private void btnVendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendasMouseEntered
        btnVendas.setBackground(new Color(200, 200, 200));
        jLabel2.setForeground(Color.white);
        Cursor cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
        btnVendas.setCursor(cursor);
    }//GEN-LAST:event_btnVendasMouseEntered

    private void btnVendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendasMouseExited
       btnVendas.setBackground(Color.white);
       jLabel2.setForeground(Color.black);
    }//GEN-LAST:event_btnVendasMouseExited
   
    private void btnProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutosMouseClicked

       ((CardLayout)painelPrincipal.getLayout()).show(painelPrincipal, "produtos");
    }//GEN-LAST:event_btnProdutosMouseClicked

    private void btnProdutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutosMouseEntered
        btnProdutos.setBackground(new Color(200, 200, 200));
        jLabel3.setForeground(Color.white);
        Cursor cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
        btnProdutos.setCursor(cursor);
    }//GEN-LAST:event_btnProdutosMouseEntered

    private void btnProdutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutosMouseExited
       btnProdutos.setBackground(Color.white);
       jLabel3.setForeground(Color.black);
    }//GEN-LAST:event_btnProdutosMouseExited

    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked

        ((CardLayout)painelPrincipal.getLayout()).show(painelPrincipal, "clientes");
    }//GEN-LAST:event_btnClientesMouseClicked

    private void btnRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatoriosMouseClicked
        ((CardLayout)painelPrincipal.getLayout()).show(painelPrincipal, "relatorios");
    }//GEN-LAST:event_btnRelatoriosMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnProdutos;
    private javax.swing.JPanel btnRelatorios;
    private javax.swing.JPanel btnVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRelatorio;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
    
  private void initialize() {
       setaPainel();
       this.setSize(1200,560); // Substitua 800 e 600 pelos valores desejados de largura e altura
    
        // Centraliza a janela na tela
        this.setLocationRelativeTo(null);
    }
    
    public void setaPainel() {
  
        painelPrincipal.add(getVendasPanel(), getVendasPanel().getName());
        painelPrincipal.add(getProdutosPanel(), getProdutosPanel().getName());
        painelPrincipal.add(getClientesPanel(), getClientesPanel().getName());
        painelPrincipal.add(getRelatorioPanel(), getRelatorioPanel().getName());
        
        
    }
    
    
    private TelaVendas getVendasPanel(){
        if (pnlVendas == null) {
            pnlVendas = new TelaVendas();
            pnlVendas.setName("venda");
        }    
            
        return pnlVendas;
    }
    
    private TelaProdutos getProdutosPanel(){
        if (pnlProdutos == null) {
            pnlProdutos = new TelaProdutos();
            pnlProdutos.setName("produtos");
        }    
           
        return pnlProdutos;
    }
    
    private TelaClientes getClientesPanel(){
        if (pnlClientes == null) {
            pnlClientes = new TelaClientes();
            pnlClientes.setName("clientes");
        }    
           
        return pnlClientes;
    }
    
    private TelaRelatorio getRelatorioPanel(){
        if (pnlRelatorios == null) {
            pnlRelatorios = new TelaRelatorio();
            pnlRelatorios.setName("relatorios");
        }    
           
        return pnlRelatorios;
    }
    
    private void mouseEmcimaPainel(JPanel panel) {
    panel.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            panel.setBackground(new Color(200, 200, 200));
            panel.setForeground(Color.white);
            Cursor cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
            panel.setCursor(cursor);
        }
        // Adicione outros métodos de mouse aqui, se necessário
    });
    }
    
    private void configurarBotaoMouseExited(JPanel panel) {
    panel.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            panel.setBackground(Color.white);
            panel.setForeground(Color.black);
            
        }
    });
    }
   
    


}
