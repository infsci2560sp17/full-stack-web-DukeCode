package edu.infsci2560;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.infsci2560.models.Account;
import edu.infsci2560.models.Account.AccountType;
import edu.infsci2560.repositories.AccountRepository;
import edu.infsci2560.models.Analysis;
import edu.infsci2560.models.Analysis.AnalysisType;
import edu.infsci2560.repositories.AnalysisRepository;
import edu.infsci2560.models.SharedBook;
import edu.infsci2560.models.SharedBook.BookStatus;
import edu.infsci2560.repositories.SharedBooksRepository;
import edu.infsci2560.models.BookComment;
import edu.infsci2560.models.BookComment.BookRate;
import edu.infsci2560.repositories.BookCommentsRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"edu.infsci2560"})
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
    	ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);
    	
        AccountRepository repository = ctx.getBean(AccountRepository.class);
        repository.save(new Account(1L, 1000, "BOA", AccountType.Deposit));
        repository.save(new Account(2L, 500, "PNC", AccountType.Deposit));
        repository.save(new Account(3L, 30000, "Cash Flow", AccountType.Cash));

        AnalysisRepository repository2 = ctx.getBean(AnalysisRepository.class);
        repository2.save(new Analysis(1L, AnalysisType.Stock, "Apple will increase by 5%."));
        repository2.save(new Analysis(2L, AnalysisType.Stock, "Microsoft will be the champion."));
        repository2.save(new Analysis(3L, AnalysisType.Stock, "Blackberry is breaking up"));

        SharedBooksRepository repository3 = ctx.getBean(SharedBooksRepository.class);
        repository3.save(new SharedBook(1L, "Future Finance", "Jack Danny","1.2", BookStatus.Available));
        repository3.save(new SharedBook(2L, "Modern Economics", "David France","1.1", BookStatus.Exchanged));
        repository3.save(new SharedBook(3L, "Financial Risks", "Kate Baron", "1.2", BookStatus.NotFinishYet));

        BookCommentsRepository repository4 = ctx.getBean(BookCommentsRepository.class);
        repository4.save(new BookComment(1L,"Future Finance", "Jack Danny","1.2", BookRate.Average, "Just so so."));
        repository4.save(new BookComment(2L, "Modern Economics", "David France","1.1", BookRate.Bad, "Really bad."));
        repository4.save(new BookComment(3L, "Financial Risks", "Kate Baron", "1.2", BookRate.FinancialLegend, "Like it."));
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
