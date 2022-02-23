package com.example.invoicesappv1.configuration;

import com.example.invoicesappv1.role.Role;
import com.example.invoicesappv1.role.RoleRepository;
import com.example.invoicesappv1.supplier.Supplier;
import com.example.invoicesappv1.supplier.SupplierRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            RoleRepository roleRepository,
            SupplierRepository supplierRepository
    ) {
        return args -> {

            roleRepositoryPropagation(roleRepository);

            supplierRepositoryPropagation(supplierRepository);

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
}
