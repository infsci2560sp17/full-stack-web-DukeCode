package edu.infsci2560;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("land");
        registry.addViewController("/allAnalysis").setViewName("analysis");
        registry.addViewController("/allBookComments").setViewName("bookComments");
        registry.addViewController("/books").setViewName("books");
        registry.addViewController("/allSharedBooks").setViewName("sharedBooks");
        registry.addViewController("/accounts").setViewName("accounts");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/files").setViewName("uploadForm");
    }

}