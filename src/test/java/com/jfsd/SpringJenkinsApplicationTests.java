package com.jfsd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	
	 public static  final Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing..");
		logger.info("Test case executing111..");
		logger.info("Test case executing222..");
		logger.info("Test case executing333..");
		logger.info("Test case executing444..");
		logger.info("Test case executing555..");
		assertEquals(true, true);
	}

}
