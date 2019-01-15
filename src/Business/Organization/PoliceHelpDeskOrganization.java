/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.PoliceHelpDeskRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sarthak
 */
public class PoliceHelpDeskOrganization extends Organization{

    public PoliceHelpDeskOrganization() {
        super(Type.HelpDesk.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PoliceHelpDeskRole());
        return roles;
    }
     
}
