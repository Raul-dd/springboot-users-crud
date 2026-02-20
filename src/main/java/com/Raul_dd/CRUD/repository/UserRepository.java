package com.Raul_dd.CRUD.repository;

import com.Raul_dd.CRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{
}
