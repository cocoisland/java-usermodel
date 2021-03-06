package com.lambdaschool.usermodel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Main class to start the application.
 */
@EnableWebMvc
@EnableJpaAuditing
@SpringBootApplication
public class UserModelApplication {

	/**
	 * Main method to start the application.
	 *
	 * @param args Not used in this application.
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(UserModelApplication.class, args);

		DispatcherServlet dispatcherServlet = (DispatcherServlet) ctx.getBean("dispatcherServlet");
		dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
	}
}
