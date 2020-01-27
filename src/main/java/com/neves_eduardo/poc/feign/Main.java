package com.neves_eduardo.poc.feign;

import feign.Feign;
import feign.gson.GsonDecoder;

public class Main {
    public static void main(String[] args) {
        CommentFeign commentFeign = Feign.builder()
                .decoder(new GsonDecoder())
                .target(CommentFeign.class,"https://jsonplaceholder.typicode.com/");

        System.out.println(commentFeign.comment(6));
        System.out.println(commentFeign.comments());
    }
}
