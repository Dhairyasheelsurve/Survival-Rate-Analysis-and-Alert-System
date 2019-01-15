/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Patient.PatientsDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PatientsDirectory patientsDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
    Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization"), Accounts("Accounts Organization"), Tech("Tech Organization"),
    Nurse("Nurse Organization"), Patients("Patients"), Reception("Reception"), HelpDesk("Helpdesk Organization"), Distributer("Distributer Organization"),Analyst("Analyst");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        patientsDirectory = new PatientsDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public PatientsDirectory getPatientsDirectory() {
        return patientsDirectory;
    }

    public void setPatientsDirectory(PatientsDirectory patientsDirectory) {
        this.patientsDirectory = patientsDirectory;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
