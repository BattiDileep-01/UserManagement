package com.usemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResetPwdDTO {

    private String email;
    private String oldPwd;
    private String newPwd;
    private String confirmPwd;
}
