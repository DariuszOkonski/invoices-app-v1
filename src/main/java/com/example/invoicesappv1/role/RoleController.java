package com.example.invoicesappv1.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/roles")
public class RoleController {

	private final RoleService roleService;

	@Autowired
	public RoleController(RoleService roleService) {
		this.roleService = roleService;
	}

	@GetMapping
	public List<Role> getRoles() {
		return this.roleService.getRoles();
	}

	@GetMapping(path = "{id}")
	public Optional<Role> getRole(@PathVariable("id") Long id) {
		return this.roleService.getRole(id);
	}

	@PostMapping
	public void addRole(@RequestBody Role role) {
		this.roleService.addRole(role);
	}

	@PutMapping(path = "{id}")
	public void updateRole(
			@PathVariable("id") Long id,
			@RequestParam(required = false) String name,
			@RequestParam(required = false) Boolean readRole,
			@RequestParam(required = false) Boolean createRole,
			@RequestParam(required = false) Boolean updateRole,
			@RequestParam(required = false) Boolean deleteRole
	) {
		this.roleService.updateRole(id, name, readRole, createRole, updateRole, deleteRole);
	}

	@DeleteMapping(path = "{id}")
	public void deleteRole(@PathVariable("id") Long id) {
		this.roleService.deleteRole(id);
	}
}
