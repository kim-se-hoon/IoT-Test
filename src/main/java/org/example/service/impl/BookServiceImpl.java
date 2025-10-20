package org.example.service.impl;

import org.example.repository.BookRepository;
import org.example.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public ResponseDto<BookResponseDto> createBook(BookCreateRequestDto dto) {
        try {
            C_Book newBook = new C_Book(
                    null, dto.getWriter(), dto.getTitle(), dto.getContent(), dto.getCategory()
            );

            C_Book savedBook = bookRepository.save(newBook);

            return ResponseDto.setSuccess("책이 생성되었습니다.", toResponse(savedBook));

        } catch (Exception e) {
            return ResponseDto.setFailed("책 등록 중 문제가 발생하였습니다: " + e.getMessage());
        }
    }
}
