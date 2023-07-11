package com.apache.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfigTopic {

	@Bean
	public NewTopic topicOne() {
		
		return TopicBuilder.name("springTopic")    // here only we can create partitions by .partitions(value)
				.build();
	}
}
