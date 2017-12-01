package spring.cloud.config.demo.clienta.configcontroller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan(basePackages = {"spring.cloud.config.demo.*"})
@EnableAutoConfiguration
@SpringBootApplication
@RestController
// @EnableEurekaClient
@EnableEurekaServer
public class SpringCloudConfigDemoClientAApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigDemoClientAApplication.class, args);
    }
}
