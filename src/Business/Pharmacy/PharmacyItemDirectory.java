/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author Chetan
 */
public class PharmacyItemDirectory {
     private ArrayList<PharmacyItem> pharmacyItemList;

    public PharmacyItemDirectory() {
        this.pharmacyItemList = new ArrayList<PharmacyItem>();
    }

    public ArrayList<PharmacyItem> getPharmacyItemList() {
        return pharmacyItemList;
    }

    public void setPharmacyItemList(ArrayList<PharmacyItem> pharmacyItemList) {
        this.pharmacyItemList = pharmacyItemList;
    }

   
     public PharmacyItem createPharmacyItem(){
        PharmacyItem pharmacyItem = new PharmacyItem();
        this.pharmacyItemList.add(pharmacyItem);
        return pharmacyItem;
    }
}
