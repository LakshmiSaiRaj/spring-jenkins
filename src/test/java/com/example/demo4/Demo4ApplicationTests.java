package com.example.demo4;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo4ApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(Demo4Application.class);
	@Test
	void contextLoads() {
		logger.info("Test case executingssss...");
	}

}
