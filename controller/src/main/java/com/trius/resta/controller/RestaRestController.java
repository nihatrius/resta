package com.trius.resta.controller;

import com.trius.resta.User;
import com.trius.resta.dto.UserDTO;
import com.trius.resta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nihat Kızıltoprak
 */

@RestController
@RequestMapping("/")
public class RestaRestController {

    @Autowired
    private UserService userService;

    @GetMapping(value = {"/", "/login"})
    public void login() {
    }


    @GetMapping(value = "/registration")
    public void registration() {
        System.out.print("registration");
    }

    @PostMapping(value = "/registration")
    public void createNewUser(UserDTO userDTO) {
        System.out.print("registration");
    }

    public User convertToUserEnity(UserDTO userDTO) {
        User user = User.builder()
                .name(userDTO.getName())
                .lastName(userDTO.getLastName())
                .email(userDTO.getEmail())
                .isActive(Boolean.TRUE)
                .loginDate(userDTO.getLoginDate())
                .password(userDTO.getPassword())
                .userName(userDTO.getUserName())
                .build();
        return user;
    }
}
