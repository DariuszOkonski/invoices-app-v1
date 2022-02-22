package com.example.invoicesappv1.supplier;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/suppliers")
public class SupplierController {

    @GetMapping
	public List<Supplier> getSuppliers() {
		return List.of(
				new Supplier(1L, "Infinite Sp. z o.o", "ul.Projektowa 1, 20-209 Lublin"),
				new Supplier(2L, "Moovem Sp. z o.o", "Al. Jerozolimskie 100. 00-807 Warszawa"),
				new Supplier(3L, "Divante", "ul.Dmowskiego 17, 50-203 Wrocław"),
				new Supplier(4L, "Comarch", "ul.Bracka 15, 32-302 Kraków")
		);
	}
}
