package com.silverbullet.invoice.controller;

import com.silverbullet.invoice.dto.InvoiceDto;
import com.silverbullet.invoice.entities.InvoiceMaster;
import com.silverbullet.invoice.service.InvoiceService;
import com.silverbullet.invoice.utils.PojoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    /**
     * Create a POST API
     */

    @PostMapping(value="/invoices" , consumes = MediaType.APPLICATION_JSON_VALUE ,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createUser(@RequestBody InvoiceDto invoiceDto){
        InvoiceMaster invoiceMaster = PojoConverter.convertInvoiceDTOToEntity(invoiceDto);

        InvoiceMaster savedInvoice = invoiceService.createInvoiceMaster(invoiceMaster);

        InvoiceDto savedUserDTO = PojoConverter.convertInvoiceEntityToDTO(invoiceMaster);

        return new ResponseEntity(savedUserDTO , HttpStatus.CREATED);
    }

    /**
     *
     * Get the list of all the invoices
     *
     * 127.0.0.1:8080/invoice_app/v1/invoices  GET
     */
    @GetMapping(value="/invoices" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity GetAllUsers(){
        List<InvoiceMaster> userList = invoiceService.getAllInvoice();

        List<InvoiceDto>  userDTOList = new ArrayList<>();

        userList.forEach(u -> userDTOList.add(PojoConverter.convertInvoiceEntityToDTO(u)));

        return new ResponseEntity(userDTOList, HttpStatus.OK);

    }

    /**
     *
     * 127.0.0.1:8080/invoice_app/v1/invoices/{amc_pan}   GET
     *
     */
    @GetMapping(value = "/invoices/{id}")
    public ResponseEntity getUser(@PathVariable(name = "id")  int id){
        InvoiceMaster user = (invoiceService.getInvoiceMasterOnId(id));

        if(user!=null) {
            InvoiceDto userDTO = PojoConverter.convertInvoiceEntityToDTO(user);
            return new ResponseEntity(userDTO, HttpStatus.OK);
        }else{
            return null;
        }
    }

    /**
     *
     *
     *
     * PUT
     *
     * 127.0.0.1:8080/users_app/v1/invoices
     * Request body will be present {}
     */
    @PutMapping(value="/invoices/{id}" , consumes = MediaType.APPLICATION_JSON_VALUE ,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateUser(@PathVariable(value = "id") int id, @RequestBody InvoiceDto userDTO){

        InvoiceMaster userToBeUpdated = PojoConverter.convertInvoiceDTOToEntity(userDTO);
        userToBeUpdated.setUserId(id);
        InvoiceMaster savedUpdatedUser = invoiceService.updateInvoice(userToBeUpdated);

        InvoiceDto user = PojoConverter.convertInvoiceEntityToDTO(savedUpdatedUser);

        return new ResponseEntity(user, HttpStatus.ACCEPTED);
    }

    /**
     *
     *
     * 127.0.0.1:8080/users_app/v1/invoices/{id}  -- deletion
     */

    @DeleteMapping(value="/invoices/{id}")
    public ResponseEntity deleteUser(@PathVariable(name="id") int id){

        InvoiceMaster user = invoiceService.getInvoiceMasterOnId(id);
        invoiceService.deleteInvoiceMaster(user);

        return  new ResponseEntity(null, HttpStatus.OK);
    }

}
