package spring.cloud.config.demo.clienta.configcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan(basePackages = {"spring.cloud.config.demo.*"})
@EnableAutoConfiguration
@SpringBootApplication
@RestController
@EnableEurekaClient
public class SpringCloudConfigDemoClientAApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigDemoClientAApplication.class, args);
    }
}
