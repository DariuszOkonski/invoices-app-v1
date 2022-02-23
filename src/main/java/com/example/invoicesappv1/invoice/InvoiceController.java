package com.example.invoicesappv1.invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;

    @Autowired
    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping
    public List<Invoice> getInvoices() {
        return this.invoiceService.getInvoices();
    }

    @PostMapping
    public void addInvoice(@RequestBody Invoice invoice) {
        this.invoiceService.addInvoice(invoice);
    }
}
