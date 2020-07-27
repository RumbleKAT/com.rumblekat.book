package com.rumblekat.book.springboot.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum  Role {
    GUEST("ROLE_GUEST","손님"),
    USER("ROLE_USER","일반 사용자"); //스프링 시큐리티에서 권한코드에 항상 role이 있어야됨
    
    private final String key;
    private final String title;
}
