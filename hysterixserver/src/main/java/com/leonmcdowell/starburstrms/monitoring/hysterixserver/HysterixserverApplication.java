package com.leonmcdowell.starburstrms.monitoring.hysterixserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class HysterixserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(HysterixserverApplication.class, args);
	}
}
