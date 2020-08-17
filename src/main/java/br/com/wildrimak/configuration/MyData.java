package br.com.wildrimak.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyData {

	@Autowired
	PostgreSQLData data;

	public MyData() {
	}

	public String myName() {
		return data.getDatabaseName();
	}

	public String myHost() {
		return data.getDatabaseHost();
	}

	public String myUser() {
		return data.getDatabaseUser();
	}

}
