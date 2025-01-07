/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.OES.Components;

import com.OES.Util.Mono;
import com.OES.Util.Archivo;
import com.OES.Util.Abel;
import com.formdev.flatlaf.FlatLightLaf;
import com.OES.DBConn.DBConnection;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author itsth
 */
public class AddQuestion extends javax.swing.JFrame {

    private String quizCode;
    private DefaultTableModel tableModel;
    
    public AddQuestion() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jLabel1.setFont(Archivo.getFont(18));
        jLabel2.setFont(Abel.getFont(13));
        jLabel3.setFont(Abel.getFont(13));
        jLabel4.setFont(Abel.getFont(13));
        lf.setFont(Archivo.getFont(11));
        setLocationRelativeTo(null);
    }
    
    public AddQuestion(String quizCode, String quizName) {

        
        this.quizCode = quizCode;
        setLocationRelativeTo(null);
        // Ensure GUI builder's initialization method is called
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jLabel1.setFont(Archivo.getFont(18));
        jLabel2.setFont(Abel.getFont(13));
        jLabel3.setFont(Abel.getFont(13));
        jLabel4.setFont(Abel.getFont(13));
        jLabel5.setFont(Abel.getFont(13));
        jLabel6.setFont(Abel.getFont(13));
        jLabel7.setFont(Abel.getFont(13));
        jLabel8.setFont(Abel.getFont(13));
        jLabel9.setFont(Abel.getFont(13));
        option1RadioButton.setFont(Abel.getFont(11));
        option2RadioButton.setFont(Abel.getFont(11));
        option3RadioButton.setFont(Abel.getFont(11));
        option4RadioButton.setFont(Abel.getFont(11));
        addQuestionButton.setFont(Archivo.getFont(10));
        clearButton.setFont(Abel.getFont(10));
        lf.setFont(Archivo.getFont(11));
        qCode.setText(quizCode);
        qCode.setFont(Mono.getFont(11));
        qName.setText(quizName);
        qName.setFont(Mono.getFont(11));

        ButtonGroup group = new ButtonGroup();
        group.add(option1RadioButton);
        group.add(option2RadioButton);
        group.add(option3RadioButton);
        group.add(option4RadioButton);
        
        
        questionField.setFont(Mono.getFont(11));
        option1Field.setFont(Mono.getFont(11));
        option2Field.setFont(Mono.getFont(11));
        option3Field.setFont(Mono.getFont(11));
        option4Field.setFont(Mono.getFont(11));
        
        setVisible(true);
        
        
        // Table of Questions
        
        DefaultTableModel tableModel = new DefaultTableModel(new String[]{"Question ID", "Question Text", "Option A", "Option B", "Option C", "Option D", "Correct Option"}, 0);
        questionTable.setModel(tableModel);
        JTableHeader tableHeader = questionTable.getTableHeader();
        tableHeader.setFont(Archivo.getFont(11));
        tableModel = (DefaultTableModel) questionTable.getModel();
        tableModel.setRowCount(0);
        
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < questionTable.getColumnCount(); i++) {
            questionTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        questionTable.setFont(Mono.getFont(12));
        loadQuestionTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        qCode = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        qName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        questionField = new javax.swing.JTextField();
        option1Field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        option2Field = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        option3Field = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        option4Field = new javax.swing.JTextField();
        addQuestionButton = new javax.swing.JButton();
        option4RadioButton = new javax.swing.JRadioButton();
        option3RadioButton = new javax.swing.JRadioButton();
        option2RadioButton = new javax.swing.JRadioButton();
        option1RadioButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        lf = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quiz7 >> Add Questions");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD QUESTIONS");

        jLabel2.setText("Quiz Code");

        qCode.setText("{code}");

        jLabel3.setText("Quiz Name");

        qName.setText("{name}");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel5.setText("Question");

        jLabel6.setText("Option 1");

        jLabel7.setText("Option 2");

        jLabel8.setText("Option 3");

        jLabel9.setText("Option 4");

        addQuestionButton.setBackground(new java.awt.Color(51, 153, 255));
        addQuestionButton.setForeground(new java.awt.Color(255, 255, 255));
        addQuestionButton.setText("Add Question");
        addQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuestionButtonActionPerformed(evt);
            }
        });

        option4RadioButton.setText("Option 4");

        option3RadioButton.setText("Option 3");

        option2RadioButton.setText("Option 2");

        option1RadioButton.setText("Option 1");

        jLabel4.setText("Correct Option");

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        lf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lf.setForeground(new java.awt.Color(255, 51, 51));
        lf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(questionField)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(option1RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(option2RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(option3RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(option4RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(addQuestionButton))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(option1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(option3Field, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(option2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(option4Field, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(11, 11, 11)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(questionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(option2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(option3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(option4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option1RadioButton)
                    .addComponent(option2RadioButton)
                    .addComponent(option3RadioButton)
                    .addComponent(option4RadioButton)
                    .addComponent(addQuestionButton)
                    .addComponent(clearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        questionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(questionTable);

        jButton1.setText("Delete Question");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qCode, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(qCode)
                    .addComponent(jLabel3)
                    .addComponent(qName))
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuestionButtonActionPerformed
        // TODO add your handling code here:
        loadQuestionTable();
        addQuestion();
    }//GEN-LAST:event_addQuestionButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        deleteQuestion();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteQuestion() {
        DefaultTableModel tableModel = (DefaultTableModel) questionTable.getModel();

        // Ensure there is a model attached to the table
        if (tableModel == null) {
        // JOptionPane.showMessageDialog(this, "Table model is not initialized!");
            lf.setText("\" Table model is not initialized! \"");
            return;
        }

        // Check if a row is selected
        int selectedRow = questionTable.getSelectedRow();
        if (selectedRow == -1) {
            lf.setText("Please select a user to delete!");
            return;
        }

        // Retrieve the current user details
        String questionIdString = (String) tableModel.getValueAt(selectedRow, 0); // Retrieve as String
        int questionId = Integer.parseInt(questionIdString); // Convert it to Integer       
        
        // Confirmation popup with custom font
        JLabel confirmationLabel = new JLabel("Are you sure you want to delete the question?");
        confirmationLabel.setFont(Archivo.getFont(12));
        int result = JOptionPane.showConfirmDialog(
                this,
                confirmationLabel,
                "Quiz7 >> Delete Question",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        // If user confirms deletion
        if (result == JOptionPane.YES_OPTION) {
            try (Connection conn = DBConnection.getConnection()) {
                // Delete query
                String query = "DELETE FROM questions WHERE question_id = ?";
                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                    stmt.setInt(1, questionId);
                    stmt.executeUpdate();
                }

                // Remove row from the table
                tableModel.removeRow(selectedRow);

                // Show success message
                JLabel successLabel = new JLabel("Question deleted successfully!");
                successLabel.setFont(Archivo.getFont(12));
                JOptionPane.showMessageDialog(this, successLabel, "Quiz7 >> Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                ex.printStackTrace();
                JLabel errorLabel = new JLabel("Error deleting user: " + ex.getMessage());
                errorLabel.setFont(Archivo.getFont(12));
                JOptionPane.showMessageDialog(this, errorLabel, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void loadQuestionTable() {
    // Ensure the DefaultTableModel is linked to the JTable
        DefaultTableModel tableModel = (DefaultTableModel) questionTable.getModel();

        // Clear existing rows in the table
        tableModel.setRowCount(0);

        // Load data from the database
        try (Connection conn = DBConnection.getConnection()) {
            // Query to fetch question data along with the options and correct answer
            String query = "SELECT question_id, question_text, option_a, option_b, option_c, option_d, correct_option FROM questions WHERE quiz_code = ?";

            // Use a PreparedStatement to fetch questions for a specific quiz (using quiz_code)
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, quizCode);  // Pass the quizCode (from your context, for example)
                ResultSet rs = stmt.executeQuery();

                // Iterate through the ResultSet and add rows to the table model
                while (rs.next()) {
                    String questionId = rs.getString("question_id");
                    String questionText = rs.getString("question_text");
                    String optionA = rs.getString("option_a");
                    String optionB = rs.getString("option_b");
                    String optionC = rs.getString("option_c");
                    String optionD = rs.getString("option_d");
                    String correctOption = rs.getString("correct_option");

                    // Add the row to the table model
                    tableModel.addRow(new Object[]{questionId, questionText, optionA, optionB, optionC, optionD, correctOption});
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading data into the question table!");
        }
    }

    
    private void addQuestion() {
        String questionText = questionField.getText().trim();
        String optionA = option1Field.getText().trim();
        String optionB = option2Field.getText().trim();
        String optionC = option3Field.getText().trim();
        String optionD = option4Field.getText().trim();
        String correctOption = "";

        // Check which radio button is selected
        if (option1RadioButton.isSelected()) {
            correctOption = "1";
        } else if (option2RadioButton.isSelected()) {
            correctOption = "2";
        } else if (option3RadioButton.isSelected()) {
            correctOption = "3";
        } else if (option4RadioButton.isSelected()) {
            correctOption = "4";
        }

        if (questionText.isEmpty() || optionA.isEmpty() || optionB.isEmpty() || optionC.isEmpty() || optionD.isEmpty() || correctOption.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.WARNING_MESSAGE);
            lf.setText("\" All fields are required! \"");
            return;
        }

        try (Connection conn = DBConnection.getConnection()) {
            String query = "INSERT INTO questions (quiz_code, question_text, option_a, option_b, option_c, option_d, correct_option) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, quizCode);
                stmt.setString(2, questionText);
                stmt.setString(3, optionA);
                stmt.setString(4, optionB);
                stmt.setString(5, optionC);
                stmt.setString(6, optionD);
                stmt.setString(7, correctOption);
                stmt.executeUpdate();
            }

            // Refresh the table
            loadQuestionTable();
            clearFields();
            lf.setText("\" Question added successfully! \"");
            loadQuestionTable();
        } catch (Exception ex) {
            ex.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Error adding question: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public void clearFields() {
    // Clear all text fields
        questionField.setText("");    // Clear question text field
        option1Field.setText("");     // Clear option A field
        option2Field.setText("");     // Clear option B field
        option3Field.setText("");     // Clear option C field
        option4Field.setText("");     // Clear option D field

        // Reset the radio buttons if you are using them to select the correct option
        option1RadioButton.setSelected(false);
        option2RadioButton.setSelected(false);
        option3RadioButton.setSelected(false);
        option4RadioButton.setSelected(false);

        // Reset any other fields as needed (e.g., quizCode, etc.)
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addQuestionButton;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lf;
    private javax.swing.JTextField option1Field;
    private javax.swing.JRadioButton option1RadioButton;
    private javax.swing.JTextField option2Field;
    private javax.swing.JRadioButton option2RadioButton;
    private javax.swing.JTextField option3Field;
    private javax.swing.JRadioButton option3RadioButton;
    private javax.swing.JTextField option4Field;
    private javax.swing.JRadioButton option4RadioButton;
    private javax.swing.JLabel qCode;
    private javax.swing.JLabel qName;
    private javax.swing.JTextField questionField;
    private javax.swing.JTable questionTable;
    // End of variables declaration//GEN-END:variables
}
