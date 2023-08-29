package com.example.thithuchanh2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate publishDate;
    private String description;
    private BigDecimal price;
    @ManyToOne
    private Author author;
    @ManyToOne
    private Category category;
    @Enumerated(EnumType.STRING)
    private Type type;
}
