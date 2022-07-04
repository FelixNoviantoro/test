package com.company.springsecurityjdbc.dto;

import com.company.springsecurityjdbc.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UserDto {

    @Data
    public static class RoleToUserForm {
        private String username;
        private String roleName;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Saveuser{
        private User user;
    }

}
