package spring.cloud.config.demo.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.cloud.config.demo.model.Config;
import spring.cloud.config.demo.model.EnvironmentConfig;

@RestController
@RefreshScope
@RequestMapping("/eureka")
public class ConfigEurekaController {
    private static final String APPLICATION_NAME_CONFIG = "spring.application.name";
    private static final String ACTIVE_PROFILE_CONFIG = "spring.profiles.active";
    private static final String LABEL_CONFIG = "spring.cloud.config.label";
    private static final String CONFIG_SERVER_CONFIG = "spring.cloud.config.uri";


    @Autowired
    private Environment env;


    @Value("${profile}")
    private String profile;


    @RequestMapping(value = "/config/{configName:.*}", method = RequestMethod.GET)
    public Config queryConfig(@PathVariable String configName) {
        String configValue = env.getProperty(configName, "undefined");
        return new Config(configName, configValue);
    }


    @RequestMapping(value = "/env", method = RequestMethod.GET)
    public EnvironmentConfig queryEnv() {
        return EnvironmentConfig.builder().application(env.getProperty(APPLICATION_NAME_CONFIG)).profiles(env.getProperty(ACTIVE_PROFILE_CONFIG))
                .label(env.getProperty(LABEL_CONFIG)).serverUri(env.getProperty(CONFIG_SERVER_CONFIG)).build();
    }

    public String getProfile() {
        return profile;
    }

}
