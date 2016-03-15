package com.xyy.boot.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
	 private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	    @Scheduled(fixedRate = 5000)
	    public void reportCurrentTime() {
	    	try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        System.out.println("The time is now " + dateFormat.format(new Date()));
	    }
}
