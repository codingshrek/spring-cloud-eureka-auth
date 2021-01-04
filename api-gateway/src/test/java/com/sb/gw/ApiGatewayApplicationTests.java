package com.sb.gw;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
		properties = {"spring.main.allow-bean-definition-overriding=true","eureka.client.enabled=false"})
class ApiGatewayApplicationTests {

	@Test
	void contextLoads() {
	}

}
