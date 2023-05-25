package com.example.emailsender.interfaces;

public interface EmailSenderService {

    void send(String receiver, String subject, String message);

}
