
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;

public class MyNotepad extends javax.swing.JFrame {

    String filename = "Untitled";
    Clipboard clipboard = getToolkit().getSystemClipboard();
    boolean saved = false;
    Properties prop;
    FindDialog dialog = null;

    public MyNotepad() {
        initComponents();
        setTitle(filename + " - Notepad");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea = new java.awt.TextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jFileMenu = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenuItem();
        openMenu = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();
        saveAsMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        jEditMenu = new javax.swing.JMenu();
        cutMenu = new javax.swing.JMenuItem();
        copyMenu = new javax.swing.JMenuItem();
        pasteMenu = new javax.swing.JMenuItem();
        selectAllMenu = new javax.swing.JMenuItem();
        deleteMenu = new javax.swing.JMenuItem();
        findMenu = new javax.swing.JMenuItem();
        findNextMenu = new javax.swing.JMenuItem();
        replaceMenu = new javax.swing.JMenuItem();
        jFormatMenu = new javax.swing.JMenu();
        fontMenu = new javax.swing.JMenuItem();
        setFontColorMenu = new javax.swing.JMenuItem();
        setPadColorMenu = new javax.swing.JMenuItem();
        jViewMenu = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jHelpMenu = new javax.swing.JMenu();
        aboutMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textAreaTextValueChanged(evt);
            }
        });
        textArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textAreaKeyReleased(evt);
            }
        });

        jFileMenu.setText("File     ");
        jFileMenu.setMnemonic(KeyEvent.VK_F);

        newMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newMenu.setText("New");
        newMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuActionPerformed(evt);
            }
        });
        jFileMenu.add(newMenu);

        openMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenu.setText("Open...");
        openMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuActionPerformed(evt);
            }
        });
        jFileMenu.add(openMenu);

        saveMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenu.setText("Save");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        jFileMenu.add(saveMenu);

        saveAsMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAsMenu.setText("Save As...");
        saveAsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuActionPerformed(evt);
            }
        });
        jFileMenu.add(saveAsMenu);

        exitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        jFileMenu.add(exitMenu);

        jMenuBar1.add(jFileMenu);

        jEditMenu.setText("Edit     ");
        jEditMenu.setMnemonic(KeyEvent.VK_E);

        cutMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutMenu.setText("Cut");
        cutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuActionPerformed(evt);
            }
        });
        jEditMenu.add(cutMenu);

        copyMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyMenu.setText("Copy");
        copyMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuActionPerformed(evt);
            }
        });
        jEditMenu.add(copyMenu);

        pasteMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasteMenu.setText("Paste");
        pasteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuActionPerformed(evt);
            }
        });
        jEditMenu.add(pasteMenu);

        selectAllMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        selectAllMenu.setText("Select All");
        selectAllMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllMenuActionPerformed(evt);
            }
        });
        jEditMenu.add(selectAllMenu);

        deleteMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        deleteMenu.setText("Delete");
        deleteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuActionPerformed(evt);
            }
        });
        jEditMenu.add(deleteMenu);

        findMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        findMenu.setText("Find...");
        findMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findMenuActionPerformed(evt);
            }
        });
        jEditMenu.add(findMenu);

        findNextMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        findNextMenu.setText("Find Next");
        findNextMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findNextMenuActionPerformed(evt);
            }
        });
        jEditMenu.add(findNextMenu);

        replaceMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        replaceMenu.setText("Replace...");
        replaceMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceMenuActionPerformed(evt);
            }
        });
        jEditMenu.add(replaceMenu);

        jMenuBar1.add(jEditMenu);

        jFormatMenu.setText("Format     ");
        jFormatMenu.setMnemonic(KeyEvent.VK_O);

        fontMenu.setText("Font...");
        fontMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontMenuActionPerformed(evt);
            }
        });
        jFormatMenu.add(fontMenu);

        setFontColorMenu.setText("Set Font Color...");
        setFontColorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setFontColorMenuActionPerformed(evt);
            }
        });
        jFormatMenu.add(setFontColorMenu);

        setPadColorMenu.setText("Set Pad Color...");
        setPadColorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPadColorMenuActionPerformed(evt);
            }
        });
        jFormatMenu.add(setPadColorMenu);

        jMenuBar1.add(jFormatMenu);

        jViewMenu.setText("View     ");
        jViewMenu.setMnemonic(KeyEvent.VK_V);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Status Bar");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jViewMenu.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jViewMenu);

        jHelpMenu.setText("Help     ");
        jHelpMenu.setMnemonic(KeyEvent.VK_H);

        aboutMenu.setText("About");
        aboutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuActionPerformed(evt);
            }
        });
        jHelpMenu.add(aboutMenu);

        jMenuBar1.add(jHelpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveAsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuActionPerformed

        FileDialog fileDialog = new FileDialog(MyNotepad.this, "Save File", FileDialog.SAVE);
        fileDialog.setVisible(true);

        if (fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename + " - Notepad");
            saved = true;
        }
        try {
            FileWriter fw = new FileWriter(filename+".txt");
            fw.write(textArea.getText());
            fw.close();
//            FileWriter fwProp = new FileWriter(filename + ".properties");
//            setPropertiesToFile();
//            prop.store(fwProp, "prop");
            setTitle(filename + " - Notepad");

        } catch (IOException ex) {
            System.out.println("File Not Found");
            Logger.getLogger(MyNotepad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveAsMenuActionPerformed

    private void newMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuActionPerformed
        textArea.setText("   ");
        filename = "Untitled";
        setTitle(filename + " - Notepad");
        saved = false;
        textArea.setBackground(Color.WHITE);
        textArea.setForeground(Color.BLACK);

    }//GEN-LAST:event_newMenuActionPerformed

    private void openMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuActionPerformed
        FileDialog fileDialog = new FileDialog(MyNotepad.this, "Open File", FileDialog.LOAD);
        fileDialog.setVisible(true);

        if (fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename + " - Notepad");
        }
        try {
            BufferedReader bf = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = bf.readLine()) != null) {
                sb.append(line + "\n");
            }
            textArea.setText(sb.toString());
//            prop = new Properties();
//            ClassLoader loader = Thread.currentThread().getContextClassLoader();
//            InputStream stream = loader.getResourceAsStream("/"+filename+".properties");
//            prop.load(stream);
//            setPropertiesToPad();

        } catch (IOException io) {
            System.out.println("File Not Found");
        }

    }//GEN-LAST:event_openMenuActionPerformed

    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
        if (!saved) {
            FileDialog fileDialog = new FileDialog(MyNotepad.this, "Save File", FileDialog.SAVE);
            fileDialog.setVisible(true);

            if (fileDialog.getFile() != null) {
                filename = fileDialog.getDirectory() + fileDialog.getFile();
                setTitle(filename + " - Notepad");
                saved = true;
            }
        }
        try {
            FileWriter fw = new FileWriter(filename+".txt");
            fw.write(textArea.getText());
//            setPropertiesToFile();
//            prop.store(fw,"prop");
            setTitle(filename + " - Notepad");
            fw.close();

        } catch (IOException ex) {
            System.out.println("File Not Found");
            Logger.getLogger(MyNotepad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveMenuActionPerformed

    private void textAreaTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textAreaTextValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_textAreaTextValueChanged

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuActionPerformed

    private void cutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuActionPerformed
        String cutString = textArea.getSelectedText();
        StringSelection cutSelection = new StringSelection(cutString);
        clipboard.setContents(cutSelection, cutSelection);
        textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
    }//GEN-LAST:event_cutMenuActionPerformed

    private void copyMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuActionPerformed
        String copyString = textArea.getSelectedText();
        StringSelection copySelection = new StringSelection(copyString);
        clipboard.setContents(copySelection, copySelection);

    }//GEN-LAST:event_copyMenuActionPerformed

    private void pasteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuActionPerformed

        try {
            Transferable pasteText = clipboard.getContents(MyNotepad.this);
            String pasteString = (String) pasteText.getTransferData(DataFlavor.stringFlavor);
            textArea.replaceRange(pasteString, textArea.getSelectionStart(), textArea.getSelectionEnd());
        } catch (Exception e) {
            System.out.println("Didn't work");
        }

    }//GEN-LAST:event_pasteMenuActionPerformed

    private void selectAllMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllMenuActionPerformed
        textArea.selectAll();
    }//GEN-LAST:event_selectAllMenuActionPerformed

    private void deleteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuActionPerformed
        textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());

    }//GEN-LAST:event_deleteMenuActionPerformed

    private void aboutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuActionPerformed
        AboutDialog dialog = new AboutDialog(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        dialog.setVisible(true);    }//GEN-LAST:event_aboutMenuActionPerformed

    private void setFontColorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setFontColorMenuActionPerformed
        Color c = JColorChooser.showDialog(this, "Choose", textArea.getForeground());
        textArea.setForeground(c);
    }//GEN-LAST:event_setFontColorMenuActionPerformed

    private void fontMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontMenuActionPerformed
        FontChooser fontChooser = new FontChooser(textArea.getFont());
        if (fontChooser.showDialog(this, "Choose a font")) {
            this.textArea.setFont(fontChooser.createFont());
        }

    }//GEN-LAST:event_fontMenuActionPerformed

    private void setPadColorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPadColorMenuActionPerformed
        Color c = JColorChooser.showDialog(this, "Choose", textArea.getBackground());
        textArea.setBackground(c);
    }//GEN-LAST:event_setPadColorMenuActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:    
       System.out.println( textArea.getColumns()+"\n"+
        textArea.getSelectionStart()+"\n"+
        textArea.getSelectionEnd()+"\n"+textArea.getRows());
       
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void findMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findMenuActionPerformed
            
            if (dialog == null) {
                    dialog = new FindDialog(textArea);
                }
            dialog.showDialog(this, true); 
    }//GEN-LAST:event_findMenuActionPerformed

    private void replaceMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceMenuActionPerformed
          //dialog = null;
            if (dialog == null) {
                    dialog = new FindDialog(textArea);
                }
            dialog.showDialog(this, false); 
    }//GEN-LAST:event_replaceMenuActionPerformed

    private void findNextMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findNextMenuActionPerformed
        // TODO add your handling code here:
        dialog.findNextWithSelection();
        
    }//GEN-LAST:event_findNextMenuActionPerformed

    private void textAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        { textArea.append("\n");
        }
    }//GEN-LAST:event_textAreaKeyReleased

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
            java.util.logging.Logger.getLogger(MyNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyNotepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenu;
    private javax.swing.JMenuItem copyMenu;
    private javax.swing.JMenuItem cutMenu;
    private javax.swing.JMenuItem deleteMenu;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenuItem findMenu;
    private javax.swing.JMenuItem findNextMenu;
    private javax.swing.JMenuItem fontMenu;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jEditMenu;
    private javax.swing.JMenu jFileMenu;
    private javax.swing.JMenu jFormatMenu;
    private javax.swing.JMenu jHelpMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jViewMenu;
    private javax.swing.JMenuItem newMenu;
    private javax.swing.JMenuItem openMenu;
    private javax.swing.JMenuItem pasteMenu;
    private javax.swing.JMenuItem replaceMenu;
    private javax.swing.JMenuItem saveAsMenu;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JMenuItem selectAllMenu;
    private javax.swing.JMenuItem setFontColorMenu;
    private javax.swing.JMenuItem setPadColorMenu;
    private java.awt.TextArea textArea;
    // End of variables declaration//GEN-END:variables

    private void setPropertiesToFile() {
        prop = new Properties();
        prop.setProperty("tFontsize", Integer.toString(textArea.getFont().getSize()));
        prop.setProperty("tFontFamily", textArea.getFont().getFamily());
        prop.setProperty("tFontStyle", Integer.toString(textArea.getFont().getStyle()));
        prop.setProperty("tFontcolor", Integer.toString(textArea.getForeground().getRGB()));
        prop.setProperty("tPadColor", Integer.toString(textArea.getBackground().getRGB()));
        // System.out.println("")
    }

    private void setPropertiesToPad() {
        String sSize = prop.getProperty("tFontsize");
        String sName = prop.getProperty("tFontFamily");
        String sStyle = prop.getProperty("tFontStyle");
        String sFontColor = prop.getProperty("tFontcolor");
        String sPadCOlor = prop.getProperty("tPadcolor");
        Color c1 = new Color(Integer.parseInt(sFontColor));
        Color c2 = new Color(Integer.parseInt(sPadCOlor));
        textArea.setForeground(c1);
        textArea.setBackground(c2);
        Font f = new Font(sName, Integer.parseInt(sStyle), Integer.parseInt(sSize));
        textArea.setFont(f);
    }

}
