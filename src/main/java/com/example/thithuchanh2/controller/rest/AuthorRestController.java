package com.example.thithuchanh2.controller.rest;

import com.example.thithuchanh2.model.Author;
import com.example.thithuchanh2.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
@AllArgsConstructor
public class AuthorRestController {
    private final AuthorService authorService;
    @GetMapping
    public ResponseEntity<?> findAllAuthor(){
        List<Author> authors = authorService.findAll();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }
}
