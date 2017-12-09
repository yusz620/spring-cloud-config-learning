package spring.cloud.config.demo.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import spring.cloud.config.demo.domain.User;

@Component
public class UserLoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception exception) throws Exception {
        System.out.println("afterCompletion run!");

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle run!");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
        User user = (User) request.getAttribute("user");
        if (user == null) {
            response.sendRedirect("/login");
        }
        System.out.println("preHandle run!");
        return true;
    }

}
