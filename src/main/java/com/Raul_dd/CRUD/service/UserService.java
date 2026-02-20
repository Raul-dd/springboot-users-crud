package com.Raul_dd.CRUD.service;

import com.Raul_dd.CRUD.dto.UserDTO;
import com.Raul_dd.CRUD.exception.NotFoundException;
import com.Raul_dd.CRUD.mapper.Mapper;
import com.Raul_dd.CRUD.model.User;
import com.Raul_dd.CRUD.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> getUsers() {
        return userRepository.findAll()
                .stream()
                .map(Mapper::toDTO)
                .toList();
    }

    @Override
    public UserDTO createdUser(UserDTO userDTO) {
        User user = User.builder()
                .id(userDTO.getId())
                .name(userDTO.getName())
                .username(userDTO.getUsername())
                .email(userDTO.getEmail())
                .password(userDTO.getPassword())
                .build();
        return Mapper.toDTO(userRepository.save(user));
    }

    @Override
    public UserDTO updateUser(Long id, UserDTO userDTO) {
        User user = userRepository.findById(id)
                .orElseThrow(()->new NotFoundException("Usuario no encontrado"));

        user.setName(userDTO.getName());
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        return Mapper.toDTO(userRepository.save(user));
    }

    @Override
    public void deleteUser(Long id) {
        if (!userRepository.existsById(id))
            throw new NotFoundException("Usuario no encontrado");

        userRepository.deleteById(id);
    }
}
