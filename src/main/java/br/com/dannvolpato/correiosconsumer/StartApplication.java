package br.com.dannvolpato.correiosconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.time.ZoneOffset;
import java.util.TimeZone;

@SpringBootApplication
@EnableFeignClients
public class StartApplication {

	public static void main(String[] args) {

		TimeZone.setDefault(TimeZone.getTimeZone(ZoneOffset.UTC));
		SpringApplication.run(StartApplication.class, args);
	}
}