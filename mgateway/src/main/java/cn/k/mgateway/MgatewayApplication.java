package cn.k.mgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MgatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MgatewayApplication.class, args);
    }

}
