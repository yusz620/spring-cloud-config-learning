package spring.cloud.config.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello/hello")
    public String index() {
        return "Hello World";
    }

}
