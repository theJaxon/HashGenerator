package hashgenerator;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.text.DefaultEditorKit;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;



public class generatorGUI extends javax.swing.JFrame 
{
    UIManager UI = new UIManager();
    public generatorGUI() 
    {
        initComponents();
        //Center the GUI on the screen
        setLocationRelativeTo(null);
        //Disable GUI Resizing
        setResizable(false);
        
        UI.put("OptionPane.background",new ColorUIResource(56,67,72));
        UI.put("Panel.background",new ColorUIResource(56,67,72));
        

        
      //Copy Paste & cut menu for the verify TextField
      JPopupMenu popup = new JPopupMenu();
      JMenuItem item = new JMenuItem(new DefaultEditorKit.CutAction());
      item.setText("Cut");
      popup.add(item);
      item = new JMenuItem(new DefaultEditorKit.CopyAction());
      item.setText("Copy");
      popup.add(item);
      item = new JMenuItem(new DefaultEditorKit.PasteAction());
      item.setText("Paste");
      popup.add(item);
      jTextField3.setComponentPopupMenu(popup);
      //Copy Menu for jTextField1 , SHA1textField and SHA256textField
      JPopupMenu popup2 = new JPopupMenu();
      item = new JMenuItem(new DefaultEditorKit.CopyAction());
      item.setText("Copy");
      popup2.add(item);
      jTextField1.setComponentPopupMenu(popup2);
      SHA1textField.setComponentPopupMenu(popup2);
      SHA256textField.setComponentPopupMenu(popup2);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SHA1textField = new javax.swing.JTextField();
        SHA256textField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hash Generator by -Jaxon-");

        jPanel2.setBackground(new java.awt.Color(56, 67, 72));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SHA1 :");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SHA256 :");

        SHA1textField.setBackground(new java.awt.Color(56, 67, 72));
        SHA1textField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        SHA1textField.setForeground(new java.awt.Color(255, 255, 255));
        SHA1textField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(246, 175, 190)));
        SHA1textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHA1textFieldActionPerformed(evt);
            }
        });

        SHA256textField.setBackground(new java.awt.Color(56, 67, 72));
        SHA256textField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        SHA256textField.setForeground(new java.awt.Color(255, 255, 255));
        SHA256textField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(246, 175, 190)));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MD5 :");

        jTextField1.setBackground(new java.awt.Color(56, 67, 72));
        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(246, 175, 190)));

        jTextField2.setBackground(new java.awt.Color(56, 67, 72));
        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(232, 126, 150)));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select the file that you want to generate the hash for :");

        jProgressBar1.setForeground(new java.awt.Color(0, 204, 102));
        jProgressBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 3, 0, new java.awt.Color(45, 213, 172)));

        jButton1.setBackground(new java.awt.Color(232, 126, 150));
        jButton1.setText("Browse");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(246, 175, 190));
        jButton2.setText("Copy MD5");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(246, 175, 190));
        jButton3.setText("Copy SHA1");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(246, 175, 190));
        jButton4.setText("Copy SHA256");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(35, 194, 130));
        jPanel1.setForeground(new java.awt.Color(84, 154, 141));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hashgenerator/1lock.png"))); // NOI18N
        jLabel1.setText("Hash Generator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToggleButton1.setBackground(new java.awt.Color(234, 76, 137));
        jToggleButton1.setText("Uppercase");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(67, 215, 122)));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MD5", "SHA1", "SHA256" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(232, 126, 150)));

        jTextField3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(232, 126, 150)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(232, 126, 150));
        jButton5.setText("Verify");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Verify with the original hash (paste the hash from the website here) :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(SHA1textField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SHA256textField, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SHA1textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton3))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SHA256textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(md5Copy.toUpperCase());
        SHA1textField.setText(sha1DigestCopy.toUpperCase());
        SHA256textField.setText(Sha256DigestCopy.toUpperCase());

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        StringSelection stringSelection = new StringSelection (SHA256textField.getText());
        Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
        clpbrd.setContents (stringSelection, null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        jButton4.setForeground(Color.red);
        jButton4.setText("Copied");
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        StringSelection stringSelection = new StringSelection (SHA1textField.getText());
        Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
        clpbrd.setContents (stringSelection, null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        jButton3.setForeground(Color.red);
        jButton3.setText("Copied");
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        StringSelection stringSelection = new StringSelection (jTextField1.getText());
        Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
        clpbrd.setContents (stringSelection, null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        jButton2.setForeground(Color.red);
        jButton2.setText("Copied");

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        FileInputStream fis = null;

        try {
            JFileChooser choose = new JFileChooser();
            choose.showOpenDialog(null);
            File myFile = choose.getSelectedFile();
            String FilePath = myFile.getAbsolutePath();
            InputStream is = new FileInputStream(FilePath);
            InputStream is2 = new FileInputStream(FilePath);
            String sha1Digest = sha1DigestCopy = DigestUtils.sha1Hex(is);
            String Sha256Digest = Sha256DigestCopy = DigestUtils.sha256Hex(is2);
            jTextField2.setText(FilePath);
            fis = new FileInputStream(new File(FilePath));
            byte data[] = org.apache.commons.codec.digest.DigestUtils.md5(fis);
            char md5Chars[] = Hex.encodeHex(data);
            String md5 = md5Copy = String.valueOf(md5Chars);
            jTextField1.setText(md5);
            SHA1textField.setText(sha1Digest);
            SHA256textField.setText(Sha256Digest);
            jProgressBar1.setValue(100);
            is.close();
            is2.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(generatorGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(generatorGUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();

            } catch (IOException ex) {
                Logger.getLogger(generatorGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        //jButton2.setBackground(null);
        // jButton2.setForeground(null);
        jButton2.setText("Copy MD5");
        jButton2.setForeground(null);
        jProgressBar1.setValue(0);
    }//GEN-LAST:event_jButton1MousePressed

    private void SHA1textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHA1textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SHA1textFieldActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //MD5 selection Handling
        if(jComboBox1.getSelectedItem().equals("MD5"))
        {
            //Compare MD5 text field with verify text field
            if(jTextField1.getText().equals(jTextField3.getText()))
            {
                UI.put("OptionPane.messageForeground",new ColorUIResource(35,194,130));
                JOptionPane.showMessageDialog (null, "MD5 Hash Matches.", "MD5 Verification", JOptionPane.INFORMATION_MESSAGE);
                
            }
            else 
            {
                UI.put("OptionPane.messageForeground", Color.red);
                JOptionPane.showMessageDialog (null, "MD5 Hash didn't match.", "MD5 Verification", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //SHA1 selection handling
        else if(jComboBox1.getSelectedItem().equals("SHA1"))
        {
            //Compare SHA1 text field with verify text field
            if(SHA1textField.getText().equals(jTextField3.getText()))
            {
                UI.put("OptionPane.messageForeground",new ColorUIResource(35,194,130));
                JOptionPane.showMessageDialog (null, "SHA1 Hash Matches.", "SHA1 Verification", JOptionPane.INFORMATION_MESSAGE);
                
            }
            else 
            {
                UI.put("OptionPane.messageForeground", Color.red);
                JOptionPane.showMessageDialog (null, "SHA1 Hash didn't match.", "SHA1 Verification", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //SHA256 selection handling
        else if(jComboBox1.getSelectedItem().equals("SHA256"))
        {
            if(SHA256textField.getText().equals(jTextField3.getText()))
            {
                UI.put("OptionPane.messageForeground",new ColorUIResource(35,194,130));
                JOptionPane.showMessageDialog (null, "SHA256 Hash Matches.", "SHA256 Verification", JOptionPane.INFORMATION_MESSAGE);
                
            }
            else 
            {
                UI.put("OptionPane.messageForeground", Color.red);
                JOptionPane.showMessageDialog (null, "SHA256 Hash didn't match.", "SHA256 Verification", JOptionPane.ERROR_MESSAGE);    
            }
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed
    String md5Copy;
    String sha1DigestCopy;
    String Sha256DigestCopy;
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new generatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SHA1textField;
    private javax.swing.JTextField SHA256textField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
