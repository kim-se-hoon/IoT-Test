package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/borrow")
@RequiredArgsConstructor
public class BorrowController {
    private BorrowController borrowController;
}
