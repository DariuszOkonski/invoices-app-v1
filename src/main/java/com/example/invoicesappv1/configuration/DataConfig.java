package com.example.invoicesappv1.configuration;

import com.example.invoicesappv1.invoice.Invoice;
import com.example.invoicesappv1.invoice.InvoiceRepository;
import com.example.invoicesappv1.role.Role;
import com.example.invoicesappv1.role.RoleRepository;
import com.example.invoicesappv1.supplier.Supplier;
import com.example.invoicesappv1.supplier.SupplierRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class DataConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            RoleRepository roleRepository,
            SupplierRepository supplierRepository,
            InvoiceRepository invoiceRepository
    ) {
        return args -> {

            roleRepositoryPropagation(roleRepository);

            supplierRepositoryPropagation(supplierRepository);

            invoiceRepositoryPropagation(invoiceRepository);
        };
    }

    private void roleRepositoryPropagation(RoleRepository roleRepository) {
        Role admin = new Role(
                "admin",
                true,
                true,
                true,
                true);

        Role user = new Role(
                "user",
                true,
                true,
                true,
                false);

        Role guest = new Role(
                "guest",
                true,
                false,
                false,
                false);

        roleRepository.saveAll(List.of(admin, user, guest));
    }

    private void supplierRepositoryPropagation(SupplierRepository supplierRepository) {
        Supplier infinite = new Supplier(
                "Infinite Sp. z o.o",
                "ul.Projektowa 1, 20-209 Lublin");

        Supplier moovem = new Supplier(
                "Moovem Sp. z o.o",
                "Al. Jerozolimskie 100. 00-807 Warszawa");

        Supplier divante = new Supplier(
                "Divante",
                "ul.Dmowskiego 17, 50-203 Wrocław");

        Supplier comarch = new Supplier(
                "Comarch",
                "ul.Bracka 15, 32-302 Kraków");

        supplierRepository.saveAll(List.of(infinite, moovem, divante, comarch));
    }

    private void invoiceRepositoryPropagation(InvoiceRepository invoiceRepository) {

        Invoice invoice1 = new Invoice(
                LocalDate.of(2022, Month.FEBRUARY, 2),
                1L,
                new BigDecimal(11289.00)
        );
        Invoice invoice2 = new Invoice(
                LocalDate.of(2021, Month.MARCH, 5),
                2L,
                new BigDecimal(32987.00)
        );
        Invoice invoice3 = new Invoice(
                LocalDate.of(2021, Month.APRIL, 7),
                2L,
                new BigDecimal(110000.00)
        );
        Invoice invoice4 = new Invoice(
                LocalDate.of(2021, Month.NOVEMBER, 12),
                3L,
                new BigDecimal(293212.00)
        );

        invoiceRepository.saveAll(List.of(invoice1, invoice2, invoice3, invoice4));
    }
}
