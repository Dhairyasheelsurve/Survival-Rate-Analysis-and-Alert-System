/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dhairya
 */
public class DoctorAccountOrganization extends Organization{

    private DoctorOrganization docOrg;
    private AccountsOrganization accOrg;

    public DoctorAccountOrganization(DoctorOrganization docOrg, AccountsOrganization accOrg, String name) {
        super(name);
        this.docOrg = docOrg;
        this.accOrg = accOrg;
    }
    
    
    /*public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());
    }*/
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }
     
}