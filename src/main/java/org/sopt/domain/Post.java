package org.sopt.domain;

public class Post {
    // 게시물을 구별하는 id
    private int id;
    private String title;
    private String content;

    // 생성자
    public Post(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // 게시물에 대한 정보를 가져오는 부분(private로 묶여있으니까)
    public int getId() {
        return this.id;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
