package com.usemanagement.service;

import com.usemanagement.dto.DashBoardResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DashBoardResponseServiceImpl implements DashBoardResponseService{
    @Override
    public DashBoardResponseDTO getQuote() {

        String url ="hhtp://dummyQuoteAPI";
        RestTemplate rt =new RestTemplate();

        ResponseEntity<DashBoardResponseDTO> forEntity = rt.getForEntity(url, DashBoardResponseDTO.class);
        DashBoardResponseDTO body = forEntity.getBody();
        return body;
    }
}
