package model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.CommentService;

@Configuration
@ComponentScan(basePackages = {"service","repositories"})
public class ProjectConfig {
//    @Bean
//    public CommentService commentService(){
//        return new CommentService();
//    }

}
