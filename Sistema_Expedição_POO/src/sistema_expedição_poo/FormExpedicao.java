package sistema_expedição_poo;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FormExpedicao extends javax.swing.JFrame {
    ArrayList<Expedicao> listaExpedicoes = new ArrayList();    
    ArrayList<Trilha> listaTrilhas = new ArrayList();
                 
    Expedicao expe;
    public Expedicao buscarExpedicao(int codigo) {
        for (Expedicao expe : listaExpedicoes) {
            if (expe.getCodExpedicao() == codigo) {
                return expe;
            }
        }
        
        return null;
    }
    
    
    public Trilha buscarTrilha(int codigo) {
        for (Trilha trilha : listaTrilhas) {
            if (trilha.getCodTrilha() == codigo) {
                return trilha;
            }
        }
        
        return null;
    }
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormExpedicao.class.getName());

    public FormExpedicao() {
        initComponents();
        
        listaTrilhas.add(new Trilha(1, 2, 5, "Trilha da Cachoeira", 20.00));
        listaTrilhas.add(new Trilha(2, 4, 12, "Trilha da Montanha", 35.00));
        listaTrilhas.add(new Trilha(3, 1, 3, "Trilha do Lago", 10.00));
        listaTrilhas.add(new Trilha(4, 3, 8, "Trilha da Mata", 25.00));
        
        for (Trilha trilha : listaTrilhas) {
            cbTrilhas.addItem(trilha);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnConfirmadas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbTrilhas = new javax.swing.JComboBox<>();
        tfCodExpedicaoBuscar = new javax.swing.JTextField();
        tfCodExpedicao = new javax.swing.JTextField();
        tfDataExpedicao = new javax.swing.JTextField();
        tfNomeGuia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfQtdParticipantes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnExpedicoes = new javax.swing.JButton();
        btnTotalArrecadado = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(this::btnCadastrarActionPerformed);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        btnConfirmadas.setText("Confirmadas");
        btnConfirmadas.addActionListener(this::btnConfirmadasActionPerformed);

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        jLabel1.setText("Trilhas");

        jLabel2.setText("Código da Expedição");

        cbTrilhas.addActionListener(this::cbTrilhasActionPerformed);

        jLabel3.setText("Data Expedição");

        jLabel4.setText("Código Expedição");

        jLabel6.setText("Nome Guia");

        jLabel7.setText("Quantidade Participantes");

        btnExpedicoes.setText("Expedições");
        btnExpedicoes.addActionListener(this::btnExpedicoesActionPerformed);

        btnTotalArrecadado.setText("Total Arrecadado");
        btnTotalArrecadado.addActionListener(this::btnTotalArrecadadoActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbTrilhas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfCodExpedicaoBuscar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfCodExpedicao, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4))
                                    .addComponent(tfDataExpedicao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfNomeGuia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel7))
                                        .addComponent(tfQtdParticipantes, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(126, 126, 126))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnExpedicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btnConfirmadas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(btnTotalArrecadado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCodExpedicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDataExpedicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNomeGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQtdParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTrilhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCodExpedicaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTotalArrecadado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirmadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnExpedicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTrilhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTrilhasActionPerformed
        
    }//GEN-LAST:event_cbTrilhasActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
            if (tfCodExpedicao.getText().isEmpty() ||
                tfDataExpedicao.getText().isEmpty() ||
                tfNomeGuia.getText().isEmpty() ||
                tfQtdParticipantes.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                return;
            }
        
        
            int codExpedicao = Integer.parseInt(tfCodExpedicao.getText());
            String data = tfDataExpedicao.getText();
            String guia = tfNomeGuia.getText();
            int qtdeParticipante = Integer.parseInt(tfQtdParticipantes.getText());        
            Trilha tri = (Trilha) cbTrilhas.getSelectedItem();
             
            
            Expedicao expCadastrada = buscarExpedicao(codExpedicao);
            if (expCadastrada != null) {
                taSaida.setText("Expedição já cadastrada");
                return;
            }

            Expedicao expe = new Expedicao(codExpedicao, qtdeParticipante, data, guia, tri);
            listaExpedicoes.add(expe);
            expe.confirmarExpedicao(codExpedicao);
            
            taSaida.setText("Expedição Confirmada");
                 
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int codInserido = Integer.parseInt(tfCodExpedicaoBuscar.getText());
        taSaida.setText("");
        
        if (tfCodExpedicao.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Insira um código");       
        }
        
        Expedicao expResult = buscarExpedicao(codInserido);
        if (expResult != null) {
            taSaida.setText(expResult.retornarInfo());
        }else {
            taSaida.setText("Expedição não encontrada");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int codInserido = Integer.parseInt(tfCodExpedicaoBuscar.getText());
        taSaida.setText("");
        
        if (tfCodExpedicao.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Insira um código");    
            return;
        }
        
        Expedicao expResult = buscarExpedicao(codInserido);
        if (expResult != null) {
            expResult.cancelarExpedicao(codInserido);
            taSaida.setText(expResult.retornarInfo());            
        }else {
            taSaida.setText("Expedição não encontrada");
            return;
        }
                
        taSaida.setText("Expedição Cancelada");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmadasActionPerformed
        taSaida.setText("");

        for (Expedicao expe : listaExpedicoes) {
            if (expe.verificarSituacao()) {
                taSaida.append(expe.retornarInfo() + "\n\n");
            }
        }
        
    }//GEN-LAST:event_btnConfirmadasActionPerformed

    private void btnExpedicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpedicoesActionPerformed
        taSaida.setText("");
        
        for (Expedicao expe : listaExpedicoes) {
            taSaida.append(expe.retornarInfo() + "\n\n");
        }
    }//GEN-LAST:event_btnExpedicoesActionPerformed

    private void btnTotalArrecadadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalArrecadadoActionPerformed
        taSaida.setText("");

        int totalParticipantes = 0;
        double valorTotal = 0;

        for (Expedicao expe : listaExpedicoes) {
            totalParticipantes += expe.getQtdeParticipante();
            valorTotal += expe.calcularTotal();
        }

        taSaida.append("Total de participantes: " + totalParticipantes + "\n");
        taSaida.append("Valor total: R$ " + valorTotal);
    }//GEN-LAST:event_btnTotalArrecadadoActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormExpedicao().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmadas;
    private javax.swing.JButton btnExpedicoes;
    private javax.swing.JButton btnTotalArrecadado;
    private javax.swing.JComboBox<Trilha> cbTrilhas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JTextField tfCodExpedicao;
    private javax.swing.JTextField tfCodExpedicaoBuscar;
    private javax.swing.JTextField tfDataExpedicao;
    private javax.swing.JTextField tfNomeGuia;
    private javax.swing.JTextField tfQtdParticipantes;
    // End of variables declaration//GEN-END:variables
}
