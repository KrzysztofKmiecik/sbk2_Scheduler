package pl.kmiecik.sbk2_scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

@Component
public class HelloScheduler {

    /**
     * https://docs.oracle.com/cd/E12058_01/doc/doc.1014/e12030/cron_expressions.htm
     * https://www.freeformatter.com/cron-expression-generator-quartz.html
     * https://crontab.guru
     */


 //   @Scheduled(fixedDelay = 1000)
    @Schedules({@Scheduled(fixedDelay = 1000),
    @Scheduled(cron ="0 0 12 * * ?" )})
    public void sayHello(){
        System.out.println("Hello");
    }

}
