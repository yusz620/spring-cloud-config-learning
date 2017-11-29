package spring.cloud.config.demo.clientb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudConfigDemoClientBApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigDemoClientBApplication.class, args);
    }
}
