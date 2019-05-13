package com.pccw.bigboy.article.vo;

import java.util.Date;

public class ArticleChapterVO {

	private ArticleVO article;

	private String content;

	private String chapterTitle;

	private Integer index;
	
	private Date createDate;

	public ArticleVO getArticle() {
		return article;
	}

	public void setArticle(ArticleVO article) {
		this.article = article;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getChapterTitle() {
		return chapterTitle;
	}

	public void setChapterTitle(String chapterTitle) {
		this.chapterTitle = chapterTitle;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
