package com.exceeddata.vcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DeviceServiceApplication {
    @RestController
    class HelloworldController {
        @GetMapping("/helle")
        String hello() {
            return "Hello Tekton 122211";
        }
    }
    public static void main(String[] args) {
        SpringApplication.run(DeviceServiceApplication.class, args);
    }

}
