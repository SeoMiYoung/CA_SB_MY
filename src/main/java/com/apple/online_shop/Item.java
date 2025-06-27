package com.apple.online_shop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // 테이블 만들고 싶으면... JPA에선 @Entity 클래스 만들면 자동생성됩니다.
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // id 컬럼에는 이거 붙이라고 강요함
    public Long id;  // 자동으로 증가시켜줌
    public String title;
    public Integer price;
}
