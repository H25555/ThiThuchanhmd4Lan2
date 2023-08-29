package com.example.thithuchanh2.service;

import com.example.thithuchanh2.model.Author;
import com.example.thithuchanh2.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;
    public List<Author> findAll(){
        return authorRepository.findAll();
    }
}
