package com.example.thithuchanh2.service;

import com.example.thithuchanh2.model.Book;
import com.example.thithuchanh2.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    public List<Book> findAll(String search){
        return bookRepository.findAllByTitleContainingOrDescriptionContaining(search,search);
    }
}
