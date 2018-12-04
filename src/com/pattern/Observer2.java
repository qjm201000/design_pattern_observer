package com.pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * 订阅者2
 */
public class Observer2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("订阅者2，收到订阅号的通知");
        Article article = (Article)arg;
        System.out.println("标题："+article.getArticleTitle()+",内容："+article.getArticleContent());
    }
}
