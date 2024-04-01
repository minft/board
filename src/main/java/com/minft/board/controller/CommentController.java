package com.minft.board.controller;

import com.minft.board.dto.CommentDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CommentController {
    @PostMapping("/save")
    public String save(@ModelAttribute CommentDTO commentDTO) {
        System.out.println("commentDto = " + commentDTO);
        return "요청 성공";
    }
}
