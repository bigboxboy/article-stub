package com.pccw.bigboy.article.service;

import com.pccw.bigboy.article.vo.ArticleChapterVO;
import com.pccw.bigboy.article.vo.ArticleVO;

public interface ArticleService {
	
	public ArticleVO queryArticle(Integer id);

	public void insertArticle(ArticleVO article);

	public void insertChapter(ArticleVO article, ArticleChapterVO chapter);

}
