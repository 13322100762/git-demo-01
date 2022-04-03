package com.lagou;

import com.lagou.config.EnableRegisterServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication//标注在类上说明这个类是`SpringBoot`的主配置类
//@EnableRegisterServer
public class SpringBootMytestApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMytestApplication.class, args);
		System.out.println("------------11111111111");

        System.out.println("------------22222222222");

		System.out.println("------------33333333");

		System.out.println("------------444444444----");

        System.out.println("------------5555555555----");
	}

/*	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// 这里要指向核心启动类
		return builder.sources(SpringBootMytestApplication.class);
	}*/
}
