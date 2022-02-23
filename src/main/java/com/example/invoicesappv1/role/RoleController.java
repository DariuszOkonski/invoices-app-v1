package com.example.invoicesappv1.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

	@PostMapping
	public void addRole(@RequestBody Role role) {
		this.roleService.addRole(role);
	}

	@DeleteMapping(path = "{id}")
	public void deleteRole(@PathVariable("id") Long id) {
		this.roleService.deleteRole(id);
	}
}
