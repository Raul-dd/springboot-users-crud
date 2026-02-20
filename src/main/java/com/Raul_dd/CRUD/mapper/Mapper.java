package com.Raul_dd.CRUD.mapper;

import com.Raul_dd.CRUD.dto.UserDTO;
import com.Raul_dd.CRUD.model.User;

public class Mapper {

    public static UserDTO toDTO(User user){
        if (user == null) return null;

        return UserDTO.builder()
                .id(user.getId())
                .name(user.getName())
                .username(user.getUsername())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }

}
