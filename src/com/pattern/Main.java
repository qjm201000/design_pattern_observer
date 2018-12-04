package com.pattern;

public class Main {
    public static void main(String[] args) {
        Article article = new Article();
        article.setArticleTitle("圆周率的实现");
        article.setArticleContent("圆是一个圆圈。。。");

        subscibe subject = new subscibe();//订阅号
        subject.addObserver(new Observer1());//订阅者1
        subject.addObserver(new Observer2());//订阅者2
        subject.insertArticle(article);//订阅号新增一篇文章
    }
}
