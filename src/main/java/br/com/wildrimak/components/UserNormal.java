package br.com.wildrimak.components;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("normal")
public class UserNormal implements UserCurrent {

	
	public UserNormal() {
		System.out.println("\nEu sou o user normal\n");
	}
	@Override
	public String getName() {
		return "Jorge Oliveira";
	}

	@Override
	public String getAge() {
		return "42";
	}

	@Override
	public String getRole() {
		return "Normal";
	}

}
