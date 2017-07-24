
package org.lyg.mainInterface;

import org.lyg.controller.RestControllerPort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAutoConfiguration
@ImportResource(locations = {"classpath:/application-context.xml"})
@ComponentScan(basePackageClasses = RestControllerPort.class)
//@SpringBootApplication(scanBasePackages={"org.lyg.delegateBean"})
//@ComponentScan(basePackageClasses = CamelControllerPort.class)
public class MainApplication{
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

}
