/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package br.com.unesp.uml_converter.presentation;

import br.com.unesp.uml_converter.models.BaseAttr;
import br.com.unesp.uml_converter.models.BaseClass;
import br.com.unesp.uml_converter.models.BaseProject;
import br.com.unesp.uml_converter.models.BaseRelationship;
import br.com.unesp.uml_converter.utils.ArquivoUtils;
import br.com.unesp.uml_converter.utils.GsonUtils;
import br.com.unesp.uml_converter.utils.UmlUtils;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class UmlConverter extends javax.swing.JFrame {

    BaseProject project;

    /** Creates new form UmlConverter */
    public UmlConverter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelProjectTitle = new javax.swing.JLabel();
        jLabelProjectField = new javax.swing.JLabel();
        jLabelObjectsTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListObjects = new javax.swing.JList<>();
        jButtonRemoveObjects = new javax.swing.JButton();
        jButtonAddObjects = new javax.swing.JButton();
        jLabelAttributesTitle = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListAttributes = new javax.swing.JList<>();
        jButtonRemoveAttribute = new javax.swing.JButton();
        jButtonAddAttribute = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemNewProject = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuImport = new javax.swing.JMenu();
        jMenuItemImportJson = new javax.swing.JMenuItem();
        jMenuExport = new javax.swing.JMenu();
        jMenuItemExportJson = new javax.swing.JMenuItem();
        jMenuItemExportUml = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Project"));

        jLabelProjectTitle.setText("Project name:");

        jLabelObjectsTitle.setText("Objects:");

        jScrollPane1.setViewportView(jListObjects);

        jButtonRemoveObjects.setText("-");
        jButtonRemoveObjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveObjectsActionPerformed(evt);
            }
        });

        jButtonAddObjects.setText("+");
        jButtonAddObjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddObjectsActionPerformed(evt);
            }
        });

        jLabelAttributesTitle.setText("Attributes:");

        jListAttributes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(jListAttributes);

        jButtonRemoveAttribute.setText("-");
        jButtonRemoveAttribute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveAttributeActionPerformed(evt);
            }
        });

        jButtonAddAttribute.setText("+");
        jButtonAddAttribute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAttributeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText(">");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabelProjectField, javax.swing.GroupLayout.PREFERRED_SIZE, 103,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(257, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelProjectTitle)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabelObjectsTitle,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 68,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jButtonRemoveObjects)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jButtonAddObjects))
                                                                .addComponent(jScrollPane1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(35, 35, 35)
                                                        .addComponent(jLabel6)
                                                        .addGap(48, 48, 48)
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jButtonRemoveAttribute)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jButtonAddAttribute))
                                                                .addComponent(jScrollPane3,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 244,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabelAttributesTitle,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(24, 24, 24))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelProjectField, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(251, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabelProjectTitle)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabelObjectsTitle)
                                                .addComponent(jLabelAttributesTitle))
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jScrollPane3,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 160,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jScrollPane1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 160,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(72, 72, 72)
                                                        .addComponent(jLabel6)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButtonAddObjects)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButtonRemoveAttribute)
                                                        .addComponent(jButtonAddAttribute))
                                                .addComponent(jButtonRemoveObjects))
                                        .addContainerGap(26, Short.MAX_VALUE))));

        jMenu1.setText("File");

        jMenuItemNewProject.setText("New Project...");
        jMenuItemNewProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewProjectActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNewProject);
        jMenu1.add(jSeparator1);

        jMenuImport.setText("Import");

        jMenuItemImportJson.setText("From Json...");
        jMenuItemImportJson.setActionCommand("Import Project (.json)");
        jMenuItemImportJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemImportJsonActionPerformed(evt);
            }
        });
        jMenuImport.add(jMenuItemImportJson);

        jMenu1.add(jMenuImport);

        jMenuExport.setText("Export");

        jMenuItemExportJson.setText("To Json...");
        jMenuItemExportJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExportJsonActionPerformed(evt);
            }
        });
        jMenuExport.add(jMenuItemExportJson);

        jMenuItemExportUml.setText("To UML...");
        jMenuItemExportUml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExportUmlActionPerformed(evt);
            }
        });
        jMenuExport.add(jMenuItemExportUml);

        jMenu1.add(jMenuExport);
        jMenu1.add(jSeparator2);

        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemImportJsonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemImportJsonActionPerformed

        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        // restrict the user to select files of all types
        j.setAcceptAllFileFilterUsed(false);

        // set a title for the dialog
        j.setDialogTitle("Select a .json file");

        // only allow files of .txt extension
        FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .json files", "json");
        j.addChoosableFileFilter(restrict);

        // invoke the showsOpenDialog function to show the save dialog
        int r = j.showOpenDialog(null);

        // if the user selects a file
        if (r == JFileChooser.APPROVE_OPTION) {
            // set the label to the path of the selected file
            String json = ArquivoUtils.leitura(j.getSelectedFile().getAbsolutePath());

            project = (BaseProject) GsonUtils.xmlToObjeto(json, BaseProject.class);
            setObjectsList();
            jLabelProjectField.setText(project.getProjectName());

        }

    }// GEN-LAST:event_jMenuItemImportJsonActionPerformed

    private void jButtonAddObjectsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAddObjectsActionPerformed

        BaseClass newObject = new BaseClass();

        newObject.setObjectName(setNameOptionPane("Input object name"));

        if (!newObject.getObjectName().isEmpty()) {
            project.addObject(newObject);
            setObjectsList();
        }

    }// GEN-LAST:event_jButtonAddObjectsActionPerformed

    private void jMenuItemExportJsonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemExportJsonActionPerformed
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int r = j.showSaveDialog(null);

        StringBuilder fileName = new StringBuilder();
        fileName.append(project.getProjectName());
        fileName.append(".json");

        if (r == JFileChooser.APPROVE_OPTION) {
            ArquivoUtils.salvar(j.getSelectedFile().getAbsolutePath() + "/", fileName.toString(),
                    GsonUtils.objetoToXML(project));
        }

    }// GEN-LAST:event_jMenuItemExportJsonActionPerformed

    private void jMenuItemNewProjectActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemNewProjectActionPerformed

        String projectName = JOptionPane.showInputDialog("Input the project name");

        if (projectName != null) {
            DefaultListModel<String> model = new DefaultListModel<String>();
            project = new BaseProject();
            project.setProjectName(projectName);
            jListAttributes.setModel(model);
            jListObjects.setModel(model);
            jLabelProjectField.setText(project.getProjectName());
        }

    }// GEN-LAST:event_jMenuItemNewProjectActionPerformed

    private void jButtonAddAttributeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAddAttributeActionPerformed

        Boolean hasSelectedObject = !jListObjects.isSelectionEmpty();

        BaseAttr newAttribute = new BaseAttr();

        String[] modifiers = { "private", "protected", "public" };
        String[] types = { "String", "byte", "short", "int", "long", "float", "double", "boolean", "char" };

        if (hasSelectedObject) {
            newAttribute.setModifier(setOptionPaneAttr("Select the modifier", modifiers));
            newAttribute.setType(setOptionPaneAttr("Select the type", types));
            newAttribute.setName(setNameOptionPane("Input variable name"));

            if (!newAttribute.getModifier().isEmpty() || !newAttribute.getType().isEmpty()
                    || !newAttribute.getName().isEmpty()) {
                project.getObjects().get(jListObjects.getSelectedIndex()).addAttribute(newAttribute);
                setAttributesList();
            }
        }

    }// GEN-LAST:event_jButtonAddAttributeActionPerformed

    private void jButtonRemoveObjectsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonRemoveObjectsActionPerformed

        Boolean hasSelectedObject = !jListObjects.isSelectionEmpty();

        if (hasSelectedObject) {
            project.getObjects().remove(jListObjects.getSelectedIndex());
            setObjectsList();
            jListObjects.setSelectedIndex(jListObjects.getFirstVisibleIndex());
        }
    }// GEN-LAST:event_jButtonRemoveObjectsActionPerformed

    private void jButtonRemoveAttributeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonRemoveAttributeActionPerformed

        Boolean hasSelectedAttribute = !jListAttributes.isSelectionEmpty();

        if (hasSelectedAttribute) {
            project.getObjects().get(jListObjects.getSelectedIndex()).getAttributes()
                    .remove(jListAttributes.getSelectedIndex());
            setObjectsList();
            jListObjects.setSelectedIndex(jListObjects.getFirstVisibleIndex());
        }
    }// GEN-LAST:event_jButtonRemoveAttributeActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemExitActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }// GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemExportUmlActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemExportUmlActionPerformed

        setRelationship();

        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int r = j.showSaveDialog(null);

        StringBuilder fileName = new StringBuilder();
        fileName.append(project.getProjectName());
        fileName.append(".puml");

        if (r == JFileChooser.APPROVE_OPTION) {
            ArquivoUtils.salvar(j.getSelectedFile().getAbsolutePath() + "/", fileName.toString(),
                    UmlUtils.projectToUML(project));
        }
    }// GEN-LAST:event_jMenuItemExportUmlActionPerformed

    private void setRelationship() {

        BaseRelationship r;
        int reply;

        do {

            reply = JOptionPane.showConfirmDialog(null, "Add relation and multiplicity?", "relation",
                    JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                r = new BaseRelationship();

                String multiplicity[] = { "1", "1..*", "none" };

                List<String> objects = project.getObjects().stream().map(it -> it.getObjectName())
                        .collect(Collectors.toList());
                String obj1 = setOptionPaneAttr("Select the object 1", objects.stream().toArray(String[]::new));
                String multiplicityObj1 = setOptionPaneAttr("Select the multiplicity obj1:", multiplicity);

                String obj2 = setOptionPaneAttr("Select the object 2", objects.stream().toArray(String[]::new));
                String multiplicityObj2 = setOptionPaneAttr("Select the multiplicity obj2:", multiplicity);

                r.setObject1(obj1);
                r.setObject2(obj2);
                r.setMultiplicity1(multiplicityObj1);
                r.setMultiplicity2(multiplicityObj2);

                String relationship[] = { "inheritance", "composition", "agregation", "none" };
                String relationObj = setOptionPaneAttr("Select the relationship obj1 -> obj2", relationship);

                r.setRelation(relationObj);

                project.getRelationships().add(r);
            }

        } while (reply == JOptionPane.YES_OPTION);

    }

    private String setOptionPaneAttr(String title, String options[]) {

        Object selected = JOptionPane.showInputDialog(null, title, "Selection", JOptionPane.DEFAULT_OPTION, null,
                options, "0");
        if (selected != null) {
            return selected.toString();
        } else {
            System.out.println("User cancelled");
        }

        return "";
    }

    private String setNameOptionPane(String title) {
        return JOptionPane.showInputDialog(title);
    }

    private void setObjectsList() {
        DefaultListModel<String> listModel = new DefaultListModel<String>();

        List<String> objectNames = project.getObjects().stream().map(it -> it.getObjectName())
                .collect(Collectors.toList());
        listModel.addAll(objectNames);
        jListObjects.setModel(listModel);

        jListObjects.addListSelectionListener((ListSelectionEvent e) -> {
            setAttributesList();
        });
    }

    private void setAttributesList() {
        int selectedItem = jListObjects.getSelectedIndex();
        if (selectedItem != -1) {
            if (!(project.getObjects().get(selectedItem).getAttributes() == null)) {
                DefaultListModel<String> listModel2 = new DefaultListModel<String>();
                List<String> attributes = project.getObjects().get(jListObjects.getSelectedIndex()).getAttributes()
                        .stream().map(it -> it.toString()).collect(Collectors.toList());
                listModel2.addAll(attributes);
                jListAttributes.setModel(listModel2);
            } else {
                jListAttributes.setModel(new DefaultListModel<>());
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UmlConverter.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UmlConverter.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UmlConverter.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UmlConverter.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                UmlConverter frame = new UmlConverter();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddAttribute;
    private javax.swing.JButton jButtonAddObjects;
    private javax.swing.JButton jButtonRemoveAttribute;
    private javax.swing.JButton jButtonRemoveObjects;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAttributesTitle;
    private javax.swing.JLabel jLabelObjectsTitle;
    private javax.swing.JLabel jLabelProjectField;
    private javax.swing.JLabel jLabelProjectTitle;
    private javax.swing.JList<String> jListAttributes;
    private javax.swing.JList<String> jListObjects;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuExport;
    private javax.swing.JMenu jMenuImport;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemExportJson;
    private javax.swing.JMenuItem jMenuItemExportUml;
    private javax.swing.JMenuItem jMenuItemImportJson;
    private javax.swing.JMenuItem jMenuItemNewProject;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables

}