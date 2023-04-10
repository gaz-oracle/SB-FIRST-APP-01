package com.gaz.app.firstApp01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstApp01Application {

	@Bean
	public HelloSpring spring(){
		return new HelloSpring();
	}

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(FirstApp01Application.class, args);
		HelloSpring beanspring = applicationContext.getBean(HelloSpring.class);
		System.out.println(beanspring.helloSpring());
		System.out.println("************* @Beans **************");
		String [] beanNames = applicationContext.getBeanDefinitionNames();
		for (String i:beanNames
			 ) {
			System.out.println(i);
		}


	}

}

/***
 * 1.Positive matches:Es aquello que se configura de manera automatica par nosotros.
 * 2.Negative matches: Es aquello que NO se configura de manera automatica par nosotros.
 */

/**
 * SpringApplications can read beans from a variety of different sources.
 * It is generally recommended that a single @Configuration class is used to bootstrap your application,
 * however, you may also set sources from:
 * The fully qualified class name to be loaded by AnnotatedBeanDefinitionReader
 * The location of an XML resource to be loaded by XmlBeanDefinitionReader, or a groovy script to be
 * loaded by GroovyBeanDefinitionReader
 * The name of a package to be scanned by ClassPathBeanDefinitionScanner
 */