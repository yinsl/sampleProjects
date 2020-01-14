package com.test.kafka.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import com.test.kafka.channel.ReceiveShopChannel;
import com.test.kafka.constant.KafkaConstants;

@EnableBinding(ReceiveShopChannel.class)
public class Consumer {
	
	@StreamListener(KafkaConstants.SHOP_CHANNEL)
	public void receive(byte[] msg) {
		System.out.println(new String(msg));
	}

}
