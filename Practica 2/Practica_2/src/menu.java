
public class menu extends javax.swing.JFrame  {

	  public menu() {
	        initComponents();
	        setLocationRelativeTo(null);
	    }

	   
	    @SuppressWarnings("unchecked")
	                            
	    private void initComponents() {

	        jLabel1 = new javax.swing.JLabel();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();
	        jButton3 = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); 
	        jLabel1.setText("Torres de Hanoi");

	        jButton1.setText("Instrucciones");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        jButton2.setText("Tutorial");

	        jButton3.setText("Jugar");
	        jButton3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton3ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(106, 106, 106)
	                        .addComponent(jLabel1))
	                    .addGroup(layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(jButton1))
	                    .addGroup(layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(jButton2))
	                    .addGroup(layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(jButton3)))
	                .addContainerGap(104, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(19, 19, 19)
	                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(jButton1)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jButton2)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(jButton3)
	                .addContainerGap(126, Short.MAX_VALUE))
	        );

	        pack();
	    }                       

	    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	       
	    }                                        
	    
	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	instrucciones txt = new instrucciones();
	txt.setVisible(true);
	this.dispose();
	
	    }          
	    
	    
		public static void main(String args[]) {
	       
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }

	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new menu().setVisible(true);
	            }
	        });
	    }

	                         
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JButton jButton3;
	    private javax.swing.JLabel jLabel1;
       
}
