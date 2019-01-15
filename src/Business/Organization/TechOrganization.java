/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TechAssistantRole;
import java.util.ArrayList;

/**
 *
 * @author Sarthak
 */
public class TechOrganization extends Organization{

    public TechOrganization() {
        super(Organization.Type.Tech.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TechAssistantRole());
        return roles;
    }
     
   
    
    
}
