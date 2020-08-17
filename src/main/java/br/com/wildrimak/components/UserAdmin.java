package br.com.wildrimak.components;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("admin")
public class UserAdmin implements UserCurrent {

	public UserAdmin() {
		System.out.println("\nEu sou o user admin\n");
	}

	@Override
	public String getName() {
		return "Wildrimak Pereira";
	}

	@Override
	public String getAge() {
		return "23";
	}

	@Override
	public String getRole() {
		return "Admin";
	}

}
