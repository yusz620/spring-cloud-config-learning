package spring.cloud.config.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.cloud.config.demo.domain.User;
import spring.cloud.config.demo.service.UserService;

@Controller
// @EnableWebMvc
// @Configuration
// @EnableAutoConfiguration
@RequestMapping("/test")
public class TestController {
    private User user = new User();
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String getUser(ModelMap map) {
        try {
            User u = new User();
            u.setId(1l);
            this.user = this.userService.selectList(u).get(0);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        map.addAttribute("user", user);
        return "index";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
