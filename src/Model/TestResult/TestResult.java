/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.TestResult;

/**
 *
 * @author vidhisejpal
 */
public class TestResult {
    private Long resultId;
    
    private Long docId;
    
    private String docName;
    
    private String testName;
    
    private String patientName;
    
    private String date;
    
    private String sample;
    
    private String strainDetected;
    
    private String sugarDetected;
    
    private String vitaminLevel;
    
    private String remarks;

    public Long getResultId() {
        return resultId;
    }

    public void setResultId(Long resultId) {
        this.resultId = resultId;
    }

    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public String getStrainDetected() {
        return strainDetected;
    }

    public void setStrainDetected(String strainDetected) {
        this.strainDetected = strainDetected;
    }

    public String getSugarDetected() {
        return sugarDetected;
    }

    public void setSugarDetected(String sugarDetected) {
        this.sugarDetected = sugarDetected;
    }

    public String getVitaminLevel() {
        return vitaminLevel;
    }

    public void setVitaminLevel(String vitaminLevel) {
        this.vitaminLevel = vitaminLevel;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    
    
}
