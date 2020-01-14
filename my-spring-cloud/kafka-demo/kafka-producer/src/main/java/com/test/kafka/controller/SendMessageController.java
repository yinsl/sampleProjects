package com.test.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.kafka.channel.SendShopChannel;

@RestController
public class SendMessageController {
	
	@Autowired
	private SendShopChannel sendShopChannel;
	
	@RequestMapping("/sendMsg")
	public String sendMsg(String msg) {
		Message<byte[]> build = MessageBuilder.withPayload(msg.getBytes()).build();
		Boolean b = sendShopChannel.sendShopMessage().send(build);
		return b.toString();
	}

}
