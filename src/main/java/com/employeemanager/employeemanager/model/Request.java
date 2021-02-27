package com.employeemanager.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Request implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Boolean isLeave;
    private Boolean isWFH;
    private String date;
    private String reason;
    private String status;
    private String scheduled;
    //{planned, unplanned}
    private String leaveType;
    //{EL, CompOFF, Optional}
    private String empId;

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", isLeave=" + isLeave +
                ", isWFH=" + isWFH +
                ", date='" + date + '\'' +
                ", reason='" + reason + '\'' +
                ", status='" + status + '\'' +
                ", scheduled='" + scheduled + '\'' +
                ", leaveType='" + leaveType + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getLeave() {
        return isLeave;
    }

    public void setLeave(Boolean leave) {
        isLeave = leave;
    }

    public Boolean getWFH() {
        return isWFH;
    }

    public void setWFH(Boolean WFH) {
        isWFH = WFH;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getScheduled() {
        return scheduled;
    }

    public void setScheduled(String scheduled) {
        this.scheduled = scheduled;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

}
