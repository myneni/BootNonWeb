package com.walgreens.cdi.historyutility;

import com.walgreens.cdi.historyutility.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HistoryUtilityApplication implements CommandLineRunner {

    @Autowired
    private HistoryService historyService;

    @Override
    public void run(String... args) {
        System.out.println(this.historyService.getHistory());
        if (args.length > 0 && args[0].equals("-299")) {
            throw new ExitException();
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(HistoryUtilityApplication.class, args);
    }
}
