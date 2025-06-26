package com.apple.online_shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @GetMapping("/") // 누가 메인페이지에 접속하면
    @ResponseBody
    String hello() {
        return "안녕하세요~ 기본 페이지 입니다."; // "안녕하세요" 띄우기
    }

    @GetMapping("/about")
    @ResponseBody
    String about() {
        return "상세 페이지 입니다.";
    }

    @GetMapping("/mypage")
    @ResponseBody
    String mypage() {
        return "마이페이지 입니다.";
    }
}
