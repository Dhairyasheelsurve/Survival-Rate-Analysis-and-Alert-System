/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NurseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Chetan
 */
public class PatientOrganization extends Organization{

    public PatientOrganization() {
        super(Organization.Type.Patients.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
