/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vitals;

/**
 *
 * @author Chetan
 */
public class VitalRecords {
    private Integer pulse;
    private Integer rRate;
    private Integer temperature;
    private String bloodPreassure;
    private String cnsExam;

    public Integer getPulse() {
        return pulse;
    }

    public void setPulse(Integer pulse) {
        this.pulse = pulse;
    }

    public Integer getrRate() {
        return rRate;
    }

    public void setrRate(Integer rRate) {
        this.rRate = rRate;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public String getBloodPreassure() {
        return bloodPreassure;
    }

    public void setBloodPreassure(String bloodPreassure) {
        this.bloodPreassure = bloodPreassure;
    }

    public String getCnsExam() {
        return cnsExam;
    }

    public void setCnsExam(String cnsExam) {
        this.cnsExam = cnsExam;
    }
    
}
