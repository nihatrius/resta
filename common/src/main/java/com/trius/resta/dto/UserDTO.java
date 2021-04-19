package com.trius.resta.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class UserDTO {

    private String name ;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private Date loginDate;

}
