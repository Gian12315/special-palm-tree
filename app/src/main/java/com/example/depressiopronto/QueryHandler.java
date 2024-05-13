package com.example.depressiopronto;

import java.net.URLEncoder;

public class QueryHandler {
    private static final String prompt = "You are a counselor, and you're tasked to give emotional support to everyone, " +
            "you are comprehensive, understanding, and caring, and suggest professional help and always answer " +
            "in Spanish and never, never never translate to English, considering your role answer to the following prompt :";

    private String url;

    public QueryHandler(String url) {
        this.url = url;
    }

    public String constructURL(String query) {
        return url + "?query=" + (prompt + URLEncoder.encode(query));
    }


}
