package frolovv.pizza;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@Slf4j
@SpringBootApplication(scanBasePackages = "frolovv.pizza")
public class PizzaApplication {

	public static void main(String[] args) {
		log.error("start context");
		long start = System.currentTimeMillis();
		SpringApplication.run(PizzaApplication.class, args);

		long totalTime = System.currentTimeMillis() - start;
		log.error("total execution time {} ms", totalTime);
	}

}
