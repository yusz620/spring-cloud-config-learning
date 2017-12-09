package spring.cloud.config.demo.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.cloud.config.demo.domain.User;

@Controller
public class Login {
    private User user;
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;
    // private ModelMap map = new ModelMap();

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping("/login")
    public String doLogin(@ModelAttribute User user) {
        // user = (User) model.get("user");
        if (!"andy".equalsIgnoreCase(user.getName())) {
            return "login";
        }
        return "redirect:/index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap model) {
        return "index";
    }


}
