/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Pharmacy.PharmacyItemDirectory;

/**
 *
 * @author Chetan
 */
public class PharmacyWorkRequest extends WorkRequest{
        private PharmacyItemDirectory pIDirectory;

    public PharmacyWorkRequest() {
        this.pIDirectory = new PharmacyItemDirectory();
    }

    public PharmacyItemDirectory getpIDirectory() {
        return pIDirectory;
    }

    public void setpIDirectory(PharmacyItemDirectory pIDirectory) {
        this.pIDirectory = pIDirectory;
    }
        
}
