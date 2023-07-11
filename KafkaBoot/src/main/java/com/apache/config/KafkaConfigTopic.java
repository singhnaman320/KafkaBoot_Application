package com.apache.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfigTopic {

	public NewTopic topicOne() {
		
		return TopicBuilder.name("springTopic")
				.build();
	}
}
