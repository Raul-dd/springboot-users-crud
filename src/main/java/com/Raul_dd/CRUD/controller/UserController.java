package com.Raul_dd.CRUD.controller;

import com.Raul_dd.CRUD.dto.UserDTO;
import com.Raul_dd.CRUD.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> getUser(){
        return ResponseEntity.ok(userService.getUsers());
    }

    @PostMapping
    public ResponseEntity<UserDTO> postUser(@RequestBody UserDTO userDTO){
        UserDTO created = userService.createdUser(userDTO);

        return ResponseEntity.created(URI.create("api/user" + created.getId())).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO){
        return ResponseEntity.ok(userService.updateUser(id,userDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

}
