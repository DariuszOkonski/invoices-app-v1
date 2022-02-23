package com.example.invoicesappv1.supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    public List<Supplier> getSuppliers() {
        return this.supplierRepository.findAll();
    }

    public void addSupplier(Supplier supplier) {


        this.supplierRepository.save(supplier);
    }
}
