package com.apple.online_shop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.ToString;

@Entity // 테이블 만들고 싶으면... JPA에선 @Entity 클래스 만들면 자동생성됩니다.
@ToString
@Getter
public class BasicInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id 컬럼에는 이거 붙이라고 강요함
    public Long id;  // 자동으로 증가시켜줌

    private String name;
    private Integer age;

    // ✅ 기본 생성자 (JPA용)
    public BasicInfo() {
        // JPA가 프록시 생성 시 기본 생성자가 필요하므로 꼭 남겨둬야 함.
    }

    // ✅ name, age를 초기화하는 생성자
    public BasicInfo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void incrementAge() {
        if (this.age < 99) {
            this.age = this.age + 1;
        }
    }

    public void changeAge(Integer age) {
        if (age > 0 && age < 100) {
            this.age = age;
        }
    }
}


