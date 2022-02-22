package com.example.invoicesappv1.role;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/roles")
public class RoleController {

    @GetMapping
	public List<Role> getRoles() {
		return List.of(
				new Role(1L, "admin"),
				new Role(2L, "user"),
				new Role(3L, "guest")
		);
	}
}
