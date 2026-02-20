package com.Raul_dd.CRUD.service;

import com.Raul_dd.CRUD.dto.UserDTO;
import com.Raul_dd.CRUD.model.User;

import java.util.List;

public interface IUserService {

    List<UserDTO> getUsers();
    UserDTO createdUser(UserDTO userDTO);
    UserDTO updateUser(Long id, UserDTO userDTO);
    void deleteUser(Long id);

}
