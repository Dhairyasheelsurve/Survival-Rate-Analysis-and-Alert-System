/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AnalystRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.AnalystOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Patient.Patients;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientAnalysisWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.LabAssistantRole.ProcessWorkRequestJPanel;

/**
 *
 * @author Dhairyasheel
 */
public class AnalysisDetailsPageJpanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalysisDetailsPageJpanel
     */
    JPanel userProcessContainer; UserAccount account; AnalystOrganization analystOrganization; Enterprise enterprise; 
    EcoSystem business;
    
    

    public AnalysisDetailsPageJpanel(JPanel userProcessContainer, UserAccount account, AnalystOrganization analystOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.analystOrganization = analystOrganization;
        this.business = business;
        this.enterprise = enterprise;
        populatePatientsTable(account);
    }

    
        public void populatePatientsTable(UserAccount account){
         DefaultTableModel model = (DefaultTableModel)patientDetailsjTable.getModel();
         
       String name = "";
        model.setRowCount(0);
        
       
        for(WorkRequest request : analystOrganization.getWorkQueue().getWorkRequestList()){
            
                
            
            Object[] row = new Object[5];
            row[0] = ((PatientAnalysisWorkRequest)request).getPatient().getName();
            row[1] = ((PatientAnalysisWorkRequest)request).getPatient().getVitalRecords().getrRate() ;
            row[2] = ((PatientAnalysisWorkRequest)request).getPatient().getVitalRecords().getPulse() ;
           // row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = ((PatientAnalysisWorkRequest)request).getPatient().getVitalRecords().getBloodPreassure();
            row[4] = ((PatientAnalysisWorkRequest)request).getPatient();
            
            model.addRow(row);
        }
        
        
       
            
           
                }
                    
                        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        patientDetailsjTable = new javax.swing.JTable();
        analyzeData = new javax.swing.JButton();

        patientDetailsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Doctor", "BP", "object"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientDetailsjTable);
        if (patientDetailsjTable.getColumnModel().getColumnCount() > 0) {
            patientDetailsjTable.getColumnModel().getColumn(4).setMinWidth(0);
            patientDetailsjTable.getColumnModel().getColumn(4).setPreferredWidth(0);
            patientDetailsjTable.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        analyzeData.setText("Analyze Data");
        analyzeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(analyzeData, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(analyzeData)
                .addContainerGap(231, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void DataAnalysis(){
        
    }
    
    
    private void analyzeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeDataActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientDetailsjTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        PatientAnalysisWorkRequest request = (PatientAnalysisWorkRequest)patientDetailsjTable.getValueAt(selectedRow, 0);
        
        int survivalrate =100;
        
        int bp = Integer.parseInt(request.getPatient().getVitalRecords().getBloodPreassure());
        int pulse  = request.getPatient().getVitalRecords().getPulse();
        int temp = request.getPatient().getVitalRecords().getTemperature();
        int resprate =  request.getPatient().getVitalRecords().getrRate();
        
        
        if(bp>120 || bp<80){
            survivalrate = survivalrate - 25;
        }
        System.out.println(""+survivalrate);
        if(pulse>130 || pulse<45){
            survivalrate = survivalrate - 25;
        }
        System.out.println(""+survivalrate);
         if(temp>104 || temp<85){
            survivalrate = survivalrate - 25;
        }
         System.out.println(""+survivalrate);
          if(resprate>34 || resprate<10){
            survivalrate = survivalrate - 15;
        }
          
        
        
        System.out.println(""+survivalrate);
        
        
        
        request.setSurvivalRate(survivalrate);
        request.setStatus("Completed");
        request.getReceiver();
        System.out.println(""+request.getReceiver());
        
        
        AnalysisWorkRequestProcessJpanel  aa= new AnalysisWorkRequestProcessJpanel(userProcessContainer, account, analystOrganization, enterprise,business,request);
        userProcessContainer.add("processWorkRequestJPanel", aa);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_analyzeDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analyzeData;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientDetailsjTable;
    // End of variables declaration//GEN-END:variables
}
