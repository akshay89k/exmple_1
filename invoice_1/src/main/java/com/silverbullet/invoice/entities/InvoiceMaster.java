package com.silverbullet.invoice.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
public class InvoiceMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;



    @Column(name = "first_name", length = 45, nullable = false)
    private String amc_legal_name;

    @Column(length = 45)
    private String product;

    @Column(name = "advance_invoice_to_be_raised",nullable = false)
    private float advance_invoice_to_be_raised;

    @Column(length = 45, nullable = false)
    private String amc_gst_number;

    @Column(length = 45, nullable = false)
    private String amc_pan;

    @Column(nullable = false)
    private Date invoice_raised_on;

    @Column(length = 200, nullable = false)
    private String registered_address;

    @Column(nullable = false)
    private Date invoice_got_cleared_on;

    @Column(length = 45, nullable = false)
    private String dependency;

    @Column(length = 45, nullable = false)
    private String status;

    @Column(length = 45, nullable = false)
    private String remarks;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAmc_legal_name() {
        return amc_legal_name;
    }

    public void setAmc_legal_name(String amc_legal_name) {
        this.amc_legal_name = amc_legal_name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public float getAdvance_invoice_to_be_raised() {
        return advance_invoice_to_be_raised;
    }

    public void setAdvance_invoice_to_be_raised(float advance_invoice_to_be_raised) {
        this.advance_invoice_to_be_raised = advance_invoice_to_be_raised;
    }

    public String getAmc_gst_number() {
        return amc_gst_number;
    }

    public void setAmc_gst_number(String amc_gst_number) {
        this.amc_gst_number = amc_gst_number;
    }

    public String getAmc_pan() {
        return amc_pan;
    }

    public void setAmc_pan(String amc_pan) {
        this.amc_pan = amc_pan;
    }

    public Date getInvoice_raised_on() {
        return invoice_raised_on;
    }

    public void setInvoice_raised_on(Date invoice_raised_on) {
        this.invoice_raised_on = invoice_raised_on;
    }

    public String getRegistered_address() {
        return registered_address;
    }

    public void setRegistered_address(String registered_address) {
        this.registered_address = registered_address;
    }

    public Date getInvoice_got_cleared_on() {
        return invoice_got_cleared_on;
    }

    public void setInvoice_got_cleared_on(Date invoice_got_cleared_on) {
        this.invoice_got_cleared_on = invoice_got_cleared_on;
    }

    public String getDependency() {
        return dependency;
    }

    public void setDependency(String dependency) {
        this.dependency = dependency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}


