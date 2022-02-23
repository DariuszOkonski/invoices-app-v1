package com.example.invoicesappv1.supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/suppliers")
public class SupplierController {

	private final SupplierService supplierService;

	@Autowired
	public SupplierController(SupplierService supplierService) {
		this.supplierService = supplierService;
	}

	@GetMapping
	public List<Supplier> getSuppliers() {
		return this.supplierService.getSuppliers();
	}

	@PostMapping
	public void addSupplier(@RequestBody Supplier supplier) {
		this.supplierService.addSupplier(supplier);
	}
}
