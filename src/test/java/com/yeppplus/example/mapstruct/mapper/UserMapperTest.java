package com.yeppplus.example.mapstruct.mapper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.yeppplus.example.mapstruct.dto.UserDTO;
import com.yeppplus.example.mapstruct.entity.User;

/**
 * UserMapper의 매핑 기능을 검증하는 테스트
 */
class UserMapperTest {

    @Test
    void userToUserDTO() {
        // 테스트용 User 엔티티 생성
        User user = new User();
        user.setId(1L);
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");

        // User -> UserDTO 변환
        UserDTO userDTO = UserMapper.INSTANCE.userToUserDTO(user);

        // 변환 결과 검증
        assertNotNull(userDTO);
        assertEquals(user.getName(), userDTO.getName());
        assertEquals(user.getEmail(), userDTO.getEmail());
    }
}