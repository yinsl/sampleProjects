package com.test.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import com.test.kafka.channel.ReceiveShopChannel;
import com.test.kafka.constant.KafkaConstants;

@SpringBootApplication
@EnableBinding(ReceiveShopChannel.class)
public class KfkConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KfkConsumerApplication.class, args);
	}
	
	@StreamListener(KafkaConstants.SHOP_CHANNEL)
	public void receive(byte[] msg) {
		System.out.println(new String(msg));
	}
	
}
