package icu.bleuweb.eurekaconsumerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Properties;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"icu.bleuweb.web.feign"})
public class EurekaConsumerDemoApplication {

    public static void main(String[] args) {
        args = new String[]{"hh", "a=1", "-name=9", "--option=sadj", "-o"};

//        System.setProperty("spring.cloud.bootstrap.enabled","false");
        Properties properties = System.getProperties();
        SpringApplication.run(EurekaConsumerDemoApplication.class, args);
    }

}
