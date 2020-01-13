package com.test.kafka.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

import com.test.kafka.constant.KafkaConstants;

public interface ReceiveShopChannel {

	/**
	 * 接收消息的通道
	 *
	 * @return
	 */
	@Input(value=KafkaConstants.SHOP_CHANNEL)
	MessageChannel receieveMessage();

}
