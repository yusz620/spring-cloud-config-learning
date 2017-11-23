package spring.cloud.config.demo.clienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class SpringCloudConfigDemoClientAApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigDemoClientAApplication.class, args);
    }
}
