/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Tester;

/**
 *
 * @author vidhisejpal
 */
public class Tester {
    
    private Long testerId;
    
    private Long orgId;
    
    private String testerName;
    
    private String testerEmail;
    
    private String testerUsername;
    
    private String testerPassword;
    
    private String testerLicense;

    public Long getTesterId() {
        return testerId;
    }

    public void setTesterId(Long testerId) {
        this.testerId = testerId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getTesterName() {
        return testerName;
    }

    public void setTesterName(String testerName) {
        this.testerName = testerName;
    }

    public String getTesterEmail() {
        return testerEmail;
    }

    public void setTesterEmail(String testerEmail) {
        this.testerEmail = testerEmail;
    }

    public String getTesterUsername() {
        return testerUsername;
    }

    public void setTesterUsername(String testerUsername) {
        this.testerUsername = testerUsername;
    }

    public String getTesterPassword() {
        return testerPassword;
    }

    public void setTesterPassword(String testerPassword) {
        this.testerPassword = testerPassword;
    }

    public String getTesterLicense() {
        return testerLicense;
    }

    public void setTesterLicense(String testerLicense) {
        this.testerLicense = testerLicense;
    }

    @Override
    public String toString() {
        return testerName;
    }
    
    
    
}
