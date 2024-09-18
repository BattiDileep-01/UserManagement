package com.usemanagement.repository;

import com.usemanagement.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity , Integer> {

    public UserEntity findByEmailAndPwd(String email , String pwd);
}
