package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.service.MemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/id")
@RequiredArgsConstructor
public class MemberController {
    public final MemberService memberService;
}

