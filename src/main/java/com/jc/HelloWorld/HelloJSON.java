package com.jc.HelloWorld;

public class HelloJSON {
    private final long id;
    private final String content;

    HelloJSON(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent(){
        return content;
    }
}
