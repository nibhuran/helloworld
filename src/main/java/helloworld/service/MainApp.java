package helloworld.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ImportResource("classpath:*/applicationContext.xml")
@EnableAsync
public class MainApp {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(MainApp.class);
        springApplication.run(args);
    }
}
