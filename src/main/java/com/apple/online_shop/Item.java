package com.apple.online_shop;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity // 테이블 만들고 싶으면... JPA에선 @Entity 클래스 만들면 자동생성됩니다.
@ToString
@Getter
@Setter
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // id 컬럼에는 이거 붙이라고 강요함
    public Long id;  // 자동으로 증가시켜줌

    private String title;
    private Integer price;

    // @ToString으로 대체 (lombok)
    //public String toString() {
        //return this.title + this.price;
    //}
}
