package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "borrowLog")
@Getter
@NoArgsConstructor
public class BorrowLog {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
}
