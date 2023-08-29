package com.example.thithuchanh2.model.dto;

import com.example.thithuchanh2.model.Author;
import com.example.thithuchanh2.model.Category;
import com.example.thithuchanh2.model.Type;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private String title;
    private String publishDate;
    private String description;
    private String price;

    private AuthorDTO author;

    private CategoryDTO category;

    private String type;
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AuthorDTO{
        private String id;
    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CategoryDTO{
        private String id;
    }
}
