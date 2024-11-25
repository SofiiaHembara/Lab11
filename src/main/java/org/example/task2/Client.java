package org.example.task2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.concurrent.atomic.AtomicInteger;
@Data
@Builder
@AllArgsConstructor
public class Client {
//    private  static int counter;
    private static AtomicInteger counter = new AtomicInteger(0);
    private final int id = counter.incrementAndGet();

    private String name;
    private int age;
    private String sex;
    private String email;

    public Client(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

}
