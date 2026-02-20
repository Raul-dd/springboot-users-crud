package com.Raul_dd.CRUD.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {

    private Long id;
    private String name;
    private String username;
    private String email;
    private String password;

}
