package br.com.wildrimak.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class PostgreSQLData {
	
	private String databaseName = "banco";
	private String databaseHost = "Localhost";
	private String databaseUser = "postgres";

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public String getDatabaseHost() {
		return databaseHost;
	}

	public void setDatabaseHost(String databaseHost) {
		this.databaseHost = databaseHost;
	}

	public String getDatabaseUser() {
		return databaseUser;
	}

	public void setDatabaseUser(String databaseUser) {
		this.databaseUser = databaseUser;
	}
}
