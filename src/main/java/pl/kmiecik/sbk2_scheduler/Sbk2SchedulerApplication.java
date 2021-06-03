package pl.kmiecik.sbk2_scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Sbk2SchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sbk2SchedulerApplication.class, args);
    }

}
