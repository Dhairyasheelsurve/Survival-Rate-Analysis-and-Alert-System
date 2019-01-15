/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import static Business.Organization.Organization.Type.Patients;
import Business.Patient.Patients;

/**
 *
 * @author Dhairyasheel
 */
public class PatientAnalysisWorkRequest extends WorkRequest{
    
    private Patients patient;
    
    private double survivalRate;

    public Patients getPatient() {
        return patient;
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
    }

    public double getSurvivalRate() {
        return survivalRate;
    }

    public void setSurvivalRate(double survivalRate) {
        this.survivalRate = survivalRate;
    }
    
    
    
}
