package com.lec.spring.domain;

import com.lec.spring.domain.shop.Address;
import com.lec.spring.domain.shop.Authority;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private Integer id;
    private String username;
    private String password;
    private LocalDateTime regdate;
    private String name;
    private String phone;
    private String birth;
    private String email;
    private Integer gender;
    private String profileimage;
    private String grade;
    private Integer total_price;
    private Integer point;

    private Address address;

    // 유저의 권한 리스트
    private List<Authority> authorities;

    // 활성/비활성 상태를 나타내는 필드
    private boolean status = true;
}