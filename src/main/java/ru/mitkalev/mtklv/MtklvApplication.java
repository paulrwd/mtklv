package ru.mitkalev.mtklv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MtklvApplication {
    public static void main(String[] args) {
        SpringApplication.run(MtklvApplication.class, args);
    }
}
