package com.pccw.bigboy.article.dao;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.pccw.bigboy.article.vo.ArticleChapterVO;
import com.pccw.bigboy.article.vo.ArticleVO;

@Mapper
@Resource
public interface ArticleDao {
	
	@Select("select * from article where id=#{id}")
	public ArticleVO getArticle(Integer id);

	public void insertArticle(ArticleVO article);

	public void insertChapter(@Param("arti")ArticleVO article,@Param("chapter")ArticleChapterVO chapter);
}
