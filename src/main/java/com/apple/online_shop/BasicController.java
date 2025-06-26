package com.apple.online_shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @GetMapping("/") // 누가 메인페이지에 접속하면
    String hello() {
        // 기본 경로가 static 폴더임
        return "index.html"; // "안녕하세요" 띄우기
    }

    @GetMapping("/about")
    @ResponseBody // return 문자 그대로 보내주세요.
    String about() {
        return "상세 페이지 입니다.";
    }

    @GetMapping("/mypage")
    @ResponseBody
    String mypage() {
        return "마이페이지 입니다.";
    }
}
