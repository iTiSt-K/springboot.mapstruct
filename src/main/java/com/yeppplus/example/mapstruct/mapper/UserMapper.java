package com.yeppplus.example.mapstruct.mapper;

import com.yeppplus.example.mapstruct.dto.UserDTO;
import com.yeppplus.example.mapstruct.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * User 엔티티를 UserDTO로 변환하는 매퍼 인터페이스
 */
@Mapper
public interface UserMapper {
    // MapStruct가 자동 생성한 Mapper 인스턴스
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    // User 엔티티를 UserDTO로 변환하는 메서드
    @Mapping(source = "name", target = "name")
    @Mapping(source = "email", target = "email")
    UserDTO userToUserDTO(User user);
}