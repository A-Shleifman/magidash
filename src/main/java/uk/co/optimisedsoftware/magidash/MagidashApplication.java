package uk.co.optimisedsoftware.magidash;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MagidashApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagidashApplication.class, args);
	}

//	@Bean
//	public SpringLiquibase liquibase() {
//		SpringLiquibase liquibase = new SpringLiquibase();
//		liquibase.setChangeLog("classpath:liquibase-changeLog.xml");
////		liquibase.setDataSource(dataSource());
//		return liquibase;
//	}

}
