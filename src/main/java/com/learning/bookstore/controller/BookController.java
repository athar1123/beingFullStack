package com.learning.bookstore.controller;


import com.learning.bookstore.entity.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @GetMapping("/books")
    public ResponseEntity<List<BookDto>>  getBooks(){

        BookDto book = BookDto.builder()
                .title("Book number 1")
                .build();

        List <BookDto> bookList = new ArrayList<>();
        bookList.add(book);

        return  ResponseEntity.ok(bookList) ;
    }
}
