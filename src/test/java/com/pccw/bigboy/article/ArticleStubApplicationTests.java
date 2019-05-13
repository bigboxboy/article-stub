package com.pccw.bigboy.article;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pccw.bigboy.article.service.ArticleService;
import com.pccw.bigboy.article.vo.ArticleChapterVO;
import com.pccw.bigboy.article.vo.ArticleVO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleStubApplicationTests {

	@Autowired
	private ArticleService articleService;

	@Test
	@Ignore
	public void testInsertArticle() {
		ArticleVO article = new ArticleVO();
		article.setAuthor("author");
		article.setCreateDate(new Date());
		article.setSourceType("sourceType");
		article.setTitle("title");
		article.setUrl("url");
		this.articleService.insertArticle(article);
	}

	@Test
	@Ignore
	public void testInsertChapter() {
		System.out.println(Integer.MAX_VALUE);
		ArticleChapterVO chapter = new ArticleChapterVO();
		chapter.setChapterTitle("chapterTitle");
		chapter.setContent("content");
		chapter.setCreateDate(new Date());
		chapter.setIndex(Integer.valueOf(4));
		ArticleVO article = new ArticleVO();
		article.setId(Integer.valueOf(6));
		this.articleService.insertChapter(article,chapter);
	}
	
	@Test
	public void testQueryArticle() {
		ArticleVO queryArticle = this.articleService.queryArticle(Integer.valueOf(1));
		System.out.println(queryArticle);
	}

}
