package org.example.service;

import org.springframework.http.ResponseEntity;

public interface BookService {


    ResponseDto<BookResponseDto> createBook(BookCreateRequestDto dto);
}
