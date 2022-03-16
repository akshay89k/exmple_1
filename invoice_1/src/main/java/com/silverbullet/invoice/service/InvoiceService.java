package com.silverbullet.invoice.service;

import com.silverbullet.invoice.entities.InvoiceMaster;

import java.util.List;

public interface InvoiceService {

    public InvoiceMaster createInvoiceMaster(InvoiceMaster invoiceMaster);

    public InvoiceMaster getInvoiceMasterOnId(int id);

    public InvoiceMaster updateInvoice(InvoiceMaster invoiceMaster);

    public InvoiceMaster deleteInvoiceMaster(InvoiceMaster invoiceMaster);

    public List<InvoiceMaster> getAllInvoice();

}
