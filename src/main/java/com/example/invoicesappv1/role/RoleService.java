package com.example.invoicesappv1.role;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    public List<Role> getRoles() {
        return List.of(
                new Role(1L, "admin"),
                new Role(2L, "user"),
                new Role(3L, "guest")
        );
    }
}
