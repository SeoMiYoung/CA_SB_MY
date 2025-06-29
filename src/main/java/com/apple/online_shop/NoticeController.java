package com.apple.online_shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class NoticeController {
    private final NoticeRepository noticeRepository;

    @GetMapping("/notice-list")
    String show_list(Model model) {
        List<Notice> result = noticeRepository.findAll();  // 테이블의 모든 데이터를 가져다 줌
        model.addAttribute("items", result); // items라는 이름으로 result 정보 보내기

        return "notice_list.html"; // @ResponseBody는 기본적으로 문자열 또는 JSON 형태로 응답을 보내야 함.
    }
}