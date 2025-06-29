package com.apple.online_shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLOutput;
import java.time.ZonedDateTime;

// 상품 관련 API들 (비슷한 API들은 파일로 묶어놓는게 좋음)
@Controller
@RequiredArgsConstructor
public class ItemController {
    private final ItemRepository itemRepository;

    @GetMapping("/list")
    String show_list(Model model) {
        var result = itemRepository.findAll();  // 테이블의 모든 데이터를 가져다 줌
        System.out.println(result);
        model.addAttribute("name", "홍길동");
        return "list.html"; // @ResponseBody는 기본적으로 문자열 또는 JSON 형태로 응답을 보내야 함.
    }
}
