package frolovv.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "frolovv.pizza")
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@Slf4j
@SpringBootApplication
public class PizzaApplication {

	public static void main(String[] args) {
		log.error("start context");
		long start = System.currentTimeMillis();
		SpringApplication.run(PizzaApplication.class, args);

		long totalTime = System.currentTimeMillis() - start;
		log.error("total execution time {} ms", totalTime);
	}

}