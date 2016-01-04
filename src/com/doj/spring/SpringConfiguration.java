package com.doj.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages={"com.doj.spring"})
@Import({CarMetaConfiguration.class, EngineMetaConfiguration.class})
@ImportResource({"classpath:BodyMetaConfiguration.xml","classpath:TyreMetaConfiguration.xml"})
public class SpringConfiguration {
	
	/*@Bean(name="car")
	public Car getCar(){
		return new Car();
	}*/
	//<bean id="car" class="com.doj.spring.Car"/>
}
