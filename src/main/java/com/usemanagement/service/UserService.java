package com.usemanagement.service;

import com.usemanagement.dto.LoginDTO;
import com.usemanagement.dto.RegistrationDTO;
import com.usemanagement.dto.UserDTO;

public interface UserService {

    public Boolean register(RegistrationDTO registerdto);

    public UserDTO login(LoginDTO logindto);

}
