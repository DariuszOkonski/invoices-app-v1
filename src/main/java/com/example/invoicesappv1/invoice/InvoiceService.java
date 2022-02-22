package com.example.invoicesappv1.invoice;

import com.example.invoicesappv1.supplier.Supplier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class InvoiceService {

    public List<Invoice> getInvoices() {
        return List.of(
                new Invoice(
                        1L,
                        LocalDate.of(2022, Month.FEBRUARY, 2),
                        new Supplier(1L, "Infinite Sp. z o.o", "ul.Projektowa 1, 20-209 Lublin"),
                        new BigDecimal(11289.00)
                ),
                new Invoice(
                        2L,
                        LocalDate.of(2021, Month.MARCH, 5),
                        new Supplier(2L, "Moovem Sp. z o.o", "Al. Jerozolimskie 100. 00-807 Warszawa"),
                        new BigDecimal(32987.00)
                )
        );
    }
}
