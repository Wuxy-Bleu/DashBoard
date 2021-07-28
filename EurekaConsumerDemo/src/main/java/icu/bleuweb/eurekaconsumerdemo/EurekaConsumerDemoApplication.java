package icu.bleuweb.eurekaconsumerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"icu.bleuweb.web.feign"})
public class EurekaConsumerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerDemoApplication.class, args);
    }

}
