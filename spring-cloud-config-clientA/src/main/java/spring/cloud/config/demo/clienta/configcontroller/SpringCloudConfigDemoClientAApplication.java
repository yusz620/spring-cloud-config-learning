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
        String ip = "9.112.130.145";
        String mail = "yushiz@cn.ibm.com";
        // curl --header "X-Forwarded-For: 9.112.130.145" -X POST --data "email=yushiz@cn.ibm.com" http://9.110.168.184:8080/schedule/doLogin
        String[] cmd = {"E:\\studyspace\\curl-7.56.1-win64-mingw\\bin\\curl",
                " --header \"X-Forwarded-For: " + ip + "\" -X POST " + "--data \"email=" + mail + "\" http://9.110.168.184:8080/schedule/doLogin"};
        ProcessBuilder pb = new ProcessBuilder(cmd);
        pb.redirectErrorStream(true);
        Process p;
        try {
            p = pb.start();
            BufferedReader br = null;
            String line = null;

            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = br.readLine()) != null) {
                System.out.println("\t" + line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
