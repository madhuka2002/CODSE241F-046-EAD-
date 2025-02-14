/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.OES.Dashboard;

import com.OES.Util.Mono;
import com.OES.Util.Archivo;
import com.OES.Util.Abel;
import com.formdev.flatlaf.FlatLightLaf;
import com.OES.DBConn.DBConnection;
import com.OES.Components.Question;
import com.OES.Main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author itsth
 */
public class DashboardStudent extends javax.swing.JFrame {

    int userID;
    
    public DashboardStudent() {
        initComponents();
        this.userID = Main.userID;
        jLabel1.setFont(Archivo.getFont(18));
        jLabel2.setFont(Archivo.getFont(15));
        jLabel3.setFont(Abel.getFont(13));
        refreshButton.setFont(Abel.getFont(11));
        printResultsButton.setFont(Abel.getFont(11));
        jLabel5.setFont(Abel.getFont(13));
        jLabel4.setFont(Abel.getFont(13));
        startQuizButton.setFont(Abel.getFont(11));
        qCode.setFont(Mono.getFont(10));
        sq.setFont(Archivo.getFont(11));
        //qr.setFont(Archivo.getFont(11));
        jLabel11.setFont(Archivo.getFont(20));
        
        dashboardClick.setFont(Abel.getFont(16));
        reportsClick.setFont(Abel.getFont(16));
        
        DefaultTableModel tableModel = new DefaultTableModel(new String[]{"Quiz Code", "Quiz Name"}, 0);
        quizTable.setModel(tableModel);
        JTableHeader tableHeader = quizTable.getTableHeader();
        tableHeader.setFont(Archivo.getFont(11));
        
        // Cell Centering + Cell Fonts
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        for (int i = 0; i < quizTable.getColumnCount(); i++) {
            quizTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        quizTable.setFont(Mono.getFont(12));
        
        // Table Options
        
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tableModel = (DefaultTableModel) quizTable.getModel();
        tableModel.setRowCount(0);
        loadTableData();
    }
    
    public DashboardStudent(int userID) {
        this.userID = Main.userID;
        initComponents();
        jLabel1.setFont(Archivo.getFont(18));
        jLabel2.setFont(Archivo.getFont(15));
        jLabel3.setFont(Abel.getFont(13));
        jLabel4.setFont(Abel.getFont(13));
        //qr.setFont(Archivo.getFont(11));
        startQuizButton.setFont(Abel.getFont(11));
        refreshButton.setFont(Abel.getFont(11));
        printResultsButton.setFont(Abel.getFont(11));
        //jLabel5.setFont(Abel.getFont(13));
        qCode.setFont(Mono.getFont(10));
        sq.setFont(Archivo.getFont(11));
        jLabel11.setFont(Archivo.getFont(20));
        
        dashboardClick.setFont(Abel.getFont(16));
        reportsClick.setFont(Abel.getFont(16));
        
        
        DefaultTableModel tableModel = new DefaultTableModel(new String[]{"Quiz Code", "Quiz Name"}, 0);
        quizTable.setModel(tableModel);
        JTableHeader tableHeader = quizTable.getTableHeader();
        tableHeader.setFont(Archivo.getFont(11));
        
        // Cell Centering + Cell Fonts
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        for (int i = 0; i < quizTable.getColumnCount(); i++) {
            quizTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        quizTable.setFont(Mono.getFont(12));
        
        // Table Options
        
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tableModel = (DefaultTableModel) quizTable.getModel();
        tableModel.setRowCount(0);
        loadTableData();
        
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DashboardPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        qCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        startQuizButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        sq = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ReportsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        quizTable = new javax.swing.JTable();
        printResultsButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Container = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        dashboardClick = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        reportsClick = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        TAB = new javax.swing.JTabbedPane();

        DashboardPanel.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("START QUIZ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CODE");

        qCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Enter the code to begin");

        startQuizButton.setBackground(new java.awt.Color(204, 204, 204));
        startQuizButton.setText("Start Quiz");
        startQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startQuizButtonActionPerformed(evt);
            }
        });

        sq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(startQuizButton)
                .addGap(81, 81, 81))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qCode)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addComponent(sq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(qCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(startQuizButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sq, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Dashboard");

        javax.swing.GroupLayout DashboardPanelLayout = new javax.swing.GroupLayout(DashboardPanel);
        DashboardPanel.setLayout(DashboardPanelLayout);
        DashboardPanelLayout.setHorizontalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(635, Short.MAX_VALUE))
        );
        DashboardPanelLayout.setVerticalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardPanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        ReportsPanel.setBackground(new java.awt.Color(204, 255, 255));

        quizTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(quizTable);

        printResultsButton.setText("PRINT RESULTS");
        printResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printResultsButtonActionPerformed(evt);
            }
        });

        refreshButton.setBackground(new java.awt.Color(204, 204, 204));
        refreshButton.setText("REFRESH");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Results");

        javax.swing.GroupLayout ReportsPanelLayout = new javax.swing.GroupLayout(ReportsPanel);
        ReportsPanel.setLayout(ReportsPanelLayout);
        ReportsPanelLayout.setHorizontalGroup(
            ReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ReportsPanelLayout.createSequentialGroup()
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(printResultsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
            .addGroup(ReportsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ReportsPanelLayout.setVerticalGroup(
            ReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportsPanelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshButton)
                    .addComponent(printResultsButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Container.setBackground(new java.awt.Color(204, 255, 255));

        MenuPanel.setBackground(new java.awt.Color(204, 255, 255));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Q-EXAMZ");

        dashboardClick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardClick.setText("Dashboard");
        dashboardClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardClickMouseClicked(evt);
            }
        });

        reportsClick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportsClick.setText("Results");
        reportsClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsClickMouseClicked(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(102, 102, 102));
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dashboardClick, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reportsClick, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 774, Short.MAX_VALUE)
                        .addComponent(logoutButton)))
                .addContainerGap())
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dashboardClick, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reportsClick))
                    .addComponent(logoutButton))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        TAB.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        TAB.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        TAB.addTab("", DashboardPanel);
        TAB.addTab("", ReportsPanel);

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1122, Short.MAX_VALUE)
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TAB, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContainerLayout.createSequentialGroup()
                    .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 431, Short.MAX_VALUE)))
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TAB, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1134, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardClickMouseClicked
        // TODO add your handling code here:
        TAB.setSelectedIndex(0);
    }//GEN-LAST:event_dashboardClickMouseClicked

    private void reportsClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsClickMouseClicked
        // TODO add your handling code here:
        TAB.setSelectedIndex(1);
    }//GEN-LAST:event_reportsClickMouseClicked

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

//    public void loadTableData() {
//       // Ensure the DefaultTableModel is linked to the JTable
//       DefaultTableModel tableModel = (DefaultTableModel) quizTable.getModel();
//
//       // Clear existing rows in the table
//       tableModel.setRowCount(0);
//
//       // Load data from the database
//       try (Connection conn = DBConnection.getConnection()) {
//           String query = "SELECT quiz_code FROM result WHERE user_id = ?";
//           PreparedStatement pst = conn.prepareStatement(query);
//           pst.setInt(1, userID); 
//
//           try (ResultSet rs = pst.executeQuery()) {
//               while (rs.next()) {
//                   String quizCode = rs.getString("quiz_code");
//                   tableModel.addRow(new Object[]{quizCode});
//               }
//           }
//       } catch (Exception ex) {
//           ex.printStackTrace();
//       }
//   }
    
    
    public void loadTableData() {
        // Ensure the DefaultTableModel is linked to the JTable
        DefaultTableModel tableModel = (DefaultTableModel) quizTable.getModel();

        // Clear existing rows in the table
        tableModel.setRowCount(0);

        // Load data from the database
        try (Connection conn = DBConnection.getConnection()) {
            // Updated query to join result and quizzes tables on quiz_code
            String query = "SELECT r.quiz_code, q.quiz_name " +
                           "FROM result r " +
                           "JOIN quizzes q ON r.quiz_code = q.quiz_code " +
                           "WHERE r.user_id = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setInt(1, userID); // Set the userID parameter

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String quizCode = rs.getString("quiz_code");
                    String quizName = rs.getString("quiz_name");
                    tableModel.addRow(new Object[]{quizCode, quizName}); // Add both quiz_code and quiz_name
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    
    private void startQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startQuizButtonActionPerformed
        // TODO add your handling code here:
        String quizCode;
        quizCode = this.qCode.getText().trim();

        if (quizCode.isEmpty()) {
            //          JOptionPane.showMessageDialog(this, "Quiz Code cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            sq.setText("\" Quiz Code cannot be empty! \"");
        } else {
            try (Connection conn = DBConnection.getConnection()) {
                String query = "SELECT COUNT(*) FROM quizzes WHERE quiz_code = ?";
                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                    stmt.setString(1, quizCode);
                    ResultSet rs = stmt.executeQuery();
                    if (rs.next() && rs.getInt(1) > 0) {
                        // Quiz Reattempt Logic goes here
                        String query1 = "SELECT COUNT(*) AS attempt_count FROM result WHERE quiz_code = ? AND user_id = ?";
                        try (Connection conn1 = DBConnection.getConnection();
                            PreparedStatement pst1 = conn1.prepareStatement(query1)) {

                            pst1.setString(1, quizCode); // Set the quiz_code parameter
                            pst1.setInt(2, userID);     // Set the user_id parameter

                            ResultSet rs1 = pst1.executeQuery();

                            if (rs1.next()) {
                                int attemptCount = rs1.getInt("attempt_count"); // Get the count of attempts

                                if (attemptCount > 0) {
                                    // If an attempt exists, show a message in the option pane
                                    sq.setText(" \"You have already attempted this quiz! \"");
                                } else {
                                    // If no attempt exists, allow the user to start the quiz

                                    // Proceed to open the quiz component (Replace with your quiz component opening logic)
                                    // Code Block if no attempt exists :)
                                // Quiz code is valid, start quiz
                                dispose(); // Close the entry frame
                                Question qc = new Question(quizCode);
                                qc.setVisible(true); // QuizCompoent Open
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    sq.setText(" \"Invalid Quiz Code! \"");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        }
    }//GEN-LAST:event_startQuizButtonActionPerformed

    private void printResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printResultsButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = quizTable.getSelectedRow();

        // Ensure a row is selected
//        if (selectedRow == -1) {
//            qr.setText("\" Please select a quiz to print the report! \"");
//            return;
//        }

        // Get the quizCode from the selected row (assuming it's in the first column)
        String quizCode = (String) quizTable.getValueAt(selectedRow, 0);

        // Now proceed with generating the report
        try {
            Connection conn = DBConnection.getConnection();

            // Define the report path
            String reportPath = "src/main/resources/reports/UserResult.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(reportPath);

            // Set the parameters for the report
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("userID", Main.userID); // Assuming Main.userID holds the current user ID
            parameters.put("quizCode", quizCode);  // Pass the selected quizCode

            // Fill the report with data from the database
            JasperPrint jp = JasperFillManager.fillReport(jr, parameters, conn);

            // Close the connection
            conn.close();

            // Display the report
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            e.printStackTrace();
//            lf.setText("An error occurred while generating the report!");
        }
    }//GEN-LAST:event_printResultsButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        loadTableData();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void validateQuizCodeAndStart(String quizCode) {
        // Validate quiz code and start quiz
        try (Connection conn = DBConnection.getConnection()) {
            String query = "SELECT COUNT(*) FROM quizzes WHERE quiz_code = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, quizCode);
                ResultSet rs = stmt.executeQuery();
                if (rs.next() && rs.getInt(1) > 0) {
                    // Quiz code is valid, start quiz
                    dispose(); // Close the entry frame
                    Question qc = new Question(quizCode);
                    qc.setVisible(true); // QuizCompoent Open
                } else {
                    sq.setText(" \"Invalid Quiz Code! \"");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
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
                new DashboardStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel DashboardPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel ReportsPanel;
    public javax.swing.JTabbedPane TAB;
    private javax.swing.JLabel dashboardClick;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton printResultsButton;
    private javax.swing.JTextField qCode;
    private javax.swing.JTable quizTable;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel reportsClick;
    private javax.swing.JLabel sq;
    private javax.swing.JButton startQuizButton;
    // End of variables declaration//GEN-END:variables
}
