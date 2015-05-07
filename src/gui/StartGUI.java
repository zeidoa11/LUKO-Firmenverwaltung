/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Enis Lushtaku
 */
public class StartGUI extends javax.swing.JFrame
{

    /**
     * Creates new form StartGUI
     */
    public StartGUI()
    {
        initComponents();
        this.setTitle("LUKO Firmenverwaltung");
        this.setSize(650, 350);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        paStartOptionen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btStart = new javax.swing.JButton();
        btEinstellungen = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        paLogo = new javax.swing.JPanel();
        laLogo = new javax.swing.JLabel();
        mbStartGUI = new javax.swing.JMenuBar();
        mDatei = new javax.swing.JMenu();
        mBearbeiten = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paStartOptionen.setBackground(new java.awt.Color(255, 255, 255));
        paStartOptionen.setLayout(new java.awt.GridLayout(1, 5));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setOpaque(true);
        paStartOptionen.add(jLabel1);

        btStart.setBackground(new java.awt.Color(255, 0, 0));
        btStart.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btStart.setForeground(new java.awt.Color(255, 255, 255));
        btStart.setText("Start");
        btStart.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btStartActionPerformed(evt);
            }
        });
        paStartOptionen.add(btStart);

        btEinstellungen.setBackground(new java.awt.Color(255, 0, 0));
        btEinstellungen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btEinstellungen.setForeground(new java.awt.Color(255, 255, 255));
        btEinstellungen.setText("Einstellungen");
        paStartOptionen.add(btEinstellungen);

        btExit.setBackground(new java.awt.Color(255, 0, 0));
        btExit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btExit.setForeground(new java.awt.Color(255, 255, 255));
        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btExitActionPerformed(evt);
            }
        });
        paStartOptionen.add(btExit);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setOpaque(true);
        paStartOptionen.add(jLabel2);

        getContentPane().add(paStartOptionen, java.awt.BorderLayout.PAGE_END);

        paLogo.setBackground(new java.awt.Color(255, 255, 255));
        paLogo.setForeground(new java.awt.Color(51, 51, 51));
        paLogo.setLayout(new java.awt.BorderLayout());

        laLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/mainlogo.png"))); // NOI18N
        paLogo.add(laLogo, java.awt.BorderLayout.CENTER);

        getContentPane().add(paLogo, java.awt.BorderLayout.CENTER);

        mDatei.setText("Datei");
        mbStartGUI.add(mDatei);

        mBearbeiten.setText("Bearbeiten");
        mbStartGUI.add(mBearbeiten);

        setJMenuBar(mbStartGUI);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btExitActionPerformed
    {//GEN-HEADEREND:event_btExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btExitActionPerformed

    private void btStartActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btStartActionPerformed
    {//GEN-HEADEREND:event_btStartActionPerformed
        FirmaGUI firma = new FirmaGUI();
        firma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btStartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new StartGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEinstellungen;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel laLogo;
    private javax.swing.JMenu mBearbeiten;
    private javax.swing.JMenu mDatei;
    private javax.swing.JMenuBar mbStartGUI;
    private javax.swing.JPanel paLogo;
    private javax.swing.JPanel paStartOptionen;
    // End of variables declaration//GEN-END:variables
}
