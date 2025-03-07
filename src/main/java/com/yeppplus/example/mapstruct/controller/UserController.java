package com.yeppplus.example.mapstruct.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yeppplus.example.mapstruct.dto.UserDTO;
import com.yeppplus.example.mapstruct.service.UserService;

/**
 * User 정보를 제공하는 컨트롤러
 */
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * /users/dto 엔드포인트에서 UserDTO를 반환
     */
    @GetMapping("/dto")
    public UserDTO getUserDTO() {
        return userService.getUser();
    }
}