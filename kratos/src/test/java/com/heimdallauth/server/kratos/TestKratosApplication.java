package com.heimdallauth.server.kratos;

import org.springframework.boot.SpringApplication;

public class TestKratosApplication {

    public static void main(String[] args) {
        SpringApplication.from(KratosApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
