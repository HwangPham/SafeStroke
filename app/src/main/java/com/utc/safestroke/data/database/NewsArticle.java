package com.utc.safestroke.data.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class NewsArticle {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String title;
    public String author;
    public String publishedAt; // Thời gian đăng bài
    public String content;
    public String imageUrl; // URL của ảnh bài viết

    public NewsArticle(String title, String author, String publishedAt, String content, String imageUrl) {
        this.title = title;
        this.author = author;
        this.publishedAt = publishedAt;
        this.content = content;
        this.imageUrl = imageUrl;
    }
}
