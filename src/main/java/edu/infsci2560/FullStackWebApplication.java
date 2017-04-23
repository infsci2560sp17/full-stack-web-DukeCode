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

        AnalysisRepository Arepository = ctx.getBean(AnalysisRepository.class);
        Arepository.save(new Analysis(1L, AnalysisType.Stock, "Apple will increase by 5%."));
        Arepository.save(new Analysis(2L, AnalysisType.Stock, "Microsoft will be the champion."));
        Arepository.save(new Analysis(3L, AnalysisType.Stock, "Blackberry is breaking up"));

        SharedBooksRepository Srepository = ctx.getBean(SharedBooksRepository.class);
        Srepository.save(new SharedBook(1L, "Future Finance", "Jack Danny","1.2", BookStatus.Available));
        Srepository.save(new SharedBook(2L, "Modern Economics", "David France","1.1", BookStatus.Exchanged));
        Srepository.save(new SharedBook(3L, "Financial Risks", "Kate Baron", "1.2", BookStatus.NotFinishYet));

        BookCommentsRepository Brepository = ctx.getBean(BookCommentsRepository.class);
        Brepository.save(new BookComment(1L,"Future Finance", "Jack Danny","1.2", BookRate.Average, "Just so so."));
        Brepository.save(new BookComment(2L, "Modern Economics", "David France","1.1", BookRate.Bad, "Really bad."));
        Brepository.save(new BookComment(3L, "Financial Risks", "Kate Baron", "1.2", BookRate.FinancialLegend, "Like it."));
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
