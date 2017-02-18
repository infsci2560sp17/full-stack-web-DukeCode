package edu.infsci2560;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.infsci2560.models.Account;
import edu.infsci2560.models.Account.AccountType;
import edu.infsci2560.repositories.AccountRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);
        AccountRepository repository = ctx.getBean(AccountRepository.class);
        repository.save(new Account(1L, 1000, "BOA", AccountType.Deposit));
        repository.save(new Account(2L, 500, "PNC", AccountType.Check));
        repository.save(new Account(3L, 30000, "Cash Flow", AccountType.Cash));
    }
}
//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }
