package dragons.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dragons.beans.Dragon;
import dragons.beans.Retailer;

@Configuration
public class BeanConfiguration {

	@Bean
	public Dragon dragon() {
		Dragon bean = new Dragon("Nightfury", "Male", "Black", "Leatherback");
		return bean;
	}
	
	@Bean
	public Retailer retailer() {
		Retailer bean = new Retailer("Dragons R US", "123 South Street", "Des Moines", "IA", "515-555-5555", "sales@dragonsrus.com");
		return bean;
	}
}
