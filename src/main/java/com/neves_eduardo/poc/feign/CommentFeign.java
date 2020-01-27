package com.neves_eduardo.poc.feign;

import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface CommentFeign {
    @RequestLine("GET /comments/{id}")
    Comment comment(@Param("id") int id);

    @RequestLine("GET /comments")
    List<Comment> comments();
}
