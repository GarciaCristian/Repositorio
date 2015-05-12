
public class tutorial  extends javax.swing.JFrame {

	    public tutorial() {
	        initComponents();
	        setLocationRelativeTo(null);
	       
	    }

	    @SuppressWarnings("unchecked")
	                             
	    private void initComponents() {

	        jButton5 = new javax.swing.JButton();
	        btn4 = new javax.swing.JButton();
	        btn3 = new javax.swing.JButton();
	        btn2 = new javax.swing.JButton();
	        btn1 = new javax.swing.JButton();
	        btn8 = new javax.swing.JButton();
	        btn7 = new javax.swing.JButton();
	        btn6 = new javax.swing.JButton();
	        btn5 = new javax.swing.JButton();
	        btn12 = new javax.swing.JButton();
	        btn11 = new javax.swing.JButton();
	        btn10 = new javax.swing.JButton();
	        btn9 = new javax.swing.JButton();
	        jButton14 = new javax.swing.JButton();
	        jButton1 = new javax.swing.JButton();

	        jButton5.setText("jButton5");

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        btn4.setText("4");

	        btn3.setText("3");

	        btn2.setText("2");
	        btn2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btn2ActionPerformed(evt);
	            }
	        });

	        btn1.setText("1");
	        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mousePressed(java.awt.event.MouseEvent evt) {
	                btn1MousePressed(evt);
	            }
	        });

	        btn8.setText("4");
	        btn8.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btn8ActionPerformed(evt);
	            }
	        });

	        btn7.setText("3");

	        btn6.setText("2");
	        btn6.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btn6ActionPerformed(evt);
	            }
	        });

	        btn5.setText("1");
	        btn5.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btn5ActionPerformed(evt);
	            }
	        });

	        btn12.setText("4");

	        btn11.setText("3");

	        btn10.setText("2");
	        btn10.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btn10ActionPerformed(evt);
	            }
	        });

	        btn9.setText("1");

	        jButton14.setText("Comenzar");
	        jButton14.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton14ActionPerformed(evt);
	            }
	        });

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
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
	                .addComponent(jButton1)
	                .addGap(64, 64, 64))
	            .addGroup(layout.createSequentialGroup()
	                .addGap(53, 53, 53)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(8, 8, 8)
	                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(31, 31, 31)
	                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(21, 21, 21)
	                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(8, 8, 8)
	                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(31, 31, 31)
	                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(21, 21, 21)
	                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(8, 8, 8)
	                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(31, 31, 31)
	                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(21, 21, 21)
	                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton14)
	                    .addComponent(jButton1))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(btn9)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(btn11)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(btn12))
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(btn5)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(btn7)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(btn8))
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(btn1)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(btn3)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(btn4)))
	                .addGap(33, 33, 33))
	        );

	        pack();
	    }                       

	    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
	      
	    }                                    

	    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
	        
	    }                                    

	    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {                                      
	      
	    }                                     

	    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
	 btn1.setVisible(false);
	 btn8.setSize(btn1.getSize());
	 btn8.setText(btn1.getText());
	 btn8.setVisible(true);
	 btn2.setVisible(false);
	 btn12.setSize(btn2.getSize());
	 btn12.setText(btn2.getText());
	 btn12.setVisible(true);

	 
	 
	 
	    }                                         

	    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
	btn8.setVisible(false);
	    }                                    

	    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
	      
	    }                                    

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        menu vent= new menu();
	        vent.setVisible(true);
	        this.dispose();
	    }                                        

	    private void btn1MousePressed(java.awt.event.MouseEvent evt) {                                  
	        
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
	            java.util.logging.Logger.getLogger(tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	      
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new tutorial().setVisible(true);
	            }
	        });
	    }

	                         
	    private javax.swing.JButton btn1;
	    private javax.swing.JButton btn10;
	    private javax.swing.JButton btn11;
	    private javax.swing.JButton btn12;
	    private javax.swing.JButton btn2;
	    private javax.swing.JButton btn3;
	    private javax.swing.JButton btn4;
	    private javax.swing.JButton btn5;
	    private javax.swing.JButton btn6;
	    private javax.swing.JButton btn7;
	    private javax.swing.JButton btn8;
	    private javax.swing.JButton btn9;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton14;
	    private javax.swing.JButton jButton5;
	    // End of variables declaration 

}
