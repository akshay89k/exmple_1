package com.silverbullet.invoice.service;

import com.silverbullet.invoice.dao.InvoiceDao;
import com.silverbullet.invoice.entities.InvoiceMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceServiceImpl implements InvoiceService{

    @Autowired
    InvoiceDao invoiceDao;

    public InvoiceDao getInvoiceDao() {
        return invoiceDao;
    }

    public void setInvoiceDao(InvoiceDao invoiceDao) {
        this.invoiceDao = invoiceDao;
    }

    @Override
    public InvoiceMaster createInvoiceMaster(InvoiceMaster invoiceMaster) {
        return invoiceDao.save(invoiceMaster);
    }

    @Override
    public InvoiceMaster getInvoiceMasterOnId(int id) {
        Optional<InvoiceMaster> invoiceMaster = invoiceDao.findById(id);
        if(invoiceMaster.isPresent())
            return invoiceMaster.get();
        return null;
    }

    @Override
    public InvoiceMaster updateInvoice(InvoiceMaster invoiceMaster) {
        InvoiceMaster storedInvoice = getInvoiceMasterOnId(invoiceMaster.getUserId());
        System.out.println("---------------------------"+invoiceMaster.getUserId());

        // Copy the content of user into storedUser object

        storedInvoice.setAmc_legal_name(invoiceMaster.getAmc_legal_name());
        storedInvoice.setProduct(invoiceMaster.getProduct());
        storedInvoice.setAdvance_invoice_to_be_raised(invoiceMaster.getAdvance_invoice_to_be_raised());
        storedInvoice.setAmc_gst_number(invoiceMaster.getAmc_gst_number());
        storedInvoice.setAmc_pan(invoiceMaster.getAmc_pan());
        storedInvoice.setInvoice_raised_on(invoiceMaster.getInvoice_raised_on());
        storedInvoice.setRegistered_address(invoiceMaster.getRegistered_address());
        storedInvoice.setInvoice_got_cleared_on(invoiceMaster.getInvoice_got_cleared_on());
        storedInvoice.setDependency(invoiceMaster.getDependency());
        storedInvoice.setStatus(invoiceMaster.getStatus());
        storedInvoice.setRemarks(invoiceMaster.getRemarks());


        return invoiceDao.save(storedInvoice);
    }

    @Override
    public InvoiceMaster deleteInvoiceMaster(InvoiceMaster invoiceMaster) {
        invoiceDao.delete(invoiceMaster);
        return null;
    }

    @Override
    public List<InvoiceMaster> getAllInvoice() {
        return invoiceDao.findAll();
    }
}
