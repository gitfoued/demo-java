package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.querydsl.QSort;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class MyFirstService {
    @Value("${variable}")
    private String valueFromAnotherFile;

    private final MyFirstComponent myFirstComponent;
  private Environment environment;
    public MyFirstService(
           @Qualifier("bean1") MyFirstComponent myFirstComponent) {
        this.myFirstComponent = myFirstComponent;
    }

    public String tellAStory(){
        return "Hello from the other "+myFirstComponent.sayHello();
    }
    @Autowired

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
    public String getJavaVersion(){
        return environment.getProperty("java.version");
    }
    public String getValueFromFile(){
        return valueFromAnotherFile;
    }
}
