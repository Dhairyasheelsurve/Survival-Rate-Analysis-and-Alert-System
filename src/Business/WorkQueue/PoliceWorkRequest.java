/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Sarthak
 */
public class PoliceWorkRequest extends WorkRequest{
    
    private String incident;
    private String priority;
    private String policeAssigned;
    private String notes;

    public String getIncident() {
        return incident;
    }

    public void setIncident(String incident) {
        this.incident = incident;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getPoliceAssigned() {
        return policeAssigned;
    }

    public void setPoliceAssigned(String policeAssigned) {
        this.policeAssigned = policeAssigned;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "PoliceWorkRequest{" + "incident=" + incident + '}';
    }

    
    
    
}
