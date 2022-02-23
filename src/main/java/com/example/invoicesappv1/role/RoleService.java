package com.example.invoicesappv1.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> getRoles() {
        return this.roleRepository.findAll();
    }

    public void addRole(Role role) {

        Optional<Role> roleOptional = this.roleRepository.findRoleByName(role.getName());

        if(roleOptional.isPresent()) {
            throw new IllegalStateException("role is taken");
        }

        this.roleRepository.save(role);
    }
}
