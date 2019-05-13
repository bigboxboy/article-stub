package com.pccw.bigboy.article.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pccw.bigboy.article.dao.ArticleDao;
import com.pccw.bigboy.article.service.ArticleService;
import com.pccw.bigboy.article.vo.ArticleChapterVO;
import com.pccw.bigboy.article.vo.ArticleVO;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;

	@Override
	public void insertArticle(ArticleVO article) {
		this.articleDao.insertArticle(article);

	}

	@Override
	public void insertChapter(ArticleVO article, ArticleChapterVO chapter) {
		this.articleDao.insertChapter(article, chapter);

	}

	@Override
	public ArticleVO queryArticle(Integer id) {
		return this.articleDao.getArticle(id);
	}

}
