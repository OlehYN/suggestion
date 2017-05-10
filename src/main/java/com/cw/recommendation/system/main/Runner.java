package com.cw.recommendation.system.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cw.recommendation.system.config.AppConfig;

public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ctx.close();
	}

}
