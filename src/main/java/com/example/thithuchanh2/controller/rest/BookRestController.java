package com.example.thithuchanh2.controller.rest;

import com.example.thithuchanh2.model.Book;
import com.example.thithuchanh2.model.dto.BookDTO;
import com.example.thithuchanh2.repository.BookRepository;
import com.example.thithuchanh2.service.BookService;
import com.example.thithuchanh2.ulti.AppUtils;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@AllArgsConstructor
public class BookRestController {
    private final BookService BookService;
    private final BookRepository bookRepository;
    @GetMapping
    public ResponseEntity<?> findAllBook(@RequestParam(defaultValue = "") String search){
        List<Book> books = BookService.findAll(search);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
    @PostMapping("/create")
    public void create(@RequestBody BookDTO bookDTO){
        Book book = AppUtils.mapper.map(bookDTO, Book.class);
        bookRepository.save(book);
    }
    @GetMapping("/del/{id}")
    public void delete(@PathVariable Long id){
        Book book = bookRepository.findById(id).get();
        bookRepository.delete(book);
    }
    @GetMapping("/{id}")
    public Book findById(@PathVariable Long id){
        return bookRepository.findById(id).get();
    }
    @PostMapping("/update/{id}")
    public void update(@PathVariable Long id, @RequestBody BookDTO bookDTO){
        Book book = AppUtils.mapper.map(bookDTO, Book.class);
        book.setId(id);
        bookRepository.save(book);
    }
}
