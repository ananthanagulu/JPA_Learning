package com.sixdee.imp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class BandwidthProcessorRedis1Application {

	public static void main(String[] args) {
		SpringApplication.run(BandwidthProcessorRedis1Application.class, args);
	} 

}
