package com.hsy.xspider;

import com.hsy.xspider.processor.snh.SnhMemberProcessor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@EnableAutoConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
public class XspiderApplicationTests {

	@Autowired
	SnhMemberProcessor snhMemberProcessor;
	@Test
	public void contextLoads() throws Exception {

		snhMemberProcessor.start(null);
	}



}

