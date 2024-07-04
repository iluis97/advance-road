package cn.luis.spring.boot.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootSource {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootSource.class, args);
    }

}
