package org.example;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleWriter {

    public void write(String message){
        System.out.println(message);
    }

    public void write(double result){
        System.out.println(result);
    }
}
