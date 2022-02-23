package com.example.invoicesappv1.role;

import javax.persistence.*;

@Entity
@Table
public class Role {
    @Id
    @SequenceGenerator(
            name = "role_sequence",
            sequenceName = "role_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "role_sequence"
    )
    private Long id;
    private String name;
    private Boolean readRole;
    private Boolean createRole;
    private Boolean updateRole;
    private Boolean deleteRole;

    public Role() {
    }

    public Role(Long id,
                String name,
                boolean readRole,
                boolean createRole,
                boolean updateRole,
                boolean deleteRole) {
        this.id = id;
        this.name = name;
        this.readRole = readRole;
        this.createRole = createRole;
        this.updateRole = updateRole;
        this.deleteRole = deleteRole;
    }

    public Role(String name,
                boolean readRole,
                boolean createRole,
                boolean updateRole,
                boolean deleteRole) {
        this.name = name;
        this.readRole = readRole;
        this.createRole = createRole;
        this.updateRole = updateRole;
        this.deleteRole = deleteRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReadRole() {
        return readRole;
    }

    public void setReadRole(boolean readRole) {
        this.readRole = readRole;
    }

    public boolean isCreateRole() {
        return createRole;
    }

    public void setCreateRole(boolean createRole) {
        this.createRole = createRole;
    }

    public boolean isUpdateRole() {
        return updateRole;
    }

    public void setUpdateRole(boolean updateRole) {
        this.updateRole = updateRole;
    }

    public boolean isDeleteRole() {
        return deleteRole;
    }

    public void setDeleteRole(boolean deleteRole) {
        this.deleteRole = deleteRole;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", readRole=" + readRole +
                ", createRole=" + createRole +
                ", updateRole=" + updateRole +
                ", deleteRole=" + deleteRole +
                '}';
    }
}
