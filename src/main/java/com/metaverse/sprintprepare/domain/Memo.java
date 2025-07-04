package com.metaverse.sprintprepare.domain;

import lombok.*;

//@Getter
//@Setter // 값 변경
//@NoArgsConstructor // 기본 생성자 생성 애너테이션
//@AllArgsConstructor // 모든 필드를 파라미터로 받는 생성자1
@RequiredArgsConstructor // final 필드를 필수로 가져야 하는 생성자
public class Memo {
    private final String username; //private final: 필수로 있어야 하는 것
    private String content;
    private String description;
    private final String password;
}