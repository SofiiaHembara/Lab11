package org.example.task2;

public class BirthdayMailCode implements MailCode {
    @Override
    public String generate(Client client) {
        return String.format("Dear %s! Happy %d Birthday",
        client.getName(), client.getAge());
    }
}
