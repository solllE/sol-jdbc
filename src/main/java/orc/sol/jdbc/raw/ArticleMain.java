package orc.sol.jdbc.raw;

import java.util.List;

import orc.sol.jdbc.template.ArticleDaoImplUsingTemplate;

public class ArticleMain {
	ArticleDao articleDao = new ArticleDaoImplUsingTemplate();
	
	public static void main(String[] args) {
		new ArticleMain().listArticles();
	}
	
	public void listArticles() {
		List<Article> articles = articleDao.listArticles();
		System.out.println(articles);
	}
	
	public void getArticle() {
        Article article = articleDao.getArticle("2");
        System.out.println(article);
    }

    public void addArticle() {
        Article article = new Article();
        article.setTitle("This is title.");
        article.setContent("This is content");
        article.setUserId("10");
        article.setName("Sol E");
        articleDao.addArticle(article);
    }

    public void updateArticle() {
        Article article = new Article();
        article.setArticleId("3");
        article.setTitle("wow");
        article.setContent("This is modified content");
        articleDao.updateArticle(article);
    }

    public void deleteArticle() {
        articleDao.deleteArticle("2");
}
}