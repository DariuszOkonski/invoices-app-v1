package com.example.invoicesappv1.supplier;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    public List<Supplier> getSuppliers() {
        return List.of(
                new Supplier(1L, "Infinite Sp. z o.o", "ul.Projektowa 1, 20-209 Lublin"),
                new Supplier(2L, "Moovem Sp. z o.o", "Al. Jerozolimskie 100. 00-807 Warszawa"),
                new Supplier(3L, "Divante", "ul.Dmowskiego 17, 50-203 Wrocław"),
                new Supplier(4L, "Comarch", "ul.Bracka 15, 32-302 Kraków")
        );
    }
}
