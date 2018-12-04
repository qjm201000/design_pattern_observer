package com.pattern;

import java.util.Observable;

/**
 * 订阅号
 */
public class subscibe extends Observable {
    /**
     * 新增文章
     */
    public void insertArticle(Article article){
        //新增一篇文章
        System.out.println("新增一篇文章");
        this.setChanged();//观察者模式标记已更改
        this.notifyObservers(article);//告诉订阅者，这边的通知是依次通知
    }

}
