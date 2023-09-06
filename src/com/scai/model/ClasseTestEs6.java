package com.scai.model;

public class ClasseTestEs6 {

    private int id;
    private String content;

    public ClasseTestEs6(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public ClasseTestEs6() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ClasseTestEs6{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
