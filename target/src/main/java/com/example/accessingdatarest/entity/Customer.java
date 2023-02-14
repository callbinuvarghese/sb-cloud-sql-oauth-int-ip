package com.example.accessingdatarest.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false)
    private Integer id;

    @Column(name = "customer_name", length = 100)
    private String customerName;

    @Column(name = "audit_insert_ts")
    private Instant auditInsertTs;

    @Column(name = "audit_last_upd_ts")
    private Instant auditLastUpdTs;

    @Column(name = "audit_username", length = 100)
    private String auditUsername;

    @Column(name = "internal_contact_names", length = 1024)
    private String internalContactNames;

    @Column(name = "internal_contact_emails", length = 1024)
    private String internalContactEmails;

    @Column(name = "external_contact_names", length = 1024)
    private String externalContactNames;

    @Column(name = "external_contact_emails", length = 1024)
    private String externalContactEmails;

    @Column(name = "customer_tags", length = 1024)
    private String customerTags;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Instant getAuditInsertTs() {
        return auditInsertTs;
    }

    public void setAuditInsertTs(Instant auditInsertTs) {
        this.auditInsertTs = auditInsertTs;
    }

    public Instant getAuditLastUpdTs() {
        return auditLastUpdTs;
    }

    public void setAuditLastUpdTs(Instant auditLastUpdTs) {
        this.auditLastUpdTs = auditLastUpdTs;
    }

    public String getAuditUsername() {
        return auditUsername;
    }

    public void setAuditUsername(String auditUsername) {
        this.auditUsername = auditUsername;
    }

    public String getInternalContactNames() {
        return internalContactNames;
    }

    public void setInternalContactNames(String internalContactNames) {
        this.internalContactNames = internalContactNames;
    }

    public String getInternalContactEmails() {
        return internalContactEmails;
    }

    public void setInternalContactEmails(String internalContactEmails) {
        this.internalContactEmails = internalContactEmails;
    }

    public String getExternalContactNames() {
        return externalContactNames;
    }

    public void setExternalContactNames(String externalContactNames) {
        this.externalContactNames = externalContactNames;
    }

    public String getExternalContactEmails() {
        return externalContactEmails;
    }

    public void setExternalContactEmails(String externalContactEmails) {
        this.externalContactEmails = externalContactEmails;
    }

    public String getCustomerTags() {
        return customerTags;
    }

    public void setCustomerTags(String customerTags) {
        this.customerTags = customerTags;
    }

}