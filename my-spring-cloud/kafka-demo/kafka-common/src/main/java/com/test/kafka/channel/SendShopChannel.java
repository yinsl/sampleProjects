package com.test.kafka.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

import com.test.kafka.constant.KafkaConstants;

public interface SendShopChannel {
	
	/**
	 * 发送消息的通道
	 *
	 * @return
	 */
	@Output(value=KafkaConstants.SHOP_CHANNEL)
	MessageChannel sendShopMessage();

}
