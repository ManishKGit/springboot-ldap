package com.security.ldap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

	@RequestMapping("/")
	public String getIndex() {
		return "Hello Spring !!!";
	}
}
