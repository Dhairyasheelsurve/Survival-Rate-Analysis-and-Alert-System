/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Accounts.getValue())){
            organization = new AccountsOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Patients.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Distributer.getValue())){
            organization = new DistributerOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Tech.getValue())){
            organization = new TechOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Reception.getValue())){
            organization = new ReceptionOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.HelpDesk.getValue())){
            organization = new PoliceHelpDeskOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Analyst.getValue())){
            organization = new AnalystOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
