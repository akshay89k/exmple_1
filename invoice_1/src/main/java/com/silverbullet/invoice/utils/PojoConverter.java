package com.silverbullet.invoice.utils;

import com.silverbullet.invoice.dto.InvoiceDto;
import com.silverbullet.invoice.entities.InvoiceMaster;

public class PojoConverter {
    public static InvoiceDto convertInvoiceEntityToDTO(InvoiceMaster invoiceMaster) {
        InvoiceDto invoiceDto = new InvoiceDto();

        invoiceDto.setAmc_legal_name(invoiceMaster.getAmc_legal_name());
        invoiceDto.setProduct(invoiceMaster.getProduct());
        invoiceDto.setAdvance_invoice_to_be_raised(invoiceMaster.getAdvance_invoice_to_be_raised());
        invoiceDto.setAmc_gst_number(invoiceMaster.getAmc_gst_number());
        invoiceDto.setAmc_pan(invoiceMaster.getAmc_pan());
        invoiceDto.setInvoice_raised_on(invoiceMaster.getInvoice_raised_on());
        invoiceDto.setRegistered_address(invoiceMaster.getRegistered_address());
        invoiceDto.setInvoice_got_cleared_on(invoiceMaster.getInvoice_got_cleared_on());
        invoiceDto.setDependency(invoiceMaster.getDependency());
        invoiceDto.setStatus(invoiceMaster.getStatus());
        invoiceDto.setRemarks(invoiceMaster.getRemarks());


        return invoiceDto;
    }

    public static InvoiceMaster convertInvoiceDTOToEntity(InvoiceDto invoiceDto) {
        InvoiceMaster invoiceMaster = new InvoiceMaster();

        invoiceMaster.setAmc_legal_name(invoiceDto.getAmc_legal_name());
        invoiceMaster.setProduct(invoiceDto.getProduct());
        invoiceMaster.setAdvance_invoice_to_be_raised(invoiceDto.getAdvance_invoice_to_be_raised());
        invoiceMaster.setAmc_gst_number(invoiceDto.getAmc_gst_number());
        invoiceMaster.setAmc_pan(invoiceDto.getAmc_pan());
        invoiceMaster.setInvoice_raised_on(invoiceDto.getInvoice_raised_on());
        invoiceMaster.setRegistered_address(invoiceDto.getRegistered_address());
        invoiceMaster.setInvoice_got_cleared_on(invoiceDto.getInvoice_got_cleared_on());
        invoiceMaster.setDependency(invoiceDto.getDependency());
        invoiceMaster.setStatus(invoiceDto.getStatus());
        invoiceMaster.setRemarks(invoiceDto.getRemarks());


        return invoiceMaster;
    }
}

