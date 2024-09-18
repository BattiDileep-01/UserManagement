package com.usemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDTO {

    private Integer userId;
    private String userName;
    private String email;
    private String pwd;
    private String updatePwd;
    private String phno;
    private Integer countryId;
    private Integer stateId;
    private Integer cityId;
}
