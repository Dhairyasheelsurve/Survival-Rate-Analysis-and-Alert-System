/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author Chetan
 */
public class PatientsDirectory {
    private ArrayList<Patients> patientsList; 
    
    public PatientsDirectory(){
        patientsList = new ArrayList<Patients>();
    }
    public ArrayList<Patients> getPatientsList() {
        return patientsList;
    }

    public void setPatientsList(ArrayList<Patients> patientsList) {
        this.patientsList = patientsList;
    }
    
    public Patients createPatients(){
        Patients patient = new Patients();
        this.patientsList.add(patient);
        return patient;
    }
}
