/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.OES.Components;

import com.OES.Util.Mono;
import com.OES.Util.Archivo;
import com.OES.Util.Abel;
import com.OES.DBConn.DBConnection;
import com.OES.Main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author itsth
 */
public class Question extends javax.swing.JDialog {
    public static String qCode;
    public static int qNumber = 0;
    private int currentQuestionIndex = 0;
    private String ans = "";
    private String ansCorrect = "";
    private ResultSet resultSet;
    private int questionId = 0;
    public static int correctCounter = 0;
    private int falseCounter = 0;

    public Question(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public Question(String qCode) {
        this.qCode = qCode;
        setLocationRelativeTo(null);
        initComponents();
        buttonGroup1.add(option1);
        buttonGroup1.add(option2);
        buttonGroup1.add(option3);
        buttonGroup1.add(option4);
        fetchQuestions(qCode);
        insertResult(qCode, Main.userID, correctCounter, falseCounter);
        getQuizData(qCode);
        jLabel3.setFont(Archivo.getFont(18));
        quizNameLbl.setFont(Archivo.getFont(14));
        quizDescLbl.setFont(Abel.getFont(12));
        questionLbl.setFont(Mono.getFont(13));
        questionNoLbl.setFont(Mono.getFont(15));
        option1.setFont(Mono.getFont(12));
        option2.setFont(Mono.getFont(12));
        option3.setFont(Mono.getFont(12));
        option4.setFont(Mono.getFont(12));
        nextButton.setFont(Archivo.getFont(10));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        quizNameLbl = new javax.swing.JLabel();
        quizDescLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        questionNoLbl = new javax.swing.JLabel();
        questionLbl = new javax.swing.JLabel();
        option1 = new javax.swing.JRadioButton();
        option2 = new javax.swing.JRadioButton();
        option3 = new javax.swing.JRadioButton();
        option4 = new javax.swing.JRadioButton();
        nextButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        quizNameLbl.setText("QUIZ NAME");

        quizDescLbl.setText("QUIZ DESCRIPTION");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("QUIZ");

        questionNoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionNoLbl.setText("00");

        questionLbl.setText("Hello World");

        option1.setText("jRadioButton1");

        option2.setText("jRadioButton2");

        option3.setText("jRadioButton3");

        option4.setText("jRadioButton4");

        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(questionNoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(questionLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(option1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                                    .addComponent(option2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(option3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(option4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(quizNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 472, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quizDescLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quizNameLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quizDescLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionNoLbl)
                    .addComponent(questionLbl))
                .addGap(18, 18, 18)
                .addComponent(option1)
                .addGap(18, 18, 18)
                .addComponent(option2)
                .addGap(18, 18, 18)
                .addComponent(option3)
                .addGap(18, 18, 18)
                .addComponent(option4)
                .addGap(18, 18, 18)
                .addComponent(nextButton)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fetchQuestions(String quizCode) {
        String query = "SELECT question_id, question_text, option_a, option_b, option_c, option_d, correct_option FROM questions WHERE quiz_code = ?";

        try {
            if (resultSet == null) { // Initialize only if ResultSet is null
                Connection conn = DBConnection.getConnection();
                PreparedStatement pst = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                pst.setString(1, quizCode);
                resultSet = pst.executeQuery();
            }

            if (resultSet.next()) { 
                qNumber++;
                questionLbl.setText(resultSet.getString("question_text"));
                questionNoLbl.setText("" + qNumber);
                option1.setText(resultSet.getString("option_a"));
                option2.setText(resultSet.getString("option_b"));
                option3.setText(resultSet.getString("option_c"));
                String questionIdString = resultSet.getString("question_id");
                questionId = Integer.parseInt(questionIdString);
                option4.setText(resultSet.getString("option_d"));
                ansCorrect = resultSet.getString("correct_option");
                
            } else {
                // Results Table Update > <
//                JOptionPane.showMessageDialog(null, "No more questions!");
                resultSet.close(); // Close the ResultSet
                resultSet = null; // Reset the ResultSet
//                insertResult(qCode, Main.userID, correctCounter, falseCounter);
                updateResult(qCode, Main.userID, correctCounter, falseCounter);
                this.dispose();
                
                Result rc = new Result(quizCode);
                rc.setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void insertResult(String quizCode, int userId, int correctAnswers, int falseAnswers) {
        String query = "INSERT INTO result (quiz_code, user_id, correct_answers, incorrect_answers) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(query)) {

            pst.setString(1, quizCode);             // quiz_id from the quizzes table
            pst.setInt(2, userId);             // user_id from the users table
            pst.setInt(3, correctAnswers);     // Total correct answers
            pst.setInt(4, falseAnswers);       // Total false answers

            pst.executeUpdate();
            System.out.println("Result successfully recorded!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void updateResult(String quizCode, int userId, int correctCounter, int falseCounter) {
        String query = "UPDATE result SET correct_answers = ?, incorrect_answers = ? WHERE quiz_code = ? AND user_id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(query)) {

            // Set the values for the query
            pst.setInt(1, correctCounter); // Update correct answers
            pst.setInt(2, falseCounter);  // Update false answers
            pst.setString(3, quizCode);   // Specify the quiz code
            pst.setInt(4, userId);        // Specify the user ID

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
//                System.out.println("Result successfully updated!");
            } else {
//                System.out.println("No record found to update. Ensure the quizCode and userId are correct.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        getData();
        fetchQuestions(qCode);
        String query = "INSERT INTO answers (question_id, quiz_code, correct_option, answer, user_id) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(query)) {

            // Assuming you already have the necessary values (e.g., question_id, quiz_code, correct_option, etc.)
            pst.setInt(1, questionId); // question_id
            pst.setString(2, qCode); // quiz_code
            pst.setString(3, ansCorrect); // correct_option
            pst.setString(4, ans); // answer (user's selected answer)
            pst.setInt(5, Main.userID); // user_id (user making the attempt)

            pst.executeUpdate(); // Execute the insert query

//            JOptionPane.showMessageDialog(rootPane, "Answer recorded successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
//            JOptionPane.showMessageDialog(rootPane, "Error recording the answer.");
        }
        if(ansCorrect.equals(ans)) {
            correctCounter++;
            updateResult(qCode, Main.userID, correctCounter, falseCounter);
        } else {
            falseCounter++;
            updateResult(qCode, Main.userID, correctCounter, falseCounter);
        }
        updateResult(qCode, Main.userID, correctCounter, falseCounter);
    }//GEN-LAST:event_nextButtonActionPerformed
    
    private void getData() {
        if(option1.isSelected()) {
            ans = "1";
        } else if(option2.isSelected()) {
            ans = "2";
        } else if(option3.isSelected()) {
            ans = "3";
        } else if(option4.isSelected()) {
            ans = "4";
        }
    }
    
    private void getQuizData(String quizCode) {
        String query = "SELECT quiz_name, quiz_desc FROM quizzes WHERE quiz_code = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {

            pst.setString(1, quizCode);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) { 
                    quizNameLbl.setText(rs.getString("quiz_name"));
                    quizDescLbl.setText(rs.getString("quiz_desc"));
    //                System.out.println("Quiz Data Loaded: " + rs.getString("quiz_name"));
                } else {
                    System.out.println("No quiz found with the provided quiz code: " + quizCode);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
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
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Question dialog = new Question(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton nextButton;
    private javax.swing.JRadioButton option1;
    private javax.swing.JRadioButton option2;
    private javax.swing.JRadioButton option3;
    private javax.swing.JRadioButton option4;
    private javax.swing.JLabel questionLbl;
    private javax.swing.JLabel questionNoLbl;
    private javax.swing.JLabel quizDescLbl;
    private javax.swing.JLabel quizNameLbl;
    // End of variables declaration//GEN-END:variables
}
