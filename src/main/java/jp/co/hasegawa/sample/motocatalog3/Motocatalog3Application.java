package jp.co.hasegawa.sample.motocatalog3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("jp.co.hasegawa.sample.motocatalog3.mappers")
public class Motocatalog3Application {

	public static void main(String[] args) {
		SpringApplication.run(Motocatalog3Application.class, args);
	}

}
