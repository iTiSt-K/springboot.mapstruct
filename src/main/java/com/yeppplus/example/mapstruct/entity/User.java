package com.yeppplus.example.mapstruct.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * User 엔티티 클래스
 */
@Getter
@Setter
public class User {
    private Long id;
    private String name;
    private String email;
}