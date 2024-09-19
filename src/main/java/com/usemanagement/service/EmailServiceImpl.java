package com.usemanagement.service;


import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{

    @Autowired
    private JavaMailSender sender;

    @Override
    public String getQuote(String subject , String body , String to) throws MessagingException {

        MimeMessage mimeMessage = sender.createMimeMessage();

        MimeMessageHelper helper =new MimeMessageHelper(mimeMessage);


        helper.setSubject(subject);
        helper.setText(body);
        helper.setTo(to);

        sender.send(mimeMessage);

        return  "mimeMessage";
    }

}
