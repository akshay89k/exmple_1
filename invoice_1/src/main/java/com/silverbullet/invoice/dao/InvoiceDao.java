package com.silverbullet.invoice.dao;

import com.silverbullet.invoice.entities.InvoiceMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceDao extends JpaRepository<InvoiceMaster,Integer> {


}


