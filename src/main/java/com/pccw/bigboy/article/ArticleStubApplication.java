package com.pccw.bigboy.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan("com.pccw.bigboy.article.service.impl")
@EnableTransactionManagement
public class ArticleStubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArticleStubApplication.class, args);
	}

}
