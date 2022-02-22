package com.example.invoicesappv1.invoice;

import com.example.invoicesappv1.supplier.Supplier;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Invoice {
    private Long id;
    private LocalDate createdAt;
    private Supplier supplier;
    private BigDecimal amount;
}
