package com.test.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.test.kafka.channel.SendShopChannel;

@SpringBootApplication
@EnableBinding(SendShopChannel.class)
public class KfkProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KfkProducerApplication.class, args);
	}
	
}
