package com.test.kafka;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.kafka.controller.SendMessageController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={KfkProducerApplication.class,KafkaProducerTest.class})
public class KafkaProducerTest {
	
	@Resource
	SendMessageController sendMessageController;
	
	@Test
	public void sendMsgTest() {
		String result = sendMessageController.sendMsg("aaaaa" + System.currentTimeMillis());
		Assert.assertEquals(result, "true");
	}

}
