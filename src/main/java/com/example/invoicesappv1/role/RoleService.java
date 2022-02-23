package com.example.invoicesappv1.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
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

    public Optional<Role> getRole(Long id) {

        Optional<Role> roleOptional = this.roleRepository.findRoleById(id);

        if(roleOptional.isEmpty()) {
            // TODO - implement own exception
            throw new IllegalStateException("role does not exists");
        }

        return roleOptional;
    }

    public void addRole(Role role) {

        Optional<Role> roleOptional = this.roleRepository.findRoleByName(role.getName());

        if(roleOptional.isPresent()) {
            // TODO - implement own exception
            throw new IllegalStateException("role is taken");
        }

        this.roleRepository.save(role);
    }

    public void deleteRole(Long id) {
        Optional<Role> roleOptional = this.roleRepository.findRoleById(id);

        if(roleOptional.isEmpty()) {
            // TODO - implement own exception
            throw new IllegalStateException("role does not exists");
        }

        this.roleRepository.deleteById(id);
    }

    // allows not use queries from repository by use setters
    @Transactional
    public void updateRole(Long id, String name, Boolean readRole, Boolean createRole, Boolean updateRole, Boolean deleteRole) {
        Role role = this.roleRepository.findRoleById(id)
                .orElseThrow(
                        // TODO - implement own exception
                        () -> new IllegalStateException("role does not exists")
                );

        if(name != null && name.length() > 0 && !Objects.equals(role.getName(), name)) {
            role.setName(name);
        }

        role.setReadRole(readRole);
        role.setCreateRole(createRole);
        role.setUpdateRole(updateRole);
        role.setDeleteRole(deleteRole);
    }
}
