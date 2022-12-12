/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Collab;

/**
 *
 * @author vidhisejpal
 */
public class RequestCollab {
    
    private Long collabId;
    
    private Long uniIdToReq;
    
    private Long uniIdFromReq;
    
    private String universityName;
    
    private String expName;
    
    private String reason;
    
    private String approval;

    public Long getCollabId() {
        return collabId;
    }

    public void setCollabId(Long collabId) {
        this.collabId = collabId;
    }

    public Long getUniIdToReq() {
        return uniIdToReq;
    }

    public void setUniIdToReq(Long uniIdToReq) {
        this.uniIdToReq = uniIdToReq;
    }

    public Long getUniIdFromReq() {
        return uniIdFromReq;
    }

    public void setUniIdFromReq(Long uniIdFromReq) {
        this.uniIdFromReq = uniIdFromReq;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

    @Override
    public String toString() {
        return expName;
    }
    
    
    
}
