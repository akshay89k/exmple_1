package com.silverbullet.invoice.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class InvoiceDto {

    private String amc_legal_name;

    private String product;

    private float advance_invoice_to_be_raised;

    private String amc_gst_number;

    private String amc_pan;

    private Date invoice_raised_on;

    private String registered_address;

    private Date invoice_got_cleared_on;

    private String dependency;

    private String status;

    private String remarks;

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

    @Override
    public String toString() {
        return "InvoiceDto{" +
                "amc_legal_name='" + amc_legal_name + '\'' +
                ", product='" + product + '\'' +
                ", advance_invoice_to_be_raised=" + advance_invoice_to_be_raised +
                ", amc_gst_number='" + amc_gst_number + '\'' +
                ", amc_pan='" + amc_pan + '\'' +
                ", invoice_raised_on=" + invoice_raised_on +
                ", registered_address='" + registered_address + '\'' +
                ", invoice_got_cleared_on=" + invoice_got_cleared_on +
                ", dependency='" + dependency + '\'' +
                ", status='" + status + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}

