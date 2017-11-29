package spring.cloud.config.demo.model;

public class Config {
    private final String name;
    private final String value;


    public Config(String name, String value) {
        this.name = name;
        this.value = value;
    }


    public String getName() {
        return name;
    }


    public String getValue() {
        return value;
    }
}
