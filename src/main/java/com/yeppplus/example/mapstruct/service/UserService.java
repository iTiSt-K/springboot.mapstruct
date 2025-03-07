package com.yeppplus.example.mapstruct.service;

import org.springframework.stereotype.Service;

import com.yeppplus.example.mapstruct.dto.UserDTO;
import com.yeppplus.example.mapstruct.entity.User;
import com.yeppplus.example.mapstruct.mapper.UserMapper;

/**
 * User 데이터를 처리하는 서비스 클래스
 */
@Service
public class UserService {

    /**
     * User 엔티티를 생성하고, UserDTO로 변환하여 반환
     */
    public UserDTO getUser() {
        User user = new User();
        user.setId(1L);
        user.setName("yeppplus");
        user.setEmail("yeppplus@example.com");

        // User 엔티티를 UserDTO로 변환
        return UserMapper.INSTANCE.userToUserDTO(user);
    }
}