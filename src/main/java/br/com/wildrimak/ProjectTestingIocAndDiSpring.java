package br.com.wildrimak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.wildrimak.configuration.MyData;
import br.com.wildrimak.configuration.PostgreSQLData;

@SpringBootApplication
public class ProjectTestingIocAndDiSpring {

	public static void main(String[] args) {

		SpringApplication.run(ProjectTestingIocAndDiSpring.class, args);

		// Dizendo para o spring injentar essas dependencias para mim
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyData.class, PostgreSQLData.class);
		MyData myData = ctx.getBean(MyData.class);

		System.out.println(myData.myName());
		System.out.println(myData.myHost());
		System.out.println(myData.myUser());

		((ConfigurableApplicationContext) ctx).close();
	}

}
