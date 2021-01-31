package com.sb.gw;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
		properties = {"spring.main.allow-bean-definition-overriding=true","eureka.client.enabled=false"})
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
class ApiGatewayApplicationTests {



}
