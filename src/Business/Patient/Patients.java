/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Vitals.VitalRecords;

/**
 *
 * @author Chetan
 */
public class Patients {
    private String name;
    private Integer age;
    private Integer weight;
    private VitalRecords vitalRecords;
    private int id;
    private static int count = 1;
    private String assignedDoc;

    public Patients() {
        id = count;
        count++;
        vitalRecords = new VitalRecords();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public VitalRecords getVitalRecords() {
        return vitalRecords;
    }

    public void setVitalRecords(VitalRecords vitalRecords) {
        this.vitalRecords = vitalRecords;
    }

    public String getAssignedDoc() {
        return assignedDoc;
    }

    public void setAssignedDoc(String assignedDoc) {
        this.assignedDoc = assignedDoc;
    }

     
    
    @Override
    public String toString(){
        return name;
    }
}
