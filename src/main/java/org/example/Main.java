package org.example;

import org.example.task1.Student;
import org.example.task2.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        Student student = Student.builder()
//                .firstName("S")
//                .lastName("H")
//                .age(18)
//                .gender("")
//                .courses(List.of("New Course from List"))
//                .course("New Course")
//                .build();
//        System.out.println(student);
        Client client = Client.builder()
                .name("Name")
                .age(100)
                .email("test@client.mail")
                .build();
        MailCode mailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client,
                client1 -> "Random mail!");

        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);
    }
}