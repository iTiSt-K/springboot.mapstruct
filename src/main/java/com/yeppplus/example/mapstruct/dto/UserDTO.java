package com.yeppplus.example.mapstruct.dto;

import lombok.Data;

/**
 * UserDTO 클래스 (User 엔티티를 변환하여 사용)
 */
@Data
public class UserDTO {
    private String name;
    private String email;
}