package org.gradle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TallerDeSoporte {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("/context.xml");
		Ingeniero ingeniero = (Ingeniero) applicationContext.getBean("ingeniero");
		
		/*Herramienta herramienta = new Desarmador();
		 * ingeniero.setHerramienta(herramienta);
		Ingeniero ingeniero= new Ingeniero();*/
		
		Computadora computadora = new Computadora();
		ingeniero.reparar(computadora);
	}

}
