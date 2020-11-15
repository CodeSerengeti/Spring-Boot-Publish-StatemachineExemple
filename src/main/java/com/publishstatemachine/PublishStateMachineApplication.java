package com.publishstatemachine;

import com.publishstatemachine.command.StartupRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PublishStateMachineApplication {

    @Bean
    public StartupRunner startupRunner() {
        return new StartupRunner();
    }

    public static void main(String[] args) {
        SpringApplication.run(PublishStateMachineApplication.class, args);
    }

}
