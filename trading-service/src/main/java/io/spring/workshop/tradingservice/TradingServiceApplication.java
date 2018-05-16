package io.spring.workshop.tradingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradingServiceApplication {

	public static void main(String[] args) {
		//在你发起Http请求之前设置一下属性
//		System.setProperty("http.proxyHost", "127.0.0.1");
//		System.setProperty("http.proxyPort", "1080");
		SpringApplication.run(TradingServiceApplication.class, args);
	}
}
