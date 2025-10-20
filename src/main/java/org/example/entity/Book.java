package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
        name = "books",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_book_writer_title", columnNames = {"writer", "title"})
        }

)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@org.hibernate.annotations.Check(constraints = "category IN ('NOVEL', 'ESSAY', 'POEM', 'MAGAZINE') ")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String writer;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 500)
    private String content;


}
