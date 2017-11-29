package spring.cloud.config.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudConfigDemoEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigDemoEurekaApplication.class, args);
    }
}
