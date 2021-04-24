package bikerental.services;

import bikerental.model.User;

public class EmailSender implements IEmailSender {
    @Override
    public void sentEmail(String title, String content, String email){
        System.out.printf("Sent message to: %s\n%s\n%s\n",  email, title, content);
    };
}
