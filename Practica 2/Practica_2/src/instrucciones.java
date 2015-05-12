
public class instrucciones extends javax.swing.JFrame {
	 public instrucciones() {
	        initComponents();
	        setLocationRelativeTo(null);
	    }

	 
	    @SuppressWarnings("unchecked")
	 
	    private void initComponents() {

	        jLabel1 = new javax.swing.JLabel();
	        jButton1 = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel1.setText("AQUI VAN LAS INSTRUCCIONES");
	        jLabel1.setSize(100, 100);

	        jButton1.setText("Menú");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jButton1)
	                .addGap(77, 77, 77))
	            .addGroup(layout.createSequentialGroup()
	                .addGap(25, 25, 25)
	                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(247, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(44, 44, 44)
	                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(28, 28, 28)
	                .addComponent(jButton1)
	                .addContainerGap(180, Short.MAX_VALUE))
	        );

	        pack();
	    }// </editor-fold>                        

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	 menu vent= new menu();
	 vent.setVisible(true);
	 this.dispose();
	 
	    }                                        

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String args[]) {
	       
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }

	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new instrucciones().setVisible(true);
	            }
	        });
	    }

	    private javax.swing.JButton jButton1;
	    private javax.swing.JLabel jLabel1;
	

}
