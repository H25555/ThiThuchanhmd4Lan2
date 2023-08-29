package com.example.thithuchanh2.controller.rest;

import com.example.thithuchanh2.model.Category;
import com.example.thithuchanh2.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryRestController {
    private final CategoryService CategoryService;
    @GetMapping
    public ResponseEntity<?> findAllCategory(){
        List<Category> categories = CategoryService.findAll();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}
