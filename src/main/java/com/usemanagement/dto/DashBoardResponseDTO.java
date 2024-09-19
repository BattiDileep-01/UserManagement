package com.usemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DashBoardResponseDTO {

    private Integer id;
    private String quote;
    private String author;
}
