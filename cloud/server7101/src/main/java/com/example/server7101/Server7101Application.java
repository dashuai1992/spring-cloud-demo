package com.example.server7101;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class Server7101Application {

    public static void main(String[] args) {
        SpringApplication.run(Server7101Application.class, args);
    }

    @Value("${server.port}")
    String port;
    @Value("${servername}")
    String servername;

    @RequestMapping("/hi")
    public String home(@RequestParam String name){
        return "hi "+name+", response form "+ servername +" port "+port;
    }
}
