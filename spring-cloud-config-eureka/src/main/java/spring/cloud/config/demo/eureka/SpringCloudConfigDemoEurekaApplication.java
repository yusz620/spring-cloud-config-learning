package spring.cloud.config.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient
@RestController
public class SpringCloudConfigDemoEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigDemoEurekaApplication.class, args);
    }
}
