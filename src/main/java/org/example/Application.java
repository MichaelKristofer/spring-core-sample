package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Application {

    @Autowired
    private ConsoleReader reader;

    @Autowired
    private ConsoleWriter writer;

    private double sum(double a, double b) {
        return a + b;
    }

    private double div(double a, double b) {
        return a / b;
    }

    private double mul(double a, double b) {
        return a * b;
    }

    private double sub(double a, double b) {
        return a - b;
    }

    public void run() {
        writer.write("Choose and write operation: sum, div, mul, sub");
        String operation = reader.readString();
        writer.write("Write A: ");
        double a = reader.readDouble();
        writer.write("Write B: ");
        double b = reader.readDouble();

        switch (operation) {
            case "sum":
                double sum = sum(a, b);
                writer.write("Result = " + sum);
                break;
            case "mul":
                double mul = mul(a, b);
                writer.write("Result = " + mul);
                break;
            case "div":
                double div = div(a, b);
                writer.write("Result = " + div);
                break;
            case "sub":
                double sub = sub(a, b);
                writer.write("Result = " + sub);
                break;
        }
    }
}
