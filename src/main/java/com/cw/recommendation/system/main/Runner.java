package com.cw.recommendation.system.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cw.recommendation.system.config.AppConfig;
import com.cw.recommendation.system.service.application.RecommendationService;

public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		RecommendationService recommendationService = ctx.getBean(RecommendationService.class);
		System.out.println(recommendationService.recommendSubjects(1L, 1L));
		ctx.close();
	}

}
