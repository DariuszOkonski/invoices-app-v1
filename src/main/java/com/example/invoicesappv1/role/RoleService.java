package com.example.invoicesappv1.role;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    public List<Role> getRoles() {
        return List.of(
                new Role(1L, "admin", true, true, true, true),
                new Role(2L, "user", true, true, true, false),
                new Role(3L, "guest", true, false, false, false)
        );
    }
}
