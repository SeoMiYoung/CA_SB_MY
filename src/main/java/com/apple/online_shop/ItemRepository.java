package com.apple.online_shop;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
    // 내부적으로 ItemRepository 클래스 생성됨

}
