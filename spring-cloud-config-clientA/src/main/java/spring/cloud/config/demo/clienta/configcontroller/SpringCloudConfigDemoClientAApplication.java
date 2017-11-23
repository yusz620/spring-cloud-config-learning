package spring.cloud.config.demo.clienta.configcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@RestController
public class SpringCloudConfigDemoClientAApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigDemoClientAApplication.class, args);
    }
}
