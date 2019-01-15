/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ReceptionOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ReceptionRole.ReceptionHomePageJpanel;


/**
 *
 * @author Sarthak
 */
public class ReceptionRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ReceptionHomePageJpanel(userProcessContainer, account, (ReceptionOrganization)organization, enterprise, business);
    }
    
}
