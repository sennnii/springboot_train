package com.example.firstproject.dto;

import com.example.firstproject.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class MemberForm {
    private Long id;
    private String email;
    private String password;

    public Member toEntity() {
        return new Member(id, email, password);
    }
}
