package com.usemanagement.service;

import com.usemanagement.dto.QuoteApiResponseDTO;
import jakarta.mail.MessagingException;

public interface EmailService {

    public String getQuote(String subject , String body , String to) throws MessagingException;
}
