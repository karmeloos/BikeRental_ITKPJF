package bikerental.services;

public interface IEmailSender {
    void sentEmail(String title, String content, String email);
}
